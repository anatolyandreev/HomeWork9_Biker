package by.htp.biker.runner;

import by.htp.biker.model.Equipment;
import by.htp.biker.model.Gloves;
import by.htp.biker.model.Helmet;
import by.htp.biker.model.Jacket;
import by.htp.biker.model.Motorcyclist;
import by.htp.biker.model.Pants;

public class MainApp {

	public static void main(String[] args) {

		Gloves gloves = new Gloves(9, 400, 250, true);
		Helmet helmet = new Helmet(34, 1500, 90, "MODULAR");
		Jacket jacket = new Jacket(50, 1500, 10, false, "TEXTILE");
		Pants pants = new Pants(50, 1000, 150, false, true);

		Motorcyclist motoMan = new Motorcyclist(gloves, helmet, jacket, pants);
		
		// count total price of motorcycle's equipment set
		System.out.println("The price of all equipment of motorcyclist is $" + motoMan.countPrice() + "\n=============================\n");
		
		// sort the equipment by weight in ascending order
		int i = 1;
		motoMan.sortEquipByWeight();
		System.out.println("Equipment elements sorted by weight in asc order:");
		motoMan.printEquipment("weight");
		System.out.println("============================= \n");
		
		// search for Equipment elements in given price range
		motoMan.searchEquipElementByPriceRange(30, 200);
	}
}
