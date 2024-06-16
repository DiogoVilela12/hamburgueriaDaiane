package database;

import java.sql.ResultSet;
import java.sql.SQLException;

import hambugueriaDaiane.Sanduiche;

public class SanduicheDatabase {
	private DatabaseController DatabaseController;
	
	public void addSanduiche(Sanduiche sanduiche) throws SQLException {

            String sql = "INSERT INTO sanduiches (Id, Nome, Preco) VALUES (?, ?, ?)";

            this.DatabaseController.executeUpdate(sql, sanduiche.getId(), sanduiche.getNome(), sanduiche.getPreco());

            System.out.println("Sanduiche " + sanduiche.getNome() + " adicionado com sucesso!");

    }
	
	
	public void removeSanduiche(int id) throws SQLException {

	    String sql = "DELETE FROM sanduiches WHERE Id = ?";

	    this.DatabaseController.executeUpdate(sql, id);

	    System.out.println("Sanduiche with ID " + id + " removido com sucesso!");
	}

	
	public void updateSanduiche(Sanduiche sanduiche) throws SQLException {

	    String sql = "UPDATE sanduiches SET Nome = ?, Preco = ? WHERE Id = ?";

	    this.DatabaseController.executeUpdate(sql, sanduiche.getNome(), sanduiche.getPreco(), sanduiche.getId());

	    System.out.println("Sanduiche " + sanduiche.getNome() + " atualizado com sucesso!");
	}

	
	public Sanduiche getSanduicheById(int id) throws SQLException {

	    String sql = "SELECT * FROM sanduiches WHERE Id = ?";

	    try (ResultSet rs = this.DatabaseController.executeQuery(sql, id)) {
	        if (rs.next()) {
	            Sanduiche sanduiche = new Sanduiche() {
	                private int id;
					private String nome;
					private double preco;

					@Override
	                public void setId(int id) {
	                    this.id = id;
	                }

	                @Override
	                public int getId() {
	                    return id;
	                }

	                @Override
	                public void setNome(String nome) {
	                    this.nome = nome;
	                }

	                @Override
	                public String getNome() {
	                    return nome;
	                }

	                @Override
	                public void setPreco(double preco) {
	                    this.preco = preco;
	                }

	                @Override
	                public double getPreco() {
	                    return preco;
	                }
	            };

	            sanduiche.setId(rs.getInt("Id"));
	            sanduiche.setNome(rs.getString("Nome"));
	            sanduiche.setPreco(rs.getDouble("Preco"));

	            return sanduiche;
	        } else {
	            System.out.println("Sanduiche with ID " + id + " not found.");
	            return null;
	        }
	    }
	}


}
