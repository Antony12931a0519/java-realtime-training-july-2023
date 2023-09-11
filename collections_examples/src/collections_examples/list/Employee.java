package collections_examples.list;

public class Employee {
	
	
	private String name;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", mobile=" + mobile + "]";
	}
	private String mobile;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
