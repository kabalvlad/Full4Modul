package by.lecttor.modul_04.aggregation_and_composition.task_01;

import java.util.ArrayList;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста. 
 */

public class Task_01 {

	public static void main(String[] args) {
		ArrayList<Word> Words1 = new ArrayList<Word>();
		Words1.add(new Word("Жили"));
		Words1.add(new Word("были"));
		Words1.add(new Word("два"));
		Words1.add(new Word("кита"));

		ArrayList<Word> Words2 = new ArrayList<Word>();
		Words2.add(new Word("Жили"));
		Words2.add(new Word("они"));
		Words2.add(new Word("в"));
		Words2.add(new Word("море"));

		ArrayList<Sentence> Sentences = new ArrayList<Sentence>();
		Sentences.add(new Sentence(Words1));
		Sentences.add(new Sentence(Words2));

		Text Texts = new Text("Сказ", Sentences);

		Texts.PrintTitle();
		Texts.PrintText();
		Texts.AddText("Малый поврослел.");
		Texts.PrintText();

	}
}
