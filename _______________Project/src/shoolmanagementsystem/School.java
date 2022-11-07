package shoolmanagementsystem;

import java.util.List;

public class School {
	/*
	 * School have many teachers,many students
	 */
private List<Teacher> teacher;
private List<Student> student;
private static int totalMoneyEarned;
private static int totalMoneySpent;
/*
 * new school object is created
 * list of students in the school
 */
public School(List<Teacher> teacher, List<Student> student) {
	this.teacher = teacher;
	this.student = student;
	totalMoneyEarned = 0;
	totalMoneyEarned = 0;
}
public List<Teacher> getTeacher() {
	return teacher;
}
public void addTeacher(Teacher teachers) {
	teacher.add(teachers);
}
public List<Student> getStudent() {
	return student;
}
public void addStudent(Student students) {
	student.add(students);
}
public int getTotalMoneyEarned() {
	return totalMoneyEarned;
}
public static void updateTotalMoneyEarned(int MoneyEarned) {
	totalMoneyEarned += MoneyEarned;
}
public int getTotalMoneySpent() {
	return totalMoneySpent;
}
public void updateMoneySpent(int MoneySpent) {
	totalMoneyEarned -= MoneySpent;
}

















}
