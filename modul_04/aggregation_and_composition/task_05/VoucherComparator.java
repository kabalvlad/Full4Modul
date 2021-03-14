package by.lecttor.modul_04.aggregation_and_composition.task_05;

import java.util.Comparator;

public class VoucherComparator implements Comparator<Voucher> {

	/*
	 * Тут реалтзованны сортировка по транспорут. Если траспорт совпадает то по
	 * количеству дней.
	 */

	@Override
	public int compare(Voucher arg0, Voucher arg1) {
		int flag = arg0.getTransport().compareTo(arg1.getTransport());
		if (flag == 0) {
			return arg0.getNumberOfDays() - arg1.getNumberOfDays();
		} else {
			return arg0.getTransport().compareTo(arg1.getTransport());
		}
	}

}

/*
 * Тут реалтзованны сортировка по типу путёвки. Если тип путевки совпадает то по
 * типу питания.
 */
class TypeComparator implements Comparator<Voucher> {

	@Override
	public int compare(Voucher arg0, Voucher arg1) {
		int flag = arg0.getType().compareTo(arg1.getType());
		if (flag == 0) {
			return arg0.getFood().compareTo(arg1.getFood());
		} else {
			return arg0.getType().compareTo(arg1.getType());
		}
	}

}
