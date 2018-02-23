package by.htp.biker.logic;

import by.htp.biker.model.Equipment;
import by.htp.biker.model.Motorcyclist;

public interface EquipmentOperations {

	public int countPrice();

	public void sortEquipByWeight();

	public void searchEquipElementByPriceRange(int a, int b);
	
}
