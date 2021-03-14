package by.lecttor.modul_04.aggregation_and_composition.task_04;

import java.util.ArrayList;
import java.util.Collections;
import by.lecttor.modul_04.aggregation_and_composition.InputMyInt;

/*
4. Счета. Клиент может иметь несколько счетов в банке.
Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. 
Вычисление общей суммы по счетам. 
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
*/

public class Person {

	private ArrayList<Account> Accounts;
	private String Name;
	private String SurName;
	private ArrayList<Account> BanAccounts = new ArrayList<Account>();

	// конструктор
	public Person(String name, String surName, ArrayList<Account> Accounts) {
		this.Name = name;
		this.SurName = surName;
		this.Accounts = Accounts;
	}

	// блокировка счета
	public void Ban() {
		int Id;
		boolean check = true;
		System.out.println("Введите номер счета для блокировки >> ");
		Id = InputMyInt.inputInt();
		for (Account i : Accounts) {
			if (i.getId() == Id) {
				BanAccounts.add(i);
				Accounts.remove(i);
				check = false;
				System.out.println("Счет номер " + Id + " найден.");
				break;
			}

		}
		if (check) {
			System.out.println("Счет c номером " + Id + " не найден.");
		}
	}

	//
	public void UnBan() {
		int Id;
		boolean check = true;
		System.out.println("Введите номер счета для разблокировки >> ");
		Id = InputMyInt.inputInt();
		for (Account i : BanAccounts) {
			if (i.getId() == Id) {
				Accounts.add(i);
				BanAccounts.remove(i);
				check = false;
				System.out.println("Счет номер " + Id + " найден.");
				break;
			}

		}
		if (check) {
			System.out.println("Счет c номером " + Id + " не найден.");
		}

	}

	// поиск счета
	public void search() {
		int Id;
		boolean check = true;
		System.out.println("Введите номер счета >> ");
		Id = InputMyInt.inputInt();
		for (Account i : Accounts) {
			if (i.getId() == Id) {
				System.out.println("Счет номер " + Id + " найден.");
				System.out.println("Его баланс равен: " + i.getBalance());
				check = false;
			}

		}
		if (check) {
			System.out.println("Счет c номером " + Id + " не найден.");
		}
	}

	// сортировка счетов
	public void sortAccount() {
		Collections.sort(Accounts);
	}

	// Вычисление общей суммы по счетам.
	public void AmountOnAccounts() {
		int sum = 0;
		for (Account i : Accounts) {
			sum += i.getBalance();
		}
		System.out.println("Общая сумма по всем счетам " + sum + " кубриков");
	}

	// Вычисление суммы по всем счетам, имеющим положительный и отрицательный
	// балансы отдельно.
	public void AmountOnAccountsPositiveNegative() {
		int sumP = 0;
		int sumN = 0;
		for (Account i : Accounts) {
			if (i.getBalance() >= 0) {
				sumP += i.getBalance();
			} else {
				sumN += i.getBalance();
			}
		}
		System.out.println("Общая сумма по всем счетам имеющие положительный баланс: " + sumP + " кубриков");
		System.out.println("Общая сумма по всем счетам имеющие отрицательный баланс: " + sumN + " кубриков");
	}

	public void printPer() {
		System.out.println("Владелец: " + Name + " " + SurName);
		System.out.println("Количество счетов: " + (Accounts.size() + BanAccounts.size()));
		System.out.println("Количество разблокированных счетов: " + Accounts.size());
		System.out.println("Количество заблокированны счетов: " + BanAccounts.size());
		for (Account i : Accounts) {
			System.out.println("Номер счета: " + i.getId() + " баланс " + i.getBalance());
		}
	}

	public String getSurName() {
		return SurName;
	}

	public void setSurName(String surName) {
		this.SurName = surName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public ArrayList<Account> getAccounts() {
		return Accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.Accounts = accounts;
	}

}
