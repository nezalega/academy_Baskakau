package Lesson_5;

public class Main {

	public static void main(String[] args) {

		User seller = new User("Ivanov", "Vrach");
		User buyer = new User("Petrov", "Stroitel'");
		Product[] products = { new Product(100, "ds") };

		Deal deal1 = new Deal(seller, buyer, products);

	
		
	//	System.out.println(Deal.printDeal);
		// System.out.println(products.price);
	}

}
