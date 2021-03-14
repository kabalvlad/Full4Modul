package by.lecttor.modul_04.aggregation_and_composition.task_01;

import java.util.ArrayList;

/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.  
 */

public class Text {

	private String Title;
	private String Text;

	public Text(String title, ArrayList<Sentence> sentences) {
		String tx = "";
		for (Sentence i : sentences) {
			tx += i.getSentence();
		}
		this.Text = tx.trim();
		this.Title = title;
	}

	public void AddText(String text) {
		this.Text += " " + text;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	public void PrintTitle() {
		System.out.println(Title);
	}

	public void PrintText() {
		System.out.println(Text);
	}

}
