package main;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		Float a = scanner.nextFloat();
		Float b;
		Integer c;
		
		do {
			System.out.println("Nhap b: ");
			b = scanner.nextFloat();
		} while (b <= 0);
		
		System.out.println("Nhap so nguyen duong c: ");
		c = scanner.nextInt();
// Tinh tong, hieu, thuong, tich		
		if (a > b) {
			System.out.println("Hieu = " + (a - b));
		} else {
			System.out.println("Hieu = " + (b - a));
		}
		System.out.println("Tong = " + (a + b));
		System.out.println("Thuong = " + (a / b));
		System.out.println("Tich = " + (a * b));
// kiem tra c co la so le khong?
		if (c % 2 != 0) {
			System.out.println(c + " la so le");
		} else {
			System.out.println(c + " khong la so le");
		}
		scanner.close();
	}
}
