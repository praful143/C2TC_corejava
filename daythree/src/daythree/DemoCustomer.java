package daythree;

public class DemoCustomer {
	
	private int customerId;
	private String CustomerName;
	private String Customercity;
	
	//Types - Default, User Defined Constructor
	//1. Default - No argument constructor
	//2. User defined - No argument and argumented / parameterized

	//User Defined - No argument constructor
		
	public DemoCustomer() {
		System.out.println("User Defined No Argument Constructor");
	}
	
	//User Defined - Argument/Parameterized Constructor
	public DemoCustomer(int id, String name, String city) {
		customerId = id;
		CustomerName=name;
		Customercity=city;
		System.out.println(id+" "+name+" "+city);
	}
	
	
	public int getCustomerId() {
		return customerId;	
	}
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomercity() {
		return Customercity;
	}
	public void setCustomercity(String customercity) {
		Customercity = customercity;
	}
	
	public static void main(String[] args) {
		
		
		DemoCustomer c1 = new DemoCustomer(1, "praful", "Mumbai");
		
		//Object Creation // c1 - Non Primitive Data Type
		
		// 1. Object Creation
		// 2. Constructor Invocation/Call
		
		DemoCustomer c2 = new DemoCustomer(2, "mahesh","Sangli");
	}
}
