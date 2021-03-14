package by.lecttor.modul_04.aggregation_and_composition.task_05;

import java.util.Random;

/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Food {

	public String[] Food = new String[] { "AI", "UAI", "PremiumAI", "SoftAI" };

	public String RandFood() {
		Random rand = new Random();
		int x = rand.nextInt(Food.length - 1);
		return Food[x];
	}

}
