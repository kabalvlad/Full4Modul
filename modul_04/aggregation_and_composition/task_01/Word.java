package by.lecttor.modul_04.aggregation_and_composition.task_01;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста. 
 */

public class Word {

	private String Word;

	public String getWord() {
		return Word;
	}

	public Word(String word) {
		this.Word = word;
	}

}
