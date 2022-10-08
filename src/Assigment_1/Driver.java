package Assigment_1;

public class Driver {
	public static void main(String[] args) {

		// creating objects of HrDepartment,AdminDepartment....

		AdminDepartment adminD = new AdminDepartment();
		HrDepartment hrD = new HrDepartment();
		TechDepartment techD = new TechDepartment();

		// outputs
		System.out.println("Welcome to " + adminD.departmentname());
		System.out.println(adminD.getTodaysWork());
		System.out.println(adminD.getWorkDeadline());
		System.out.println(adminD.isTodayAHoliday() + "\n\n");
		System.out.println("Welcome to " + hrD.departmentName());
		System.out.println(hrD.getTodaysWork());
		System.out.println(hrD.getWorkDeadline());
		System.out.println(hrD.doActivity());
		System.out.println(hrD.isTodayAHoliday() + "\n\n");
		System.out.println("Welcome to " + techD.departmentName());
		System.out.println(techD.getTodaysWork());
		System.out.println(techD.getWorkDeadline());
		System.out.println(techD.getTechStackInformation());
		System.out.println(techD.isTodayAHoliday() + "\n\n");

	}

}
