package by.lecttor.modul_04.aggregation_and_composition.task_05;

import java.util.Random;

import by.lecttor.modul_04.aggregation_and_composition.task_04.Account;

/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Voucher {

	private String Type;
	private String Transport;
	private String Food;
	private int NumberOfDays;
	private int Id;

	Type type = new Type();
	Transport transport = new Transport();
	Food food = new Food();
	NumberOfDays NOD = new NumberOfDays();

	public Voucher(int id, int itype, int itransport, int ifood, int inumberOfDays) {
		this.setId(id);
		this.Type = type.Type[itype - 1];
		this.Transport = transport.Transport[itransport - 1];
		this.Food = food.Food[ifood - 1];
		this.NumberOfDays = NOD.NumberOfDays[inumberOfDays - 1];
	}

	// случайная путёвка
	public Voucher(int id) {
		this.setId(id);
		this.Type = type.RandType();
		this.Transport = transport.RandTransport();
		this.Food = food.RandFood();
		this.NumberOfDays = NOD.RandNumberOfDays();
	}

	// печать путёвки
	public void PrintVoucher() {
		System.out.println("Путёвка №" + getId() + " тип: " + getType() + " транспорт: " + getTransport() + " питание: "
				+ getFood() + " количество дней:" + getNumberOfDays());
	}

	public String getType() {
		return Type;
	}

	public void setTape(String tape) {
		Type = tape;
	}

	public String getTransport() {
		return Transport;
	}

	public void setTransport(String transport) {
		Transport = transport;
	}

	public String getFood() {
		return Food;
	}

	public void setFood(String food) {
		Food = food;
	}

	public int getNumberOfDays() {
		return NumberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		NumberOfDays = numberOfDays;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

}
