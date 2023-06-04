package packageone;

public class TestOne {

	 public int i=5;
	 public void display() {
		System.out.println("In display method");
	 }

	 public static void main(String[] args) {
		TestOne t1 = new TestOne();
		System.out.println(t1.i);
		t1.display();

	 }



}
