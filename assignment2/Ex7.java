package assignment2;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		while(true){
			String numerator=inp.next();
			String divisor = inp.next();
			if(numerator.charAt(0)=='q'||numerator.charAt(0)=='Q') {
				break;
			}
			try {
				double ans=Integer.parseInt(numerator)/Integer.parseInt(divisor);
				System.out.println(ans);
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			
		}
		
	}

}
