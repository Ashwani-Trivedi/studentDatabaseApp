package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private int costOfCourse = 600;
	private static int Id = 1000;
	
	
	
	//constructor prompt user to enter student's name and year
	public Student(){
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter student firstname :");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter student lastname :");
		this.lastName = sc.nextLine();
		
		System.out.print("1 - Primary\n2 - Secondary\n3 - Senior Secondary\nEnter student grade level :");
		this.gradeYear = sc.nextLine();
		
		setStudentId();
		
		System.out.println(firstName + " " + lastName + " " +gradeYear+ " "+ studentID);
		 	
	}
	
	
	//generate id
	private void setStudentId(){
		Id++;
		this.studentID = gradeYear + Id;
	}
	
	
	//enroll in course
	public void enroll(){
		do{
			
		}while(1 != 0);
	}
	
	
	//view balance
	
	//pay tuition
	
	//show status
	
}
