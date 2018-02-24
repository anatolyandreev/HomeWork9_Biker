package by.htp.biker.model;

import by.htp.biker.model.clothes.Equipment;

public class Pants extends Equipment {

	boolean isWaterProof;
	boolean hasLiner;
	
	public Pants(int size, int weight, int price, boolean isWaterProof, boolean hasLiner) {
		super(size, weight, price);
		this.hasLiner = hasLiner;
		this.isWaterProof = isWaterProof;
		counter++;
	}
	
	// just prints the type of equip
	@Override
	public void printEquipName() {
		System.out.print("Pants");
	}
	
	@Override
	public String getEquipName(){
		return "Pants";
	}

}
