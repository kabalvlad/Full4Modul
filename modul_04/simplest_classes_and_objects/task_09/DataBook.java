package by.lecttor.modul_04.simplest_classes_and_objects.task_09;

import by.lecttor.modul_04.simplest_classes_and_objects.InputMyInt;
import by.lecttor.modul_04.simplest_classes_and_objects.InputMyString;

public class DataBook {
	private Book[] Books;

	public Book[] getBooks() {
		return Books;
	}

	public DataBook(Book[] books) {
		this.Books = books;
	}

	// список книг после заданного года
	public void BookListYear(Book[] books) {
		int Year;
		boolean needA = false;
		InputMyInt IYI = new InputMyInt();

		System.out.print("Введите год после которого печатались книги >> ");
		IYI.setJ(0);
		Year = IYI.inputInteger();

		for (Book i : books) {
			if (Year < i.getYearOfPublication()) {
				System.out.println(i.toString());
				needA = true;
			}
		}
		if (!needA) {
			System.out.println("Таких книг нет.");
		}
	}

	// список книг задоого атора
	public void BookListAutor(Book[] books) {
		String TitleAuthor;
		boolean needAuthor = false;

		System.out.print("Введите автора которого вы ищите>> ");
		TitleAuthor = InputMyString.inputString();

		for (Book i : books) {
			if (TitleAuthor.equals(i.getAuthor())) {
				System.out.println(i.toString());
				needAuthor = true;
			}
		}
		if (!needAuthor) {
			System.out.println("Данного автора нет в списке книг.");
		}
	}

	// список книг издательства
	public void BookListPublishingHouse(Book[] books) {
		String TitlePublishingHouse;
		boolean needA = false;

		System.out.print("Введите издательство которое вы ищите>> ");
		TitlePublishingHouse = InputMyString.inputString();

		for (Book i : books) {
			if (TitlePublishingHouse.equals(i.getPublishingHouse())) {
				System.out.println(i.toString());
				needA = true;
			}
		}
		if (!needA) {
			System.out.println("Данного издательства нет в списке книг.");
		}
	}

	// печать массива
	public void BooksPrint(Book[] books) {
		for (Book i : books) {
			System.out.println(i.toString());
		}
	}

}
