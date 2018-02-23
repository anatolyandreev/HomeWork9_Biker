package by.htp.biker.model;

public class Gloves extends Equipment {
	
	boolean isShort;

	public Gloves(int size, int weight, int price, boolean isShort) {
		super(size, weight, price);
		this.isShort = isShort;
	}

	public boolean isShort() {
		return isShort;
	}

	public void setShort(boolean isShort) {
		this.isShort = isShort;
	}
	
	// just prints the type of equip
	@Override
	public void printEquipName() {
		System.out.print("Gloves");
	}
	
	@Override
	public String getEquipName(){
		return "Gloves";
	}
	
}
