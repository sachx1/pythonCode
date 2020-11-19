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
            bw.write("<style>" + "\n" + 
            "@import url('https://fonts.googleapis.com/css2?family=Krona+One&display=swap');" + "\n" +
            "body {" + "\n" + 
               "/*background-color: #ccc;*/" + "\n" + 
                "background-color: black;" + "\n" + 
                "color: #000;" + "\n" + "}");
            bw.write("\n" + "\n" + "\t" + "a {" + "\n" + 
                "\t" + "\t" + "color: #f00;" + "\n" + 
            "}");
            bw.write("\n" + "\n" + ".overlay {" + "\n" + 
                "height: 100%;" + "\n" + 
                "width: 0;" + "\n" + 
                "position: fixed;" + "\n" + 
                "z-index: 1;" + "\n" + 
                "top: 0;" + "\n" + 
                "left: 0;" + "\n" + 
                "background-color: rgb(0,0,0);" + "\n" + 
                "background-color: rgba(0,0,0, 0.9);" + "\n" + 
                "overflow-x: hidden;" + "\n" + 
                "transition: 0.5s;" + "\n" + 
                "}");
            bw.write("\n" + "\n" + ".overlay-content {" + "\n" + 
                "position: relative;" + "\n" +
                "top: 5%;" + "\n" + 
                "width: 100%;" + "\n" + 
                "text-align: center;" + "\n" + 
                "margin-top: 30px;" + "\n" + 
                "color: white;" + "\n" + 
                "}");
            bw.write("\n" + "\n" + ".overlay a {" + "\n" + 
                "padding: 8px;" + "\n" + 
                "text-decoration: none;" + "\n" + 
                "font-size: 36px;" + "\n" + 
                "color: #818181;" + "\n" + 
                "display: block;" + "\n" + 
                "transition: 0.3s;" + "\n" + 
                "}");
            bw.write("\n" + "\n" + ".overlay a:hover, .overlay a:focus {" + "\n" + 
                "color: #f1f1f1;" + "\n" + 
                "}");
            bw.write(".overlay .closebtn {" + "\n" + 
                "position: absolute;" + "\n" + 
                "top: 20px;" + "\n" + 
                "right: 45px;" + "\n" + 
                "font-size: 60px;" + "\n" +
                "}");
            bw.write("\n" + "\n" + "@media screen and (max-height: 450px) {" + "\n" + 
                ".overlay a {font-size: 20px}" + "\n" + 
                ".overlay .closebtn {" + "\n" + 
                "font-size: 40px;" + "\n" + 
                "top: 15px;" + "\n" + 
                "right: 35px;" + "\n" + 
                "}" + "\n" + 
                "}");
            
            bw.write("\n" + "\n" + ".sidebar{" + "\n" + 
                "position: fixed;" + "\n" + 
                "width: 200px;" + "\n" + 
                "top:0;" + "\n" + 
                "left: 0;" + "\n" + 
                "bottom: 0;" + "\n" + 
                "background: grey;" + "\n" + 
                "padding-top: 50px;" + "\n" + 
                "}");
            bw.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
      }

}
