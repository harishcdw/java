package assignment2;

import java.util.Scanner;

class MyException1 extends Exception {
	MyException1(){
		
	}
	
	public String toString() {
		return "Enter the valid marks";
	}
}

public class Ex9 {

	public static void main(String[] args) throws MyException {

		Scanner inp = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			try {
				String marks = inp.next();
				if (Integer.parseInt(marks) < 0 || Integer.parseInt(marks) > 100) {
					throw new MyException1();
				} else {
					sum+=Integer.parseInt(marks);
				}

			} catch (Exception e) {
				System.out.println(e);
			}

		}
		System.out.println("Average : " + sum / 10);

	}

}
