package Lesson_4;

public class Man {

	public static void main (String [] args) {
		
		Product product = new Product("Laptop", 1000, 4);
	
		System.out.println(product.getPrice() + " " + product.getName()); 
		
		product.setName("Apple");
		product.setPrice(777);
		product.setQuantity(10);
		
		System.out.println(product.getName() + " " + product.getPrice() + " " + product.getDiscount()); 
		
	
	}
	
}
