package by.htp.biker.logic;

import by.htp.biker.model.clothes.Equipment;
import by.htp.biker.model.creature.Motorcyclist;

public interface EquipmentOperations {
	
	// is this necessary to explicitly make method as abastract or
	// this is obviously that the method described in interface is abstract by its nature
	// and there is no need to type "abstract" when I declare method?
	public abstract int countPrice();

	public abstract void sortEquipByWeight();

	public abstract void searchEquipElementByPriceRange(int a, int b);
	
}
