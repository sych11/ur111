package urok3;

import java.util.Scanner;

public class P1_3 {

	public static void main(String[] args) {
		int x = (int) (Math.random()*(10-1)+1);
		int i=1,user=0;//������� ������� �� �����������
		Scanner sc = new Scanner(System.in);
		while(i<=3){
			System.out.println(i + " �������");
			user = sc.nextInt();
			if(user==x){
				System.out.println("�� �������!");
				break;
			}
			if (i==3){
				System.out.println("�� ���������! ���� �������� ����� "+x);
			}
			i++;
		}		
		
	}

}
