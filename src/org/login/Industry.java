package org.login;

public class Industry implements Employee, Student {

	@Override
	public void studeId() {
		 int id = 1123;
		System.out.println("student id is "+ id);
	}

	@Override
	public void empId() {
		int id =4467;
		System.out.println("employee id is "+ id);
	}
	public void industryName() {
    String name = "TVS";
    System.out.println("industry name is "+ name);
	}
public static void main(String[] args) {
	Industry i = new Industry();
	i.industryName();
	i.empId();
i.studeId();
}
}
