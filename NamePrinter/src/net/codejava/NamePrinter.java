package net.codejava;

import java.util.Scanner;

public class NamePrinter {

	public static void main(String[] args) {
		System.out.println("Enter Your name and forname: ");
		String name,fname;
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		fname = sc.next();
		sc.close();
		System.out.println("\n"+name+"\n"+fname);

	}

}
