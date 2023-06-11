/*throws: The Java throws keyword is used to explicitly throw an exception.
The throws keyword in Java is used to declare exceptions that can occur during the execution of a program. 
Syntax: 
	return_type method_name() throws exception_class_name
	{
	//method code
	}
*/
import java.io.*;

public class ThrowsExample {

    public static void main(String[] args) {
        try { 
            readDataFromFile("file.txt"); //method called readDataFromFile takes a String parameter filename, it attempts to read the contents of the file specified by filename("file.txt")
        } 
        
        // If an IOException occurs during the execution of readDataFromFile, it will be caught by the catch block, and an error message will be displayed.
        
        catch (IOException e) { 
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
    

    public static void readDataFromFile(String filename) throws IOException {  //The method is declared with the throws keyword followed by IOException, indicating that it may throw an IOException.
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}