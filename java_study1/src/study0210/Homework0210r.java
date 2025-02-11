package study0210;

import java.util.Scanner;

public class Homework0210r {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int num = 0;
		int [] arr = new int[15];
		
			
		
		   
			for (int i=0; i<arr.length; i++) {
				
				
				do {
					num=(int) (Math.random()*50+1);
					arr[i] = num;
				} while (!(num%2 == 0));
			
			}
			for (int i =1; i<arr.length; i++) {
				System.out.println("저장된 짝수 : " + arr[i]);
			}


	}

}
