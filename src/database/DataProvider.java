package database;

public class DataProvider {

	DatabaseConnection databaseConnection;

	public DataProvider() {

		databaseConnection = new DatabaseConnection();

		// Connect to the database and create a table named Products
		databaseConnection.createProductsTable();

		databaseConnection.insetDataIntoProductTable(databaseConnection.getProductTableName(), "Monitor", 350);
		databaseConnection.insetDataIntoProductTable(databaseConnection.getProductTableName(), "Television", 800);
		databaseConnection.insetDataIntoProductTable(databaseConnection.getProductTableName(), "Keyboard", 100);
		databaseConnection.insetDataIntoProductTable(databaseConnection.getProductTableName(), "Mouse", 50);
		databaseConnection.insetDataIntoProductTable(databaseConnection.getProductTableName(), "Laptop", 1000);

		databaseConnection.createCartTable();
	}

}
