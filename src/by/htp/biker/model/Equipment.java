package by.htp.biker.model;

public class Equipment {
	
	private int price;
	private int weight;
	private int size;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}	
	
	public Equipment(int size, int weight, int price) {
		this.size = size;
		this.weight = weight;
		this.price = price;
	}

}
