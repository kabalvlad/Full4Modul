package by.lecttor.modul_04.simplest_classes_and_objects.task_09;

/*
9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года
 */

public class Task_09 {

	public static void main(String[] args) {

		Book[] Books = new Book[5];
		Books[0] = new Book(1, "Ryslan i Ludmila", "Pyskin A.S.", "Moskva", 1920, 150, 300, "soft");
		Books[1] = new Book(2, "Borodino", "Lermontov M.U.", "Peterbyrg", 1820, 230, 350, "hard");
		Books[2] = new Book(3, "War and Peace", "Tolstoi L.N.", "Ekaterenbyrg", 2001, 2500, 1500, "hard");
		Books[3] = new Book(4, "Mather", "Gorki M.", "Leningrad", 1935, 600, 1000, "hard");
		Books[4] = new Book(5, "Сhildhood", "Gorki M.", "Moskva", 2020, 102, 330, "soft");

		DataBook dataBooks = new DataBook(Books);

		dataBooks.BooksPrint(Books);
		dataBooks.BookListAutor(Books);
		dataBooks.BookListPublishingHouse(Books);
		dataBooks.BookListYear(Books);

	}
}
