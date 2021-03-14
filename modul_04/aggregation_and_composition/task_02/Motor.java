package by.lecttor.modul_04.aggregation_and_composition.task_02;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля. 
 */

public class Motor {

	private int Power;
	private String Type;

	public Motor(int power, String type) {
		this.Power = power;
		this.Type = type;
	}

	public void StartMotor() {
		System.out.println("Запуск мотора");
	}

	public void StopMotor() {
		System.out.println("Остановка мотора");
	}

	public int getPower() {
		return Power;
	}

	public void setPower(int power) {
		Power = power;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

}
