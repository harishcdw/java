package assignment7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

class dateObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Date todaysDate=new Date();
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("./src/assignment7/sample5.txt"));
			output.writeObject(todaysDate);
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("./src/assignment7/sample5.txt"));
			Date datefromFile = (Date)input.readObject();
			System.out.println(datefromFile);
			
		}
		catch(IOException e1){
			System.out.println(e1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
