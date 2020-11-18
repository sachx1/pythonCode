package javaHTML;
import java.awt.Desktop;
import java.io.*;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;
import java.util.Scanner;

public class javaHTML {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        int choice = myObj.nextInt();
        System.out.println(choice);
        if (choice == 1){
            createFile();
        } else {
            System.out.println("program ends");
        }

        System.out.println("Name of the heartpiece ");
        myObj.nextLine(); //creates line so program does not skip
        String name1 = myObj.nextLine();

        String name2 = myObj.nextLine();  
        String name3 = myObj.nextLine(); 

        if (name1 != ""){
            fileWriter(name1, name2, name3); //helps pass parameters to fileWriter method
        } else {
            System.out.println("end program");
        }

      }

      public static void createFile(){
        try {
            File myObj = new File("filename.html");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
      }

      public static void fileWriter(String name1, String name2, String name3){ //passes parameters to the method
        
        try {
            FileWriter myWriter = new FileWriter("filename.html");
            BufferedWriter bw = new BufferedWriter(myWriter);
            //myWriter.write("Files in Java might be tricky, " + name1 + " but it is fun enough!"); //uses the passed parameters
            //myWriter.close();
            bw.write("<!DOCTYPE html>");
            bw.write("\n" + "<html lang=\"en\">");
            bw.write("\n" + "<head>");
            bw.write(" <title>2018017-01 High Resolution</title>" + "\n" + 
            "<meta charset=\"utf-8\">" + "\n" + 
            "<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0\">");
            bw.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
      }

}
