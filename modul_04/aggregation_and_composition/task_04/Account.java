package by.lecttor.modul_04.aggregation_and_composition.task_04;

/*
4. Счета. Клиент может иметь несколько счетов в банке.
 Учитывать возможность блокировки/разблокировки счета.
 Реализовать поиск и сортировку счетов. 
 Вычисление общей суммы по счетам. 
 Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Account implements Comparable<Account> {

	private int balance;
	private int id;

	public Account(int id, int balance) {
		this.balance = balance;
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Account arg0) {
		return arg0.getBalance() - this.getBalance();
	}

}
