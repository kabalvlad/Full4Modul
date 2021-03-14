package by.lecttor.modul_04.aggregation_and_composition.task_02;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля. 
 */

public class Auto {

	private String Brand;
	private int Year;
	Motor motor;
	Wheel wheel;

	public Auto(String brand, int year, int power, String type, int radius) {
		this.Brand = brand;
		this.Year = year;
		motor = new Motor(power, type);
		wheel = new Wheel(radius);
	}

	public String toString() {
		return String.format("Марка: " + Brand + " Год выпуска: " + " Мощность: " + motor.getPower()
				+ " Тип двигателя: " + motor.getType() + " Размер колес: " + wheel.getRadius());
	}

	public void GoAuto() {
		System.out.println("-------");
		motor.StartMotor();
		System.out.println(" автомобиль едет");
		System.out.println("-------");
	}

	public void Refuel() {
		System.out.println("=======");
		motor.StopMotor();
		System.out.println(" Заправка ");
		System.out.println("=======");
	}

	public void SwapWheel() {
		System.out.println("      ");
		motor.StopMotor();
		wheel.swapWheel();
		System.out.println("      ");
	}

	public void BrandPrint() {
		System.out.println("Марка машины: " + Brand);
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		this.Brand = brand;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		this.Year = year;
	}

}
