package hambugueriaDaiane;

public abstract class Sanduiche {
	private int Id;
	private String Nome;
	private double Preco;
	
	public Sanduiche(String nome, double d, int id) {
		this.Id = id;
		this.Nome = nome;
		this.Preco = d;
	}
	
	public Sanduiche() {
		
	}

	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		this.Id = id;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public double getPreco() {
		return Preco;
	}
	
	public void setPreco(double preco) {
		this.Preco = preco;
	}
}
