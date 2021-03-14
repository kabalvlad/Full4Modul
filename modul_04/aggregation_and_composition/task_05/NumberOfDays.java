package by.lecttor.modul_04.aggregation_and_composition.task_05;

import java.util.Random;

/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class NumberOfDays {

	public int[] NumberOfDays = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public int RandNumberOfDays() {
		Random rand = new Random();
		int x = rand.nextInt(NumberOfDays.length - 1);
		return NumberOfDays[x];
	}

}
