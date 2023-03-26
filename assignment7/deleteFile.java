package assignment7;

import java.io.File;

public class deleteFile {

   public static void main(String[] args)
   {
       File file= new File("./src/assignment7/sample1.txt");

       if (file.delete()) {
           System.out.println("Deletion successful");
       }
       else {
           System.out.println("Deletion not done");
       }
   }
}