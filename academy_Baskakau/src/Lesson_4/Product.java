package Lesson_4;

public class Product {

   private String name = "Dell";
 private double price;
   double discount;
   int quantity;
   
   
   
   public Product(String name, double price, int quantity) {
	super();
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price*quantity;
}
public void setPrice(double price) {
	this.price = price;
}
public double getDiscount() {
	
	discount = price/quantity;
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}

}
