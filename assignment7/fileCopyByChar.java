package assignment7;

import java.io.FileReader;
import java.io.FileWriter;

public class fileCopyByChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader filereader = new FileReader("./src/assignment7/sample2Renamed.txt");
			FileWriter filewriter = new FileWriter("./src/assignment7/sample3copy.txt")){
			int temp=0;
			while((temp=filereader.read())!=-1) {
				filewriter.write(temp);
			}
			System.out.println("file copy success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
