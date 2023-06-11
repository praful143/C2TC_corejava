/* Finally: It contains all the crucial statements that must be executed
whether exception occurs or not
Syntax: try {
				//Statements that may cause an exception
		}
		catch {
				//Handling exception
		}
		finally {
					//Statements to be executed
		} 
*/


public class FinallyExample {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			
			System.out.println("value of a is: " + a);
			System.out.println("value of b is: " + b);
			
			int c = a/b;
			System.out.println("a/b is: " + c);
		}
		catch(Exception e){
			System.out.println("Exception Thrown:" + e);
		}
		finally {
			System.out.println("Finally block executed");
		}
	}
}
			
	