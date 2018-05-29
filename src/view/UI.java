package view;

import java.util.List;
import java.util.Scanner;

import datamodel.Product;

public class UI {

	// this class interacts with the user and shows him options and gets his
	// inputs

	Scanner scan;

	public void welcome() {
		// TODO Auto-generated method stub
		System.out.print("Welcome to our shop. ");
	}

	public void showOptions(List<Product> products) {
		System.out.println("Please choose the product that you want to buy:");
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getId() + ". " + products.get(i).getName() + "\t"
					+ products.get(i).getPrice() + "$");
		}
		System.out.println("0. Finish");
	}

	public int askForAmount() {
		System.out.println("How many do you want?");
		return (getUserInput());
	}

	public int getUserInput() {

		scan = new Scanner(System.in);

		int userInput = scan.nextInt();

		return userInput;
	}
}
