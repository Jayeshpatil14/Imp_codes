package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Employee implements Comparable<Employee> {
	private int empid;
	private String name, job, joinDate;
	private float salary;
	private String department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, String job, String joinDate, float salary, String department) {
		super();
		this.empid = empid;
		this.name = name;
		this.job = job;
		this.joinDate = joinDate;
		this.salary = salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public int getEmpid() {
		return empid;
	}

	public float getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", job=" + job + ", joinDate=" + joinDate + ", salary="
				+ salary + ", department=" + department + "]";
	}

	
	@Override
	public int compareTo(Employee other) {
		return this.empid - other.empid;
	}

}

class ListTest {
	private List<Employee> emplist;

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	public void addElements(Employee[] employees) {
		if (this.emplist != null && employees != null) {
			for (Employee emp : employees) {
				this.emplist.add(emp);
			}
		}
	}

	public Employee findElement(int empid) {
		if (this.emplist != null) {
			for (Employee emp : emplist) {
				if (emp.getEmpid() == empid)
					return emp;
			}
		}
		return null;
	}

	public void printElement(Comparator<Employee> c) {
		if (this.emplist != null) {
			// Collections.sort(this.emplist,c);
			this.emplist.sort(c);
			for (Employee emp : emplist) {
				System.out.println(emp);
			}
		}
	}

}

class SortByName implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

class SortById implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.getEmpid() - e2.getEmpid();
	}
}

class SortBySalary implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return (int) (e1.getSalary() - e2.getSalary());
	}
}

public class Program {

	static Scanner sc = new Scanner(System.in);

	public static Employee[] getEmployees() {
		Employee[] arr = new Employee[14];

		arr[0] = new Employee(7369, "SMITH", "CLERK", "1980-12-17", 800.00f, "RESEARCH");

		arr[1] = new Employee(7499, "ALLEN", "SALESMAN", "1981-02-20", 1600.00f, "SALES");

		arr[2] = new Employee(7521, "WARD", "SALESMAN", "1981-02-22", 1250.00f, "SALES");

		arr[3] = new Employee(7566, "JONES", "MANAGER", "1981-04-02", 2975.00f, "RESEARCH");

		arr[4] = new Employee(7654, "MARTIN", "SALESMAN", "1981-09-28", 1250.00f, "SALES");

		arr[5] = new Employee(7698, "BLAKE", "MANAGER", "1981-05-01", 2850.00f, "SALES");

		arr[6] = new Employee(7782, "CLARK", "MANAGER", "1981-06-09", 2450.00f, "ACCOUNTING");

		arr[7] = new Employee(7788, "SCOTT", "ANALYST", "1982-12-09", 3000.00f, "RESEARCH");

		arr[8] = new Employee(7839, "KING", "PRESIDENT", "1981-11-17", 5000.00f, "ACCOUNTING");

		arr[9] = new Employee(7844, "TURNER", "SALESMAN", "1981-09-08", 1500.00f, "SALES");

		arr[10] = new Employee(7876, "ADAMS", "CLERK", "1983-01-12", 1100.00f, "RESEARCH");

		arr[11] = new Employee(7900, "JAMES", "CLERK", "1981-12-03", 950.00f, "SALES");

		arr[12] = new Employee(7902, "FORD", "ANALYST", "1981-12-03", 3000.00f, "RESEARCH");

		arr[13] = new Employee(7934, "MILLER", "CLERK", "1982-01-23", 1300.00f, "ACCOUNTING");

		return arr;
	}

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Element(s)");
		System.out.println("2.Find Element");
		System.out.println("3.Remove Element");
		System.out.println("4.Print Element(s)[Sorted]");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}

	public static int subMenuList() {
		System.out.println("0.Exit");
		System.out.println("1.Sort By Name");
		System.out.println("2.Sort By Empid");
		System.out.println("3.Sort By Salary");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}

	private static void acceptRecord(int[] empid) {
		if (empid != null) {
			System.out.print("Enter empid : ");
			empid[0] = sc.nextInt();
		}
	}

	private static void printRecord(Employee value) {
		if (value != null)
			System.out.println(value.toString());
		else
			System.out.println("Employee not found");
	}

	public static void main(String[] args) {
		int choice;
		int[] empid = new int[1];
		ListTest test = new ListTest();

		test.setEmplist(new ArrayList<Employee>());
		// test.setEmplist(new Vector<Employee>());
		// test.setEmplist(new LinkedList<Employee>());
		while ((choice = Program.menuList()) != 0) {
			switch (choice) {
			case 1:
				Employee[] employees = Program.getEmployees();
				test.addElements(employees);
				break;
			case 2:
				Program.acceptRecord(empid);
				Employee value = test.findElement(empid[0]);
				Program.printRecord(value);
				break;
			case 3:
				break;
			case 4:
				while ((choice = Program.subMenuList()) != 0) {
					Comparator<Employee> c = null;
					switch (choice) {
					case 1:
						c = new SortByName();
						break;
					case 2:
						c = new SortById();
						break;
					case 3:
						c = new SortBySalary();
						break;
					}
					test.printElement(c);
				}
				break;
			}
		}
	}
}
