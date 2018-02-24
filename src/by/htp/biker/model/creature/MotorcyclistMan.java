package by.htp.biker.model.creature;

import by.htp.biker.model.Pants;
import by.htp.biker.model.clothes.Gloves;
import by.htp.biker.model.clothes.Helmet;
import by.htp.biker.model.clothes.Jacket;

public class MotorcyclistMan extends Motorcyclist{
	
	private static final boolean man = true;

	public MotorcyclistMan(){
		motorcyclistCounterMan++;
	}
	
	public MotorcyclistMan(Gloves gloves, Helmet helmet, Jacket jacket, Pants pants) {
		this.gloves = gloves;
		this.helmet = helmet;
		this.jacket = jacket;
		this.pants = pants;
		this.setEquip(gloves, helmet, jacket, pants);
		motorcyclistCounterMan++;
		}
	
	public static boolean isMan() {
		return man;
	}
	
	public static void expressYourself() {
		if (motorcyclistCounterMan != 0) {
		System.out.println("I'm a man!");
		} else {
			System.out.println("There is no man motorcyclists :(");
		}
	}

}
