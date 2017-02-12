package eg.edu.guc.supermarket.products;

public class DairyProduct extends GroceryProduct{
	FatLevel f;
	
	public DairyProduct(String name, double price, double discount, FatLevel f){
		super(name, price, discount);
		this.f = f;
	}
	
	public String toString(){
		return super.toString() + "Fat Level: " + this.f;
	}
	
	public double getActualPrice(){
		double discountAmount = this.getPrice() * (this.getDiscount()/100);
		return this.getPrice() - discountAmount;
	}

}
