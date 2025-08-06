package Encapsluation;
class Product{
	private String productName;
	private double price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;

		}
		else {
			this.price = 0.0;
		}
			
	}
	public void display() {
		System.out.println("product Name: "+productName);
		System.out.println("Price: "+price);

	}
	
}
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setProductName("fan");
		p.setPrice(-1);
		p.display();
	}

}
