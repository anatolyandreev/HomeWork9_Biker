package by.htp.biker.model;

import java.util.logging.Logger;

public class Jacket extends Equipment {

	boolean hasLiner;
	JacketMaterial jacketMaterial;
	
	public Jacket(int size, int weight, int price, boolean hasLiner, String jacketMaterial) {
		super(size, weight, price);
		this.hasLiner = hasLiner;
		try {
		this.jacketMaterial = JacketMaterial.valueOf(jacketMaterial);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid parameter for jacket material, should be 'LEATHER' or 'TEXTILE'");
		}
	}
	
	// just prints the type of equip
	@Override
	public void printEquipName() {
		System.out.print("Jacket");
	}
	
	@Override
	public String getEquipName(){
		return "Jacket";
	}

}
