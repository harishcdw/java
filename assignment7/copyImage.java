package assignment7;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copyImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream file1 = new FileInputStream("./src/assignment7/shirt.png");
			FileOutputStream file2 = new FileOutputStream("./src/assignment7/shirtcopy.png");) {
			
			
			int n=0;
			byte b[]=new byte[1024];
			while((n=file1.read(b))!=-1) {
				file2.write(b,0,n);
			}
			System.out.println("Image copy success");
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
