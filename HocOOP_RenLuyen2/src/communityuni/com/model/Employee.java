package communityuni.com.model;

public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;
		
	
	public Employee() {
		super();
	}
	public Employee(String socialSecurityNumber, double payRate) {
		super();
		this.socialSecurityNumber = socialSecurityNumber;
		this.payRate = payRate;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"-"+socialSecurityNumber+"-"+payRate;
	}
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return 100;
	}
	
}
