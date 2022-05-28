package org.student;

import org.department.Department;

public class Student extends Department{
	// student as child and applying inheritance
	public void studentName() {
		System.out.println("The student name is Manisha");
	}
	public void studentDept() {
		System.out.println("The department is IT");
	}
	public void studnetID() {
		System.out.println("The student ID is 12345");
	}
	public static void main(String[] args) {
		Student obj= new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studnetID();
	}
}
