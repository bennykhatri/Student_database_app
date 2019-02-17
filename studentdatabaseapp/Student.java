package studentdatabaseapp;

import java.util.Scanner;

public class Student 
{
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = null;
	private int tutionBalance = 0;
	private String studentId;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor:  Prompt user to enter student's name and year
	public Student() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student first name");
		this.firstName = s.nextLine();
		
		System.out.println("Enter student last name");
		this.lastName = s.nextLine();
		
		System.out.println("1 - First Year\n2- Second Year\n3 - Junior\n4- Senior\n Enter Student class level");
		this.gradeYear = s.nextInt(); 
		
		setStudentID();
		//System.out.println(firstName + " "+ lastName + " "+gradeYear+ " "+studentId);
		
	}
	
	//Generate an Id
	private void setStudentID()
	{
		//Grade Level + ID
		id++;
		this.studentId = gradeYear + "" + id;
	}
	
	//Enroll In Course
	public void enroll()
	{
		//get inside a loop, user hits 0
		do{
		System.out.print("Enter Course to enroll(Q to quit):");
		Scanner s = new Scanner(System.in);
		String course = s.nextLine();
		if(!course.equals("Q"))
		{
			courses += "\n" + course;
			tutionBalance = tutionBalance + costOfCourse;
		}
		else {break;}
		}while(1 != 0);
		
		
	}
	
	//View Balance
	
	public void viewBalance()
	{
		System.out.println("Your Balance is: Rs"+tutionBalance);
	}
	
	//Payment
	public void payBalance()
	{
		viewBalance();
		System.out.print("Enter Your Payment Amount Rs:");
		Scanner s = new Scanner(System.in);
		int payment = s.nextInt();
		tutionBalance -= payment;
		System.out.println("Thank you for payment of Rs:"+ payment);
		viewBalance();
	}
	//Show Status
	public String showInfo()
	{
		return "Name: "+ firstName + " " +lastName+
				"\nGrade Level: "+ gradeYear+
				"\nStudent Id: "+ studentId+
				"\nCourses Enrolled: "+this.courses + 
				"\nBalance: Rs"+ tutionBalance;
	}

}
