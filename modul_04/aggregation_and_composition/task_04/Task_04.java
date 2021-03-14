package by.lecttor.modul_04.aggregation_and_composition.task_04;

import java.util.ArrayList;

/*
4. Счета. Клиент может иметь несколько счетов в банке.
 Учитывать возможность блокировки/разблокировки счета.
 Реализовать поиск и сортировку счетов. 
 Вычисление общей суммы по счетам. 
 Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Task_04 {

	public static void main(String[] args) {

		ArrayList<Account> A1 = new ArrayList<Account>();
		A1.add(new Account(22, 934));
		A1.add(new Account(12, -934));
		A1.add(new Account(14, 4));
		A1.add(new Account(17, 9000));
		A1.add(new Account(1, -6000));
		A1.add(new Account(3, 22));
		A1.add(new Account(6, 167));
		A1.add(new Account(2, -217));
		A1.add(new Account(33, 332));

		Person p1 = new Person("Igor", "Ivanovich", A1);
		
		//печать счетов
		p1.printPer();
		System.out.println(" ");
		//поиск счета
		p1.search();
		System.out.println(" ");
		
		//блокировка счета
		p1.Ban();
		p1.printPer();
		System.out.println(" ");
		
		//Разблокировка счета
		p1.UnBan();
		System.out.println(" ");
		p1.printPer();
		System.out.println(" ");
		
		//сортировка счета
		System.out.println(" сортировка счетов ");
		p1.sortAccount();
		p1.printPer();
		System.out.println(" ");
		
		//Вычисление общей суммы по счетам. 
		p1.AmountOnAccounts();
		System.out.println(" ");
		
		//Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
		p1.AmountOnAccountsPositiveNegative();
		System.out.println(" ");
	}

}
