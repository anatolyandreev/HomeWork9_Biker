package by.htp.biker.model.clothes;

public class Equipment {

	private int price;
	private int weight;
	private int sizeNum;
	protected static int counter;
	
	public Equipment(int size, int weight, int price) {
		this.sizeNum = size;
		this.weight = weight;
		this.price = price;
	}
	
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
	
	public void printEquipName() {
		System.out.print("no equip name, this is parent class' object");
	}
	
	public String getEquipName(){
		return "no equip name, this is parent calss' object";
	}
	
	public static void printEquipCount() {
		System.out.println("There was sold " + counter + " items of equipment");
	}

}
