package urok3;

public class MyInfinityClass {

	public static void main(String[] args) {
		int i=1;
		while(i<=10){
			if(i==5){
				i++;
				continue;
			}
			System.out.println("Номер повтора цикла = "+i+"\n");
			i++;
		}

	}

}
