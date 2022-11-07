package shoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher lessy = new Teacher(1,"Lessy",500);
		Teacher melissa = new Teacher(2,"Melissa",2000);
		Teacher vanderhon = new Teacher(3,"Vanderhon",3000);
		List<Teacher> teacherlist = new ArrayList<>();
		teacherlist.add(lessy);
		teacherlist.add(melissa);
		teacherlist.add(vanderhon);
		Student tamasha = new Student(1,"Tamasha",4);
		Student rakshith = new Student(2,"Rakshith",5);
		Student rabbi = new Student(3,"Rabbi",3);
		ArrayList<Student> students = new ArrayList<>();
		students.add(tamasha);
		students.add(rakshith);
		students.add(rabbi);
		School ghs = new School(teacherlist, students);
		tamasha.payFess(5000);
//		System.out.println("GHS has earned: " + ghs.getTotalMoneyEarned());
		rakshith.payFess(6000);
		System.out.println("GHS has earned: " + ghs.getTotalMoneyEarned());
		System.out.println("-----Making SCHOOL PAY Salary-----");
		lessy.receiveSalary(lessy.getSalary());
		System.out.println("GHS has spent for salary to Lessy: " + lessy.getName() + " and now  GHS has $" + ghs.getTotalMoneyEarned());
		
		
	}

}
