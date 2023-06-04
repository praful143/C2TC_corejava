package prafulproject;
import java.util.Scanner;
public class Findmarks {

	public static void main(String[] args) {
		byte m1,m2,m3;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" Enter your marks in physics");
			m1 =sc.nextByte();
			System.out.println(" Enter your marks in chemistry");
			m2 = sc.nextByte();
			System.out.println(" Enter your marks in maths");
			m3 = sc.nextByte();
		}
		
		float avg= (m1+m2+m3)/3.0f;
		 System.out.println("your percentage is: "+ avg);
		 if (avg>=40 && m1>=33 && m2>=33 && m3>=33) {
			 System.out.println("congratulation,you have been promoted");
		 }
		 else
		 {
			 System.out.println("Sorry,you have not been promoted !Please try again");
			 
		 }
		

	}

}
