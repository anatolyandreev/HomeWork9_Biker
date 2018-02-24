package by.htp.biker.model.creature;

import by.htp.biker.model.Pants;
import by.htp.biker.model.clothes.Gloves;
import by.htp.biker.model.clothes.Helmet;
import by.htp.biker.model.clothes.Jacket;

public class MotorcyclistWooman extends Motorcyclist {

	private static final boolean wooman = true;
	
	public MotorcyclistWooman(){
		motorcyclistCounterWooman++;
	}

	public MotorcyclistWooman(Gloves gloves, Helmet helmet, Jacket jacket, Pants pants) {
		this.gloves = gloves;
		this.helmet = helmet;
		this.jacket = jacket;
		this.pants = pants;
		this.setEquip(gloves, helmet, jacket, pants);
	}
	
	public static boolean isWooman() {
		return wooman;
	}
	
	public static void expressYourself() {
		if (motorcyclistCounterWooman != 0) {
			System.out.println("I'm a wooman!");
		} else {
			System.out.println("There is no wooman motorcyclists :(");
		}
	}
}
