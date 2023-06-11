/* Exception Handling: Powerful mechanism to handle the runtime errors,
                       so that normal flow of the application can be maintained.
 
 Exception Handling includes several techniques 
1. Try 
2. Catch
3. Finally
4. Throw
5. Throws 

1. try-catch: try block defines a code block to run (to try)
catch" defines a code block to handle any exception 

	Syntax: 
		try {
				//Statements that may cause an exception
		}
		catch {
				//Handling exception
		}
*/

public class TryCatchExample {

	public static void main(String[] args) {
		
		try {
			
			int a = 10;
			int b = 0;
			
			System.out.println("Value of a is: " + a);
			System.out.println("Value of a is: " + b);
			
			int c = a/b;  //Dividing by zero is an Arthematic Exception
			System.out.println("a/b is: " + c); //Value of c can't be printed 
		}
		catch(Exception e) {
			System.out.println("Exception Thrown: " + e);
		}
		
		
	}
}