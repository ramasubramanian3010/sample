package org.loginc;

public class InheritanceRt2 extends InheritanceRt {
static String student(String name) {
String student = student(name);
return name;
}
static int stuId(int id) {
int stuId = stuId(id);
return id;
}
public static void main(String[] args) {
String employeeDetails = employeeDetails("ram");
System.out.println(employeeDetails);
}
}