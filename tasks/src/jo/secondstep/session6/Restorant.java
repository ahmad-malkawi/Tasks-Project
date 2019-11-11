package jo.secondstep.session6;

import java.util.ArrayList;

public class Restorant implements FoodProvider {
	private String name;
	private String location;
	private String telephon;
	private ArrayList<Employee> restorantEmployees;
	private ArrayList<Menu> restorantMenu;

	public Restorant(String name, String location, String telephon, ArrayList<Employee> restorantEmployees,
			ArrayList<Menu> restorantMenu) {
		this.name = name;
		this.location = location;
		this.telephon = telephon;
		this.restorantEmployees = restorantEmployees;
		this.restorantMenu = restorantMenu;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String getTelephon() {
		return telephon;
	}

	@Override
	public void setTelephon(String telephon) {
		this.telephon = telephon;
	}

	@Override
	public void addEmployee(String name, String dateOfPirth, int employeeID, String role) {
		restorantEmployees.add(new Employee(name, dateOfPirth, employeeID, role));

	}

	@Override
	public void addMenuItem(String name, double price) {
		restorantMenu.add(new Menu(name, price));

	}

	@Override
	public void checkGenerator(ArrayList<Menu> list, Customer customer) {
		System.out.println("************************************-******************************");
		System.out.println("Restorant name : " + name +" Restorant.");
		System.out.println("Restorant telephon : " + telephon);
		System.out.println("Restorant location : " + location);
		System.out.println("Customer name : " + customer.getName());
		System.out.println("Customer mobile : " + customer.getMobileNumber());
		System.out.println("Customer name : " + customer.getLocation());
		System.out.println("***The customer orderd***");
		double totalPrice = 0;
		int listSize = list.size();
		for (int i = 0; i < listSize; i++) {
			System.out.println(list.get(i).getName() + "  " + list.get(i).getPrice());
			totalPrice += list.get(i).getPrice();
		}
		System.out.println("You Selected "+listSize+" Items and the TOTAL PRICE "+totalPrice +" JD");
		System.out.println("***Thank You****");
	}

	@Override
	public ArrayList<Menu> getMenuItems() {

		return restorantMenu;
	}

	@Override
	public void printEmployeesDetails() {
		int employeesListSize = restorantEmployees.size();
		for (int i = 0; i < employeesListSize; i++) {
			System.out.println("The employee name " + restorantEmployees.get(i).getName() + " ID Number "
					+ restorantEmployees.get(i).getEmpID() + " Role " + restorantEmployees.get(i).getRole()
					+ " and birth in " + restorantEmployees.get(i).getDateOfPirth());
		}

	}
}
