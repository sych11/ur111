package urok3;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� �����");
		double money = sc.nextDouble();
		System.out.println("�� ������� ��� �� ���������� ������ ��������?");
		int year = sc.nextInt();
		double stavka = 0;

		if (year > 1) {
			stavka = 9;
		} else {
			stavka = 7;
		}
		for (int i = 1; i <= year; i++) {
			double pr = stavka / 100 * money;
			money += pr;
			System.out.println("�� " + i + " ���, ���� ����� ����� = " + Math.round(money));
		}
	}
}
