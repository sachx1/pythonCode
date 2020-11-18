package javaHTML;

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
        myObj.nextLine();
        String name1 = myObj.nextLine();

        if (name1 != ""){
            fileWriter(name1);
        } else {
            System.out.println("end program");
        }

        //fileWriter(name1);

      }

      public static void createFile(){
        try {
            File myObj = new File("filename.txt");
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

      public static void fileWriter(String name1){
        
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, " + name1 + " but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
      }

}
