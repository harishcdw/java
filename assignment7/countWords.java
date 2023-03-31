package assignment7;

import java.util.Scanner;

public class countWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=inp.nextLine();
		String[] strArray = str.split(" ");
		System.out.println(strArray.length);
	}

}
