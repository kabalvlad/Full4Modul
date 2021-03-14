package by.lecttor.modul_04.simplest_classes_and_objects.task_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {

	private String Destination;
	private int FlightNumber;
	private String AircraftType;
	private Date DepartureTime;
	private String[] DaysOfTheWeek;

	private SimpleDateFormat dt = new SimpleDateFormat("HH:mm"); // для сравнение времени вылета
	private String Dotw; // для выовда массива в то стринг

	public Airline(String destination, int flightNumber, String aircraftType, String departureTime,
			String[] daysOfTheWeek) {
		this.Destination = destination;
		this.FlightNumber = flightNumber;
		this.AircraftType = aircraftType;
		try {
			this.DepartureTime = dt.parse(departureTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.DaysOfTheWeek = daysOfTheWeek;
	}

	private String dotw() {
		String value = "";
		for (String i : DaysOfTheWeek) {
			value = value + " " + i;
		}
		return value;
	}

	public String toString() {
		Dotw = dotw();
		return String.format("Пункт назначения: " + Destination + "| Номер рейса: " + FlightNumber + "| Тип самотёта: "
				+ AircraftType + "| Время вылета: " + dt.format(DepartureTime) + "| Дни недели: " + Dotw);
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		this.Destination = destination;
	}

	public int getFlightNumber() {
		return FlightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.FlightNumber = flightNumber;
	}

	public String getAircraftType() {
		return AircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.AircraftType = aircraftType;
	}

	public Date getDepartureTime() {
		return DepartureTime;
	}

	public void setDepartureTime(String departureTime) {
		try {
			this.DepartureTime = dt.parse(departureTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public String[] getDaysOfTheWeek() {
		return DaysOfTheWeek;
	}

	public void setDaysOfTheWeek(String[] daysOfTheWeek) {
		this.DaysOfTheWeek = daysOfTheWeek;
	}

}
