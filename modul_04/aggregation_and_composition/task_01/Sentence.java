package by.lecttor.modul_04.aggregation_and_composition.task_01;

import java.util.ArrayList;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.  
 */

public class Sentence {

	private String Sentence = "";

	public Sentence(ArrayList<Word> words) {
		String Sn = "";
		for (Word i : words) {
			Sn += " " + i.getWord();
		}
		this.Sentence = Sn.trim();
		this.Sentence = Sentence + ". ";
	}

	public String getSentence() {
		return Sentence;
	}

}
