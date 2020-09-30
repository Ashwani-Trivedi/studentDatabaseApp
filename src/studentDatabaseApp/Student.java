package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses = null;
	private String course;
	private int tuitionBalance = 0;
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
		
		//System.out.println(firstName + " " + lastName + " " +gradeYear+ " "+ studentID);
		 	
	}
	
	
	//generate id
	private void setStudentId(){
		Id++;
		this.studentID = gradeYear + Id;
	}
	
	
	//enroll in course
	public void enroll(){
		do{
			System.out.print("Enter the course to enroll or Q to quit : ");
			Scanner sc = new Scanner(System.in);
			course = sc.nextLine();
			if(!course.equals("Q")){
				courses = courses + course + "\n" ;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else{ break; }
		}while(1 != 0);
		//System.out.print("Courses enrolled :"+ "\n" + courses);
	}
	
	
	
	//view balance
	public void viewBalance(){
		System.out.println("Your tuition balance is:" + tuitionBalance);
	}
	
	
	//pay tuition
	public void payTuition(){
		viewBalance();
		System.out.print("Enter your payment : Rs");
		Scanner sc =  new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for payment of Rs." + payment);
		viewBalance();
		
		
	}
	
	//show status
	public String showStatus(){
		return "Name :" + firstName + " " + lastName +
				"\nGradeYear :" + gradeYear +
				"\nStudentId :" + studentID +
				"\nCourses Enrolled : " + courses ;
			
	}
	
	
	
}
