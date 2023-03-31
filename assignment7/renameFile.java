package assignment7;
import java.io.File;
public class renameFile {
	public static void main(String[] args) {
		File originalFile = new File("./src/assignment7/sample2.txt");
		File renamedFile = new File("./src/assignment7/sample2Renamed.txt");
        boolean flag = originalFile.renameTo(renamedFile);
        if (flag == true) {
            System.out.println("File Renamed successfully");
        }
        else{
        	System.out.println("Rename error");
        }
	}

}
