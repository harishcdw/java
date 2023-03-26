package assignment7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class fileCopyByLines {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader filereader = new FileReader("./src/assignment7/sample2Renamed.txt");
			FileWriter filewriter = new FileWriter("./src/assignment7/sample4copy.txt");
				BufferedReader reader = new BufferedReader(filereader);
				BufferedWriter writer = new BufferedWriter(filewriter);

				){
			String temp;
			while((temp=reader.readLine())!=null) {
				writer.write(temp);
				writer.newLine();
			}
			System.out.println("file copy success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
