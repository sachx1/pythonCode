import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSVReader {

    public static void main(String [] args) {
        String path = "C:/Users/sachx/pythonCode/javaHTML/Javahtml/src/test.csv";
        //String line = "";
        String myObj = "";
        String name; 
        String COMMA_DELIMITER = ",";

        Scanner search = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the name of the heart ");
        name = search.nextLine();

        int index = 1;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            List<String> result = new ArrayList<>();
            String line;

            while ((line = br.readLine()) != null){
                //System.out.println(line);
                String [] values = line.split(COMMA_DELIMITER);
                //System.out.println(line);
                //System.out.println(Array.get(values, 0));
                //result.add(Arrays.asList(values));
                if(values[0].equals(name)){
                    result.add("Fontan");
                    System.out.println("Yes that heart exists");
                }
                
            }
            myObj = result.get(0);
            System.out.println(myObj);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
}