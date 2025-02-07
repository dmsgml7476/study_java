package study0207;

public class dd {

	public static void main(String[] args) {
		
		int num=0, a=0;

		
		while (true) {	

			num=(int)(Math.random()*50+1);
			
			if ((num%2)==0) {
				System.out.println(num);
				a++;
				}
			
			if (a==5) {
				break;
			}
			
		}

	}

}
