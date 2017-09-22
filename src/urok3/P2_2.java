package urok3;

public class P2_2 {

	public static void main(String[] args) {
		int i=0,s=0;
		do{
			int x = (int) (Math.random()*(10-1)+1);
			System.out.println("x="+x+"\n");
			s+=x;
			i++;			
		}
		while(i<3);
		System.out.println("Среднее арифметическое = "+s/3);
	}

}
