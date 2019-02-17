package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.enroll();
		s1.payBalance();
	System.out.println(s1.showInfo());
	
	//Ask how many new students we want to add
	System.out.println("Enter number of students to enroll");
	Scanner s = new Scanner(System.in);
	int numberOfStudents = s.nextInt();
	Student[] students = new Student[numberOfStudents];
	
	//Create number of new students
	for(int n =0; n<numberOfStudents;n++)
	{
		students[n] = new Student();
		students[n].enroll();
		students[n].payBalance();
		
	}
	
 	}
	

}
