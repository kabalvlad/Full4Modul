package by.lecttor.modul_04.aggregation_and_composition.task_05;

import java.util.Random;

/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Transport {

	public String[] Transport = new String[] { "Bus", "Car", "Train", "Airplane" };

	public String RandTransport() {
		Random rand = new Random();
		int x = rand.nextInt(Transport.length - 1);
		return Transport[x];
	}
}
