package by.htp.biker.runner;

import by.htp.biker.model.Gloves;
import by.htp.biker.model.Helmet;
import by.htp.biker.model.Jacket;
import by.htp.biker.model.Motorcyclist;
import by.htp.biker.model.Pants;

public class MainApp {

	public static void main(String[] args) {

		Gloves gloves = new Gloves(9, 400, 50, true);
		Helmet helmet = new Helmet(34, 1500, 200, "MODULAR");
		Jacket jacket = new Jacket(50, 1500, 200, false, "TEXTILE");
		Pants pants = new Pants(50, 1000, 150, false, true);

		Motorcyclist motoMan = new Motorcyclist(gloves, helmet, jacket, pants);
		
		System.out.println(motoMan.countPrice());
		
		System.out.println(motoMan.getGloves().getPrice());

	}
}
