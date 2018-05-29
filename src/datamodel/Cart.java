package datamodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import database.DatabaseConnection;

public class Cart implements TaxOrDiscount{
	List<Product> purchases = new ArrayList<>();
	DatabaseConnection databaseConnection;

	public void addProductToCart(Product cartItem) {
		databaseConnection = new DatabaseConnection();
		databaseConnection.insetDataIntoCartTable(cartItem.getName(), cartItem.getPrice(), cartItem.getAmount());
	}

	@Override
	public double calulateTaxOrDiscount(int value) {
		// TODO Auto-generated method stub
		double discount = 0.9;
		return value * discount;
	}

}
