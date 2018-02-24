package by.htp.biker.runner;

import by.htp.biker.model.Pants;
import by.htp.biker.model.clothes.Equipment;
import by.htp.biker.model.clothes.Gloves;
import by.htp.biker.model.clothes.Helmet;
import by.htp.biker.model.clothes.Jacket;
import by.htp.biker.model.creature.Motorcyclist;
import by.htp.biker.model.creature.MotorcyclistMan;
import by.htp.biker.model.creature.MotorcyclistWooman;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println();

		Gloves gloves = new Gloves(9, 400, 250, true);
		Helmet helmet = new Helmet(34, 1500, 90, "MODULAR");
		Jacket jacket = new Jacket(50, 1500, 10, false, "TEXTILE");
		Pants pants = new Pants(50, 1000, 150, false, true);

		Motorcyclist motoMan = new MotorcyclistMan(gloves, helmet, jacket, pants);
		//Motorcyclist motoWooman = new MotorcyclistWooman();
		
		// count total price of motorcycle's equipment set
		System.out.println("The price of all equipment of motorcyclist is $" + motoMan.countPrice() + "\n=============================\n");
		
		// sort the equipment by weight in ascending order
		int i = 1;
		motoMan.sortEquipByWeight();
		System.out.println("Equipment elements sorted by weight in asc order:");
		motoMan.printEquipmentWithParam("weight");
		System.out.println("============================= \n");
		
		// search for Equipment elements in given price range
		motoMan.searchEquipElementByPriceRange(30, 200);
		
		System.out.println("============================= \n");
		Equipment.printEquipCount();
		MotorcyclistMan.expressYourself();
		MotorcyclistWooman.expressYourself();
	}
}
