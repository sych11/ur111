package urok3;

import java.util.Scanner;

public class P1_3 {

	public static void main(String[] args) {
		int x = (int) (Math.random()*(10-1)+1);
		int i=1,user=0;//Счетчик попыток на отгадывание
		Scanner sc = new Scanner(System.in);
		while(i<=3){
			System.out.println(i + " попытка");
			user = sc.nextInt();
			if(user==x){
				System.out.println("Вы угадали!");
				break;
			}
			if (i==3){
				System.out.println("Вы проиграли! Было загадано число "+x);
			}
			i++;
		}		
		
	}

}
