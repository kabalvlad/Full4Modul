package by.lecttor.modul_04.aggregation_and_composition.task_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import by.lecttor.modul_04.aggregation_and_composition.InputMyInt;

/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Task_05 {

	public static void main(String[] args) {

		ArrayList<Voucher> Vouchers = new ArrayList<Voucher>();
		Vouchers.add(new Voucher(1, 1, 1, 3, 9));
		Vouchers.add(new Voucher(2, 2, 2, 4, 2));
		Vouchers.add(new Voucher(3, 2, 3, 1, 3));
		Vouchers.add(new Voucher(4, 4, 4, 2, 4));
		Vouchers.add(new Voucher(5, 3, 1, 2, 5));
		Vouchers.add(new Voucher(6, 4, 2, 3, 6));
		Vouchers.add(new Voucher(7, 4, 3, 4, 7));
		Vouchers.add(new Voucher(8, 5, 4, 1, 1));
		Vouchers.add(new Voucher(9, 5, 4, 1, 2));
		Vouchers.add(new Voucher(10, 1, 3, 2, 3));
		Vouchers.add(new Voucher(11, 3, 2, 3, 4));
		Vouchers.add(new Voucher(12));
		Vouchers.add(new Voucher(13));
		Vouchers.add(new Voucher(14));
		Vouchers.add(new Voucher(15));
		Vouchers.add(new Voucher(16));

		PrintListVouchers(Vouchers);
		Sort0Voucher(Vouchers);
		System.out.println("___________________________________________ ");
		System.out.println("Сортировка по транспорту и количеству дней ");
		PrintListVouchers(Vouchers);

		System.out.println(" ");
		Sort1Voucher(Vouchers);
		System.out.println("_____________________________________________ ");
		System.out.println("Сортировка по типу и еде ");
		PrintListVouchers(Vouchers);

		SelectVoucher(Vouchers);

	}

	// печать
	public static void PrintListVouchers(ArrayList<Voucher> VC) {
		for (Voucher i : VC) {
			i.PrintVoucher();
		}
	}

	// сортировка по транспорту и количеству
	public static void Sort0Voucher(ArrayList<Voucher> VC) {
		VoucherComparator myVoucherComparator = new VoucherComparator();
		Collections.sort(VC, myVoucherComparator);
	}

	// сортировка по типу и еде
	public static void Sort1Voucher(ArrayList<Voucher> VC) {
		TypeComparator myVoucherComparator = new TypeComparator();
		Collections.sort(VC, myVoucherComparator);
	}

	// выбор путевки
	public static void SelectVoucher(ArrayList<Voucher> VC) {
		int Vid;
		boolean chek = false;

		System.out.println("Введите Id выбранной путёвки >> ");
		Vid = InputMyInt.inputInt();

		while (!chek) {
			for (Voucher i : VC) {
				if (i.getId() == Vid) {
					chek = true;
				}
			}
			if (!chek) {
				System.out.println(" Путёвки с таким номером нет. Повторите ввод >>");
				Vid = InputMyInt.inputInt();
			} else {
				System.out.println(" Вы выбрали путевку под номером №" + Vid);
				for (Voucher i : VC) {
					if (i.getId() == Vid) {
						i.PrintVoucher();
					}
				}
			}
		}

	}

}
