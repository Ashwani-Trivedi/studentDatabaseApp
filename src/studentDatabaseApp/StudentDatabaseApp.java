package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		//Student s1 = new Student();
		//s1.enroll();
		//s1.viewBalance();
		//s1.payTuition();
		//System.out.println(s1.showStatus());
		
		//  how many new users you want to add
		System.out.print("Enter number of students :");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		
		//create n number of new students
		Student[] students = new Student[numOfStudents];
		for(int i=0; i<numOfStudents; i++)
		  {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			
		  }
		
		for(int i=0; i<numOfStudents; i++)
		  {
			System.out.print("Students enrolled are:\n" + students[i].showStatus());
			
		  }
		

	}

}
