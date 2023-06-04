package daythree;

public class Customer {
		
		private int customerId;
		private String CustomerName;
		private String Customercity;
		
		//Types - Default, User Defined Constructor
		//1. Default - No argument constructor
		//2. User defined - No argument and argumented / parameterized

		//User Defined - No argument constructor
			
		public Customer() {
			System.out.println("User Defined No Argument Constructor");
		}
		
		//User Defined - Argument/Parameterized Constructor
		public Customer(int id, String name, String city) {
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
	}
		
		
		// Private, protected, public, default
		
		// public - public
		// Friends - default
		// Friends of friends - protected
		// Only me - private


