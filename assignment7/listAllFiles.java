package assignment7;

import java.io.File;

public class listAllFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File filesDir = new File("./src/assignment7");
		if(filesDir.isDirectory()) {
			String fileList[]=filesDir.list();
			for(String file : fileList) {
				System.out.println(file);
			}
		}
		else {
			System.out.println("Directory not found");
		}
	}

}
