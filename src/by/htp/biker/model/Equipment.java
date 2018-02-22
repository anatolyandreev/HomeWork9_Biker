package by.htp.biker.model;

public class Equipment {

	private int price;
	private int weight;
	private int sizeNum;
	
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
		return sizeNum;
	}

	public void setSize(int size) {
		this.sizeNum = size;
	}

	public Equipment(int size, int weight, int price) {
		this.sizeNum = size;
		this.weight = weight;
		this.price = price;
	}

}
