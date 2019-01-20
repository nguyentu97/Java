package communityuni.com.model;

public class Hourly extends Employee {
	private int hoursWorked;
	public void addHours(int moreHoures) {
		this.hoursWorked = moreHoures;
	}
     public double pay() {
    	 return this.hoursWorked *50;
     }
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
}
