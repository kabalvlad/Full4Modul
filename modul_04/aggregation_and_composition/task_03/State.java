package by.lecttor.modul_04.aggregation_and_composition.task_03;

import java.util.ArrayList;

/*
3. Создать объект класса Государство, используя классы Область, Район, Город. 
Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
*/

public class State {
	private ArrayList<Region> State;

	public State(ArrayList<Region> regions) {
		this.State = regions;
	}

	public void CapitalRegion() {
		System.out.print("Областные центры: ");
		for (Region i : State) {
			System.out.print(i.getDistricts().get(0).citi.getCiti() + " ");
		}
	}

	public void Capital() {
		System.out.println("Столица государтсва " + State.get(0).getDistricts().get(0).citi.getCiti());
	}

	public void CountRegion() {
		System.out.println("Количество областей " + State.size());
	}

	public void Square() {
		int Sq = 0;
		for (Region i : State) {
			Sq += i.getArea();
		}
		System.out.println("Площадь государства " + Sq + " квадратных километров");
	}

	public ArrayList<Region> getState() {
		return State;
	}

	public void setState(ArrayList<Region> state) {
		this.State = state;
	}

}
