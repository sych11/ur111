package urok3;

import java.util.Scanner;

public class P3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correct=0;
		for (int i = 0; i < 5; i++) {
			int x = (int) (Math.random() * (10 - 1) + 1);
			int y = (int) (Math.random() * (10 - 1) + 1);
			int res = x * y;
			System.out.print("���������: "+x + "*" +y + "=");
			int answer = sc.nextInt();
			if(answer==res){
				correct++;
			}
		}
		switch (correct) {
		case 3:
			System.out.println("���� ������ 3");
			break;
			
		case 4:
			System.out.println("���� ������ 4");
			break;
		case 5:
			System.out.println("���� ������ 5");
			break;
			
		default:
			System.out.println("�� ����!");
			break;
		}
	}
}
