package by.htp.biker.model;

public class Equipment {

	private int price;
	private int weight;
	private int sizeNum;
	// private String sizeLetter; //можно ли сделать в классе только один
	// геттер, если размер у нас может задавать цифрой или буквой, так, чтобы по
	// вызову getSize, автоматически возвращалась или строка или цифра, в
	// зависимости от того, что было задано ранее

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

//	public void setSize(String size) {
//		this.sizeLetter = size;
//	}

	public Equipment(int size, int weight, int price) {
		this.sizeNum = size;
		this.weight = weight;
		this.price = price;
	}

	//TODO попытка перегрузить конструктор, если я решу задавать размер буквой
//	public Equipment(String size, int weight, int price) {
//		this.sizeLetter = size;
//		this.weight = weight;
//		this.price = price;
//	}

}
