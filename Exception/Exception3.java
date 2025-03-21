//3.Write a Java program to create a method that reads a file and throws an exception if the file is not found.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exception3{
   public static void readFile(String FileName)throws FileNotFoundException{
            File file = new File(FileName);
            Scanner scan =new Scanner(file);
               while(scan.hasNextLine()){
                  System.out.println(scan.nextLine());
                  }
              }
    public static void main(String args[]){
        String FileName = "Exception2.java";
        try{
           readFile(FileName);
           }
        catch(FileNotFoundException e){
            System.out.println("Error: The file " + FileName + "' was not found.");
            }
       }
   }
        
                  
