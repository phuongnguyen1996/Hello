package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		Integer x = scanner.nextInt();
		System.out.println(line + ' ' + x);
		
		scanner.close();
	}
}
//Nhap 2 so va tinh + - x /
//kiem tra so le hay chan