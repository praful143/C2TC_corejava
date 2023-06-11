/* throw: is used to explicitly throw an exception.
   throw keyword is used to explicitly throw an exception within a method or block of code.
  
   syntax for throw block:  throw new exception_class("error message");
*/

public class ThrowExample {


		public static void validate(int age) {
		if(age<21 || age>27) {
			throw new ArithmeticException("not eligible for interview");
		}
		else
			System.out.println("Eligible for interview ");
		}
		public static void main(String args[]) {
		try {
			validate(30);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("next code..");
	}
}