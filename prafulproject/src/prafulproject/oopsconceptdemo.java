package prafulproject;

public class oopsconceptdemo {
	
	
	private int serialNum;
	private String name;
    private int age;
	
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "oopsconceptdemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

				
	
	
	
	
	

}
