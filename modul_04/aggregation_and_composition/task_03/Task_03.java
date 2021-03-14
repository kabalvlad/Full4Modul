package by.lecttor.modul_04.aggregation_and_composition.task_03;

import java.util.ArrayList;

/*
 3. Создать объект класса Государство, используя классы Область, Район, Город. 
 Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
 */

public class Task_03 {

	public static void main(String[] args) {

		// Создание области
		ArrayList<District> Region1 = new ArrayList<District>();
		ArrayList<District> Region2 = new ArrayList<District>();
		ArrayList<District> Region3 = new ArrayList<District>();
		// заполнение районов
		Region1.add(new District("Minski", "Minsk"));
		Region1.add(new District("Gomelski", "Gomel"));
		Region1.add(new District("Moskovski", "Moskva"));
		Region2.add(new District("Kievski", "Kiev"));
		Region2.add(new District("Parishki", "Parish"));
		Region3.add(new District("Londonski", "London"));
		Region3.add(new District("Berlinski", "Berlin"));
		Region3.add(new District("Leninski", "Leningrad"));

		// Создание государтсва
		ArrayList<Region> State = new ArrayList<Region>();
		// Заполнение областей государства
		State.add(new Region(Region1, 80));
		State.add(new Region(Region2, 180));
		State.add(new Region(Region3, 60));
		
		State ES = new State(State);
		ES.Square();
		ES.CountRegion();
		ES.Capital();
		ES.CapitalRegion();
		
		
	}

}
