package view;

import java.util.List;
import java.util.Scanner;

import datamodel.Product;
import datamodel.TaxOrDiscount;

public class UI implements TaxOrDiscount {

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
	
	public void showCartSummary(List<Product> products){
		double sum = 0;
		System.out.println("Summary of the purchase is:");
		System.out.println("-------------------------------------------");
		System.out.println("Name"+"     "+"In"+"      "+"Amount"+"     "+"Cost");
		
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getName();
			int price = products.get(i).getPrice();
			int amount = products.get(i).getAmount();
			
			System.out.println(name+"     "+price+"$     "+amount+"     "+(price*amount));
			sum = sum + price*amount;
		}
		sum = calulateTaxOrDiscount(sum);
		System.out.println("The total cost is: "+sum);
	}

	@Override
	public double calulateTaxOrDiscount(double value) {
		// TODO Auto-generated method stub
		double discount = 0.9;
		return value * discount;
	}
}
