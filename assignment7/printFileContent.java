package assignment7;

import java.io.FileReader;
import java.io.IOException;

public class printFileContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader filereader = new FileReader("./src/assignment7/sample2Renamed.txt");){
			int n=0;
			while((n=filereader.read())!=-1) {
				System.out.println((char)n);
			}
		}
		catch(IOException e1){
			System.out.println(e1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
