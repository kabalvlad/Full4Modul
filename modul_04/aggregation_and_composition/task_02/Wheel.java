package by.lecttor.modul_04.aggregation_and_composition.task_02;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyInt;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля. 
 */

public class Wheel {

	private int Radius;

	public void swapWheel() {

		System.out.println("Смена колёс");
		System.out.print("Введите размер новых колёс>> ");
		this.Radius = InputMyInt.inputInt();

	}

	public Wheel(int radius) {
		this.Radius = radius;
	}

	public void setRadius(int radius) {
		this.Radius = radius;
	}

	public int getRadius() {
		return Radius;
	}

}
