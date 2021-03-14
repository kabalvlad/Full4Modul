package by.lecttor.modul_03.working_with_regular_expressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2. Дана строка, содержащая следующий текст (xml-документ):
Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
нельзя.
 */

public class Task_02 {

	public static void main(String[] args) {

		String htmLine = "<notes>" + "<note id = \"1\">" + "<to>Вася</to>" + "<from>Света</from>"
				+ "<heading>Напоминание</heading>" + "<body>Позвони мне завтра!</body>" + "</note>"
				+ "<note id = \"2\">" + "<to>Петя</to>" + "<from>Маша</from>" + "<heading>Важное напоминание</heading>"
				+ "<body/>" + "</note>" + "</notes>";

		Matcher m = Pattern.compile("(<(/)?.*?(/)?>)|([А-Я]{1}[а-я\\s]*)").matcher(htmLine);
		ArrayList<String> nodes = new ArrayList<String>();
		while (m.find()) {
			nodes.add(String.format("%s %s", m.group(4) != null ? "содержимое тега"
					: m.group(2) != null ? "тег без тела" : m.group(3) != null ? "закрывающий тег" : "открывающий тег",
					m.group()));
		}
		for (String htm : nodes) {
			System.out.println(htm);
		}

	}

}
