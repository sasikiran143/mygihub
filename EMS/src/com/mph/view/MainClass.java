package com.mph.view;

import java.util.Scanner;

import com.mph.controller.EmployeeController;

public class MainClass {

	public static void main(String[] args) {

		EmployeeController ec = new EmployeeController();

		Scanner sc = new Scanner(System.in);

		String input = null;
		do {
			System.out.println("Enter your Choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				ec.addEmployee();
				break;
			}

			case 2: {
				ec.viewEmployee();
				break;
			}
			case 3: {

			}
			case 4: {

			}
			default: {

			}

			}
			System.out.println("Do you want to continue ? Y or y for yes");
			input = sc.next();
		} while (input.equals("Y") || input.equals("y"));
		System.out.println("System Exited..Thanks for using our system !!!");
		System.exit(0);
	}
}