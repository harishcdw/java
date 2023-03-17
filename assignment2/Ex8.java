package assignment2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int sum=0;
		for(int i=0;i<10;i++){
			String marks=inp.next();
			try {
				sum+=Integer.parseInt(marks);
			}
			catch(Exception e) {
				i--;
				System.out.println("Enter a valid mark");
			}
		}
		System.out.println("Average : "+sum/10);
		
	}

}
