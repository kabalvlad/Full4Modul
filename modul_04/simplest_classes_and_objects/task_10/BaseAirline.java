package by.lecttor.modul_04.simplest_classes_and_objects.task_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyInt;
import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;
import by.lecttor.modul_04.simplest_classes_and_objects.task_09.Book;

public class BaseAirline {

	private Airline[] AirLines;

	public BaseAirline(Airline[] airlines) {
		this.AirLines = airlines;
	}

	public Airline[] getAirLines() {
		return AirLines;
	}

	public void AirlinePrint(Airline[] Airlines) {
		for (Airline i : AirLines) {
			System.out.println(i.toString());
		}
	}

	// список рейсов для заданного пункта назначения
	public void AirListDest(Airline[] airlines) {
		String dest;
		boolean needA = false;

		System.out.print("Введите пункт назначения (на русском) >> ");
		dest = InputMyString.inputString();

		for (Airline i : AirLines) {
			if (dest.equals(i.getDestination())) {
				System.out.println(i.toString());
				needA = true;
			}
		}
		if (!needA) {
			System.out.println("Нет таких пунктов назначения");
		}
	}

	// список рейсов для заданного дня недели
	public void AirListDOTW(Airline[] airlines) {
		String dest;
		boolean needA = false;

		System.out.print("Введите день недели (на русском) >> ");
		dest = InputMyString.inputString();

		for (Airline i : AirLines) {
			for (int j = 0; j < i.getDaysOfTheWeek().length; j++) {
				if (dest.equals(i.getDaysOfTheWeek()[j])) {
					System.out.println(i.toString());
					needA = true;
				}
			}
		}
		if (!needA) {
			System.out.println("Нет рейсов на данный день недели");
		}
	}

	// список рейсов для заданного дня недели, время вылета для которых больше
	// заданного.
	@SuppressWarnings("deprecation")
	public void AirListDOTWTime(Airline[] airlines) {
		String dest;
		String needTime; // время для сравнения
		boolean needA = false;
		Date Time = new Date();
		SimpleDateFormat dt = new SimpleDateFormat("KK:mm");

		System.out.print("Введите день недели (на русском) >> ");
		dest = InputMyString.inputString();
		System.out.print("Введите время >> ");
		needTime = InputMyString.inputString();
		try {
			Time = dt.parse(needTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		for (Airline i : AirLines) {
			for (int j = 0; j < i.getDaysOfTheWeek().length; j++) {
				if (dest.equals(i.getDaysOfTheWeek()[j])) {
					Calendar cal1 = Calendar.getInstance();
					Calendar cal2 = Calendar.getInstance();
					cal1.setTime(Time);
					cal2.setTime(i.getDepartureTime());
					if (cal1.get(Calendar.HOUR) < cal2.get(Calendar.HOUR)) {
						System.out.println(i.toString());
						needA = true;
					} else {
						if (cal1.get(Calendar.MINUTE) < cal2.get(Calendar.MINUTE)) {
							System.out.println(i.toString());
							needA = true;
						}
					}
				}
			}
		}
		if (!needA) {
			System.out.println("Нет рейсов на данный день недели и заданного времени");
		}
	}
}
