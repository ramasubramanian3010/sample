package org.loginb;

public class Student implements Employee {

	@Override
	public void empName() {
    String name = "rocky";
    System.out.println("employee name is "+ name);
	}
	private void stuName() {
    String name = "bhai";
    System.out.println("student name is "+ name);
	}
	public static void main(String[] args) {
		Student n = new Student();
		n.empName();
		n.stuName();
	}

}