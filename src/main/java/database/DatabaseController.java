package database;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class DatabaseController {

	    private static final String DRIVER = "com.mysql.cj.jdbc.Driver"; // Replace with your actual driver class
	    private static final String URL = "jdbc:mysql://localhost:3306/your_database_name"; // Replace with your database URL
	    private static final String USERNAME = "your_username"; // Replace with your database username
	    private static final String PASSWORD = "your_password"; // Replace with your database password

	    private Connection connection;

	    public  DatabaseController() throws SQLException {
	        connect();
	    }

	    private void connect() throws SQLException {
	        try {
	            Class.forName(DRIVER);
	        } catch (ClassNotFoundException e) {
	            throw new SQLException("Failed to load JDBC driver", e);
	        }
	        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	    }

	    public void executeUpdate(String sql, Object... params) throws SQLException {
	        PreparedStatement statement = connection.prepareStatement(sql);
	        for (int i = 0; i < params.length; i++) {
	            statement.setObject(i + 1, params[i]);
	        }
	        statement.executeUpdate();
	        statement.close();
	    }

	    public ResultSet executeQuery(String sql, Object... params) throws SQLException {
	        PreparedStatement statement = connection.prepareStatement(sql);
	        for (int i = 0; i < params.length; i++) {
	            statement.setObject(i + 1, params[i]);
	        }
	        return statement.executeQuery();
	    }

	    public void close() throws SQLException {
	        if (connection != null) {
	            connection.close();
	        }
	    }
	}

	
