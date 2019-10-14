package UI_package;

import java.util.Scanner;

public abstract class Menu {

	public static int printMenu()
	{
		System.out.println("0. Use Converter");
		System.out.println("1. Print Courses");
		System.out.println("2. Find course by code");
		System.out.println("3. Exit");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		return choice;
	}
}
