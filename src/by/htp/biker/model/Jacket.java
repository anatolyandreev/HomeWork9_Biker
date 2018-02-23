package by.htp.biker.model;

public class Jacket extends Equipment {

	boolean hasLiner;
	JacketMaterial jacketMaterial;
	
	public Jacket(int size, int weight, int price, boolean hasLiner, String jacketMaterial) {
		super(size, weight, price);
		this.hasLiner = hasLiner;
		this.jacketMaterial = JacketMaterial.valueOf(jacketMaterial);
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
