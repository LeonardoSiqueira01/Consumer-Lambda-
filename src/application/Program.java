package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("mouse", 50.00));
		list.add(new Product("hd case", 80.90));
		list.add(new Product("Tablet", 450.00));

		Consumer<Product> coms = p -> p.setPrice(p.getPrice() * 1.1);

		list.forEach(coms);

		list.forEach(System.out::println);
	}
}