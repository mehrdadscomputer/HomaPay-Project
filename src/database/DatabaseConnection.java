package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import datamodel.Product;

public class DatabaseConnection {

	List<Product> products = new ArrayList<>();

	final String PRODUCT_TABLE_NAME = "Products";
	final String Cart_TABLE_NAME = "Cart";

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String DB_URL = "jdbc:h2:~/test8";

	// Database credentials
	static final String USER = "mehrdad";
	static final String PASS = "46527072";

	Connection conn = null;
	Statement stmt = null;

	public DatabaseConnection() {
		
/*		try {
			// STEP 1: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 2: Open a connection
			//System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		}*/

	}

	public void createProductsTable() {

		try {
			// STEP 1: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 2: Open a connection
			//System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			// STEP 3: Execute a query
			//System.out.println("Creating table in given database...");
			stmt = conn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS " + PRODUCT_TABLE_NAME + " (id INTEGER not NULL auto_increment, "
					+ " name VARCHAR(255), " + " price INTEGER, " + " PRIMARY KEY ( id ))";
			stmt.executeUpdate(sql);
			//System.out.println("Created table in given database...");

			// STEP 4: Clean-up environment
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		//System.out.println("Goodbye!");
	}

	public void createCartTable() {
		try {
			// STEP 1: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 2: Open a connection
			//System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			// STEP 3: Execute a query
			//System.out.println("Creating table in given database...");
			stmt = conn.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS " + Cart_TABLE_NAME + " (id INTEGER not NULL auto_increment, "
					+ " name VARCHAR(255), " + " price INTEGER, " + " amount INTEGER, " + " PRIMARY KEY ( id ))";
			stmt.executeUpdate(sql);
			//System.out.println("Created table in given database...");

			// STEP 4: Clean-up environment
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		//System.out.println("Goodbye!");
	}

	public void insetDataIntoProductTable(String tableName, String name, int price) {
		try {
			// STEP 1: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 2: Open a connection
			//System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			// STEP 3: Execute a query
			stmt = conn.createStatement();
			String sql = "INSERT INTO " + tableName + " VALUES (NULL" + ",'" + name + "'," + price + ")";

			stmt.executeUpdate(sql);
			//System.out.println("Inserted records into the table...");

			// STEP 4: Clean-up environment
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		//System.out.println("Goodbye!");
	}

	public void insetDataIntoCartTable(String name, int price, int amount) {
		//Connection conn = null;
		//Statement stmt = null;
		try {
			// STEP 1: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 2: Open a connection
			//System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			// STEP 3: Execute a query
			stmt = conn.createStatement();
			String sql = "INSERT INTO " + Cart_TABLE_NAME + " VALUES (NULL" + ",'" + name + "'," + price + "," + amount + ")";

			stmt.executeUpdate(sql);
			//System.out.println("Inserted records into the table...");

			// STEP 4: Clean-up environment
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		//System.out.println("Goodbye!");
	}

	public List<Product> getProducts() {
		//Connection conn = null;
		//Statement stmt = null;
		try {
			// STEP 1: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 2: Open a connection
			//System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			// STEP 3: Execute a query
			//System.out.println("Connected database successfully...");
			stmt = conn.createStatement();
			String sql = "SELECT * FROM products";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 4: Extract data from result set
			while (rs.next()) {
				Product product = new Product();
				// Retrieve by column name
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				products.add(product);
			}
			// STEP 5: Clean-up environment
			rs.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		//System.out.println("Goodbye!");
		return products;
	}

	public String getProductTableName() {
		return PRODUCT_TABLE_NAME;
	}

	public String getCartTableName() {
		return Cart_TABLE_NAME;
	}

}