package by.lecttor.modul_04.aggregation_and_composition.task_03;

import java.util.ArrayList;

/*
3. Создать объект класса Государство, используя классы Область, Район, Город. 
Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
*/

public class Region {
	private ArrayList<District> Districts;
	private int Area;

	public Region(ArrayList<District> districts, int area) {
		this.Area = area;
		this.Districts = districts;
	}

	public int getArea() {
		return Area;
	}

	public void setArea(int area) {
		this.Area = area;
	}

	public ArrayList<District> getDistricts() {
		return Districts;
	}

	public void setDistricts(ArrayList<District> districts) {
		this.Districts = districts;
	}

}
