package Assigment_1;

public class AdminDepartment extends SuperDepartment {
	String departmentname() {
		String departmentName = "Admin Department";
		return departmentName;
	}

	String getTodaysWork() {
		String getTodaysWork = "Complete your documents Submission";
		return getTodaysWork;
	}

	String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;

	}
}