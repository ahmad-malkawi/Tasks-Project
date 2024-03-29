package jo.secondstep.session6;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Person {
	private String location;
	private String mobileNumber;
	private ArrayList<Menu> ordered;
	private String item;

	public Customer(String name, String dateOfPirth, String location, String mobileNumber) {
		super(name, dateOfPirth);
		this.location = location;
		this.mobileNumber = mobileNumber;
		ordered = new ArrayList<Menu>();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	private Scanner in = new Scanner(System.in);

	public void makeOrder(FoodProvider restorant) {
		ArrayList<Menu> resMenu = restorant.getMenuItems();
		int resMenuSize = resMenu.size();
		System.out.println("******The " + restorant.getName() + "s Restorant Menu*******");
		for (int i = 0; i < resMenuSize; i++) {
			System.out.println(resMenu.get(i).getName() + " " + resMenu.get(i).getPrice());
		}
		System.out.println("************************************-******************************");
		System.out.print("please enter the item number(s): ");
		int itemNum = in.nextInt();
		for (int i = 0; i < itemNum; i++) {
			System.out.print("please enter the item number" + (i + 1) + " name: ");
			item = in.next();
			for (int j = 0; j < resMenuSize; j++) {
				if (resMenu.get(j).getName() .equals(item) ) {
					ordered.add(resMenu.get(j));
				}
			}

		}
		System.out.println("You selected :");
		int orderSize = ordered.size();
		for (int i = 0; i < orderSize; i++) {
			System.out.println(ordered.get(i).getName() + " " + ordered.get(i).getPrice());
		}
		System.out.print("Are you want to complet the order?(Y/N) ");
		Boolean flag = (in.next().toLowerCase().charAt(0)=='y' ? true : false);
		if (flag) {
			restorant.checkGenerator(ordered, this);
		} else {
			System.out.println("Thank you..... bay bay");
		}

	}
}
