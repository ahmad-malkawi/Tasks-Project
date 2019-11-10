package jo.secondstep.session3.first;

import java.util.Scanner;

public class FirstGameTask {

	private static Scanner in;
	private static int steps_num_p2;
	private static int rows_number;
	private static int columns_number;
	private static int steps_num_p1;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.print("please enter the number of row(s): ");
		rows_number = in.nextInt();
		System.out.print("please enter the number of column(s): ");
		columns_number = in.nextInt();
		if (rows_number != 0 && columns_number != 0) {
			if (rows_number == 1 || columns_number == 1) {
				System.out.println(
						"the first player winned with " + 1 + "steps and the second player losed with " + 0 + "steps");
			} else if (rows_number % 2 == 0 || columns_number % 2 == 0) {
				if (rows_number % 2 == 0 && columns_number % 2 == 0) {
					steps_num_p2 = Math.min(rows_number, columns_number);
					steps_num_p2 = steps_num_p2 / 2;
					steps_num_p1 = steps_num_p2;
				} else if (rows_number % 2 == 0) {
					steps_num_p2 = rows_number / 2;
					steps_num_p1 = steps_num_p2;
				} else {
					steps_num_p2 = columns_number / 2;
					steps_num_p1 = steps_num_p2;
				}
				System.out.println("the second player winned with " + steps_num_p2
						+ "steps and the first player losed with " + steps_num_p1 + "steps");
			} else {
				if (rows_number <= columns_number) {
					steps_num_p1 = (int) Math.ceil((double) rows_number / 2);
					steps_num_p2 = (int) Math.floor((double) rows_number / 2);
				} else {
					steps_num_p1 = (int) Math.ceil((double) columns_number / 2);
					steps_num_p2 = (int) Math.floor((double) columns_number / 2);
				}
				System.out.println("the first player winned with " + steps_num_p1
						+ "steps and the second player losed with " + steps_num_p2 + "steps");
			}
		} else {
			System.out.println("Soooory, you entered invalid value  :*( .");
		}
	}

}
