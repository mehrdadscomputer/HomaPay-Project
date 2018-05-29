package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.h2.engine.Database;

import database.DataProvider;
import database.DatabaseConnection;
import datamodel.Cart;
import datamodel.Product;
import view.UI;

public class Main {

	public static void main(String[] args) {

		// initialization
		Cart cart = new Cart();
		UI ui = new UI();

		DataProvider dataProvider = new DataProvider();
		DatabaseConnection databaseConnection = new DatabaseConnection();

		List<Product> products = new ArrayList<>();
		List<Product> cartItems = new ArrayList<>();

		int userInput;
		int amount;

		products = databaseConnection.getProducts();
		// we should delete previously deleted items (to ba addad)
		
		ui.welcome();

		//loop until user says finish!
		while (true) {
			ui.showOptions(products);
			int n = ui.getUserInput();
			if (n == 0) break;
			amount = ui.askForAmount();
			Product cartItem = products.get(n-1);
			cartItem.setAmount(amount);
			cartItems.add(cartItem);
			cart.addProductToCart(cartItem);
		}
		
	}
}
