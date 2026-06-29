package com.mits.gradecalculator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("======================================");
        System.out.println("     STUDENT GRADE CALCULATOR");
        System.out.println("======================================");
        System.out.println("Welcome to the Student Grade Calculator");
        System.out.println("======================================");
		System.out.println("Enter student name: ");
		String name=sc.nextLine();
		System.out.println("enter Roll Number: ");
		String roll=sc.nextLine();
		System.out.println("\nEnter marks (out of 100)");
		System.out.println("java: ");
		int java=sc.nextInt();
		System.out.println("Python: ");
		int python=sc.nextInt();
		System.out.println("DBMS: ");
		int dbms=sc.nextInt();
		System.out.println("Operating systems: ");
		int os=sc.nextInt();
		System.out.println("DSA: ");
		int dsa=sc.nextInt();
		int total=(java+python+dbms+os+dsa);
		double average=total/5.0;
		char grade;
		if(average>=90) {
			grade='A';
		}else if(average>=80) {
			grade='B';
		}else if(average>=70) {
			grade='C';
		}else if(average>=60) {
			grade='D';
		}else {
			grade='F';
		}
		String result;

        if (java < 35 || python < 35 || dbms < 35 || os < 35 || dsa < 35) {
            result = "FAIL";
        } else {
            result = "PASS";
        }
		//final report
		System.out.println("\n======================================");
        System.out.println("           STUDENT REPORT");
        System.out.println("======================================");
        System.out.println("Name           : " + name);
        System.out.println("Roll Number    : " + roll);
        System.out.println("--------------------------------------");

        System.out.println("Java           : " + java);
        System.out.println("Python         : " + python);
        System.out.println("DBMS           : " + dbms);
        System.out.println("OS             : " + os);
        System.out.println("DSA            : " + dsa);
        System.out.println("--------------------------------------");

        System.out.println("Total          : " + total);
        System.out.println("Average        : " + average);
        System.out.println("Grade          : " + grade);
        System.out.println("Result         : " + result);

        System.out.println("======================================");

        sc.close();
	}
}
