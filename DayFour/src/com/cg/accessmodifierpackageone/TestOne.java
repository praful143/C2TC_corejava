package com.cg.accessmodifierpackageone;

public class TestOne {



private String privateVar="I am a Private String";
String defaultVar="I am a Default String";
public String protectedVar="I am a Protected String";
public String publicVar="I am a Public String";
public char  i;

private void testOnePrivate() {
	System.out.println("I am a String inside Private Method");
}
void testOneDefault() {
	System.out.println("I am a String inside Default Method");
}
public void testOneProtected() {
	System.out.println("I am a String inside Protected Method");
}
public void testOnePublic() {
	System.out.println("I am a String inside Public Method");
}


public static void main(String[] args) {
	TestOne tOne= new TestOne();
	System.out.println(tOne.privateVar);
	tOne.testOnePrivate();
	System.out.println(tOne.defaultVar);
	tOne.testOneDefault();
	System.out.println(tOne.protectedVar);
	tOne.testOneProtected();
	System.out.println(tOne.publicVar);
	tOne.testOnePublic();
}



}
