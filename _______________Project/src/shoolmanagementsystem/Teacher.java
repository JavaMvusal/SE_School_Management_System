package shoolmanagementsystem;
/*
 * This claas is responsible for keeping  track teacher
 */
public class Teacher {
private int id;
private String name;
private int salary;
private int salaryEarned;
public Teacher(int id,String name,int salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.salaryEarned = 0;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void receiveSalary(int salary) {
	salaryEarned -= salary;
	School.updateTotalMoneyEarned(salaryEarned);
}

@Override
public String toString() {
	return "Name of the teacher: " + name + " Total earned salary so far $" + salaryEarned;
}










}
