package assignment7;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		  Scanner inp = new Scanner(System.in);
		  int charCount=0;
		  System.out.println("Enter the Input");
		  while(inp.hasNext()) {
			  charCount+=inp.next().length();
		  }
		  
		  System.out.println(charCount);
	}

}







