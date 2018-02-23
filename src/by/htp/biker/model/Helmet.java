package by.htp.biker.model;

public class Helmet extends Equipment {
	
	private HelmetType helmetType;

	public Helmet(int size, int weight, int price, String helmetType) {
		super(size, weight, price);
		this.helmetType = HelmetType.valueOf(helmetType);
	}
	
	// just prints the type of equip
	@Override
	public void printEquipName() {
		System.out.print("Helmet");
	}

	@Override
	public String getEquipName(){
		return "Helmet";
	}
}
