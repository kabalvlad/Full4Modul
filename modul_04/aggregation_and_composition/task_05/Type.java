package by.lecttor.modul_04.aggregation_and_composition.task_05;

import java.util.Random;

public class Type {
	public String[] Type = new String[] { "excursion", "treatment", "shopping", "cruise", "relaxation" };

	public String RandType() {
		Random rand = new Random();
		int x = rand.nextInt(Type.length - 1);
		return Type[x];
	}
}
