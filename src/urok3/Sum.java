package urok3;

public class Sum {

	public static void main(String[] args) {
		//1*2*3+4+..+100
		
		int i=0, s=0;
		while(i<100){
			s+=i;
			i++;
		}
		System.out.println(s);
	}

}
