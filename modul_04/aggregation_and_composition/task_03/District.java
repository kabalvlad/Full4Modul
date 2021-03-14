package by.lecttor.modul_04.aggregation_and_composition.task_03;

/*
3. Создать объект класса Государство, используя классы Область, Район, Город. 
Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
*/

public class District {

	private String District;
	Citi citi = new Citi();

	public District(String district, String citi) {
		this.District = district;
		this.citi.setCiti(citi);
	}

	public void printCiti() {
		System.out.print(citi.getCiti());
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

}
