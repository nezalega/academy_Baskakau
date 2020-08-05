package Lesson_5;

public class Deal {

	private Product[] Product;
	private User seller;
	private User buyer;

	public Deal(User seller, User buyer, Product[] Product) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.Product = Product;
	}

	public Product[] getProduct() {
		return Product;
	}

	public void setProduct(Product[] product) {
		Product = product;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}
	public void printDeal() {
		System.out.println(seller.getName() + " " + buyer.getName() + " " + buyer.getType()); // + Product.getPrice());

	}

}
