package jo.secondstep.session6;

import java.util.ArrayList;

public interface FoodProvider {
	public String getName() ;
	public void setName(String name) ;
	public String getLocation() ;
	public void setLocation(String location) ;
	public String getTelephon() ;
	public void setTelephon(String telephon) ;
	public void addEmployee(String name,String DateOfPirth,int employeeID,String role);
	public void addMenuItem(String name,double price);
	public ArrayList<Menu> getMenuItems();
	public void printEmployeesDetails();
	public void checkGenerator(ArrayList<Menu> list,Customer customer);
}
