package prafulproject;
import java.util.Base64;
public class Arrays {

	public static void main(String[] args) {
       		// use arrays  value 01234
		//1 declartion and memory allocation
		//int [] marks = new int[5];
		
		//initialation
	    // int[] marks;
	  //   marks= new int[5];
		//marks[0]=100;
		//marks[1]=50;
		//marks[2]=60;
		//marks[3]=70;
		//marks[4]=80;
		
		
		//declartion and memory allocation initialations
		int[] marks={100,50,60,70,80};	
		
		 
	    //System.out.println(marks[0]);
	 //   System.out.println(marks.length);
	    
	    
	  //  String [] Student= {"praful","prashant","varad","arya"};
		// System.out.println(Student[0]);
		// System.out.println(Student.length);
	     
	
	    // marks[5]=60;----- error	
       // System.out.println(marks[2]);	
		System.out.println("printing for loop");
		for (int i=0; i<marks.length;i++) {
			System.out.println(marks[i]);
		}// reverse order
		System.out.println("printing for loop reverse order");
		for (int i=marks.length-1;i>=0; i--) {
			System.out.println(marks[i]);
		}
		System.out.println("printing for each loop");
		for(int element:marks) {
			System.out.println(element);
		}
		

	}

}
