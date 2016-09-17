package Ex7_2;

import java.util.ArrayList;
import java.util.List;
/*
 * author: Pham Thi Kim Hien
 * Date: 15/9/2016
 * Version: 1.0
*/
public class ManageEmployee {
	public List<Employee> listEmp;
	public List<Department> listDep;
	
	public ManageEmployee(){
		this.listEmp = new ArrayList<Employee>();
		this.listDep = new ArrayList<Department>();
	}
	
	// add Employee
	public void addEmp(Employee emp) {
		this.listEmp.add(emp);
	}
	
	// add Department
	public void addDep(Department dep) {
		this.listDep.add(dep);
	}
	
	// length of department list
	public int lengthDep() {
		return listDep.size();
	}
	
	// show information of Department
	public void showInfoDep() {
		for (int i = 0; i < listDep.size(); i++) {
			System.out.println((i + 1) +". " + listDep.get(i).getName());
		}
	}
	
	// show information of employee drug Department
	public void showInfoEmp(int id) {
		for (int j = 0; j < listEmp.size(); j++) {
			if (listEmp.get(j).getId_Department() == id)
				System.out.println(listEmp.get(j).toString());
		}
	}
	
	
}