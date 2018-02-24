package by.htp.biker.model.clothes;

public class Helmet extends Equipment {
	
	private HelmetType helmetType;

	public Helmet(int size, int weight, int price, String helmetType) {
		super(size, weight, price);
		try {
		this.helmetType = HelmetType.valueOf(helmetType);
		} catch (IllegalArgumentException e) {System.out.println("Invalid parameter for helmet type, should be 'FOR_THIRDS' or 'INTEGRAL' OR 'MODULAR'");}
		counter++;
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
