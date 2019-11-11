package jo.secondstep.session6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Restorant restorant = new Restorant("Ahmad", "Irbid-Second Step", "0779204320" , new ArrayList<Employee>(), new ArrayList<Menu> ());
		restorant.addEmployee("ahmad", "25/3/1997", 19028, "Manager");
		restorant.addMenuItem("arab_shawerma", 1.5);
		restorant.addMenuItem("super_arab_shawerma", 2.5);
		restorant.addMenuItem("double_arab_shawerma", 3.75);
		restorant.addMenuItem("fride_chicken", 4);
		restorant.addMenuItem("cordun_blue", 5);
		Customer customer = new Customer("majd", "14/7/1997","irbid", "0796369450");
		
		customer.makeOrder(restorant);
		
	}

}
