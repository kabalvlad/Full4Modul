package by.lecttor.modul_04.simplest_classes_and_objects.task_10;

/*
10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Task_10 {

	public static void main(String[] args) {

		String[] Week;
		Airline[] Airlines = new Airline[5];
		Airlines[0] = new Airline("Москва", 737, "SuperJet 20", "22:11",
				new String[] { "Вторник", "Среда", "Суббота" });
		Airlines[1] = new Airline("Минск", 221, "АН - 148", "07:40",
				new String[] { "Понедельник", "Среда", "Воскресенье" });
		Airlines[2] = new Airline("Лондон", 643, "Boing 737", "3:20", new String[] { "Среда", "Суббота" });
		Airlines[3] = new Airline("Париж", 331, "Airbus A210", "19:00",
				new String[] { "Вторник", "Пятницы", "Воскресенье" });
		Airlines[4] = new Airline("Париж", 909, "Airbus A320", "1:55", new String[] { "Пятница" });

		BaseAirline BA = new BaseAirline(Airlines);

		BA.AirlinePrint(Airlines);

		System.out.println();
		System.out.println("Cписок рейсов для заданного пункта назначения");
		System.out.println();
		BA.AirListDest(Airlines);

		System.out.println();
		System.out.println("Cписок рейсов для заданного дня недели");
		System.out.println();
		BA.AirListDOTW(Airlines);

		System.out.println();
		System.out.println("Cписок рейсов для заданного дня недели, время вылета для которых больше заданного");
		System.out.println();
		BA.AirListDOTWTime(Airlines);

	}

}
