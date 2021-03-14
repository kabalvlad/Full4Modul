package by.lecttor.modul_04.aggregation_and_composition.task_02;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля. 
 */

public class Task_02 {

	public static void main(String[] args) {

		Auto a1 = new Auto("OPEL", 1994, 220, "disel", 22);
		
		System.out.println(a1.toString());
		a1.BrandPrint();
		a1.GoAuto();
		a1.Refuel();
		a1.SwapWheel();
		System.out.println(a1.toString());

	}

}
