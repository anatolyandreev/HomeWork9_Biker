package by.htp.biker.model;

import by.htp.biker.logic.EquipmentOperations;

public class Motorcyclist implements EquipmentOperations {
	private Gloves gloves;
	private Helmet helmet;
	private Jacket jacket;
	private Pants pants;
	private Equipment[] equip;

	public Motorcyclist() {
	};

	public Motorcyclist(Equipment[] equip) {
		this.equip = equip;
	}

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

	public void setEquip(Gloves gloves, Helmet helmet, Jacket jacket, Pants pants) {
		this.equip = new Equipment[4];
		this.equip[0] = gloves;
		this.equip[1] = helmet;
		this.equip[2] = jacket;
		this.equip[3] = pants;
	}

	//здесь происходит какая-то дичь
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

}
