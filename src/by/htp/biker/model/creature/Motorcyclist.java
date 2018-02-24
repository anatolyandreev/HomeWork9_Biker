package by.htp.biker.model.creature;

import by.htp.biker.logic.EquipmentOperations;
import by.htp.biker.model.Pants;
import by.htp.biker.model.clothes.Equipment;
import by.htp.biker.model.clothes.Gloves;
import by.htp.biker.model.clothes.Helmet;
import by.htp.biker.model.clothes.Jacket;

public abstract class Motorcyclist implements EquipmentOperations {
	protected Gloves gloves;
	protected Helmet helmet;
	protected Jacket jacket;
	protected Pants pants;
	protected Equipment[] equip;
	protected static int motorcyclistCounterMan;
	protected static int motorcyclistCounterWooman;
	
	// overloaded constuctor
	public Motorcyclist() {	};
	
	// overloaded constuctor
	public Motorcyclist(Equipment[] equip) {
		this.equip = equip;
	}

	// overloaded constuctor
	public Motorcyclist(Gloves gloves, Helmet helmet, Jacket jacket, Pants pants) {
		this.gloves = gloves;
		this.helmet = helmet;
		this.jacket = jacket;
		this.pants = pants;
		this.setEquip(gloves, helmet, jacket, pants);
	}

	public Gloves getGloves() {
		return gloves;
	}

	public void setGloves(Gloves gloves) {
		this.gloves = gloves;
	}

	public Helmet getHelmet() {
		return helmet;
	}

	public void setHelmet(Helmet helmet) {
		this.helmet = helmet;
	}

	public Jacket getJacket() {
		return jacket;
	}

	public void setJacket(Jacket jacket) {
		this.jacket = jacket;
	}

	public Pants getPants() {
		return pants;
	}

	public void setPants(Pants pants) {
		this.pants = pants;
	}

	public Equipment[] getEquip() {
		return equip;
	}

	public void setEquip(Equipment[] equip) {
		this.equip = equip;
	}

	// overloading method setEquip
	public void setEquip(Gloves gloves, Helmet helmet, Jacket jacket, Pants pants) {
		this.equip = new Equipment[4];
		this.equip[0] = gloves;
		this.equip[1] = helmet;
		this.equip[2] = jacket;
		this.equip[3] = pants;
	}

	// here some unknown shit happens
	@Override
	public int countPrice() {
		int totalPrice = 0;
		if (this.getEquip() != null) {
			for (Equipment equip : this.getEquip()) {
				totalPrice += equip.getPrice();
			}
		}
		return totalPrice;
	}

	// sort equipment with insertions alogrithm
	// @Override
	// public void sortEquipByWeight() {
	// int j, tempInt;
	// Equipment temp;
	// for (int i = 0; i < this.getEquip().length - 1; i++) {
	// if (this.getEquip()[i].getWeight() > getEquip()[i + 1].getWeight()) {
	// temp = this.getEquip()[i + 1];
	// tempInt = this.getEquip()[i + 1].getWeight();
	// this.getEquip()[i + 1] = this.getEquip()[i];
	// j = i;
	// while (j > 0 && tempInt < this.getEquip()[j - 1].getWeight()) {
	// this.getEquip()[j] = this.getEquip()[j - 1];
	// j--;
	// }
	// }
	// }
	// }

	// bubble sort by weight in asc order
	@Override
	public void sortEquipByWeight() {
		for (int i = this.getEquip().length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (this.getEquip()[j].getWeight() > this.getEquip()[j + 1].getWeight()) {
					Equipment eq = this.getEquip()[j + 1];
					this.getEquip()[j + 1] = this.getEquip()[j];
					this.getEquip()[j] = eq;
				}
			}
		}
	}

	// search all equipment elements that are in the range of prices a - low, b
	// - high
	// TODO upgrade this method so it will return the array of the Equipment
	// objects that match the condition
	@Override
	public void searchEquipElementByPriceRange(int a, int b) {
		Equipment[] eqTemp = new Equipment[1];
		for (int i = 0; i < this.getEquip().length; i++) {
			if (this.getEquip()[i].getPrice() >= a && this.getEquip()[i].getPrice() <= b) {
				// this.getEquip()[i].printEquipName();
				System.out.println(i + ") " + this.getEquip()[i].getEquipName() + " $" + this.getEquip()[i].getPrice());
			}
		}
	}
	
	// prints all elements of Equipment depending of parameter of Equipment is
	// requested
	public void printEquipmentWithParam(String s) {
		int i = 1;
		switch (s) {
		case "price":
			for (Equipment eq : this.getEquip()) {
				System.out.println(i + ") " + eq.getEquipName() + " $" + eq.getPrice());
				i++;
				break;
			}
		case "weight":
			for (Equipment eq : this.getEquip()) {
				System.out.println(i + ") " + eq.getEquipName() + " " + eq.getWeight() + "gr");
				i++;
			}
			break;
		case "size":
			for (Equipment eq : this.getEquip()) {
				System.out.println(i + ") " + eq.getEquipName() + " size = " + eq.getSize());
				i++;
			}
			break;
		default:
			System.out.println("Error input parameter for printEquipment. Enter 'price', 'weight' or 'size'");
			break;
		}
	}
	
	//public abstract void expressYourself();
}
