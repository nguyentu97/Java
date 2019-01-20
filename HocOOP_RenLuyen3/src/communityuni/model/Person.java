package communityuni.model;

import java.util.Date;

public  class Person implements Mammal {
	private String firsName;
	private BloodGroup blood;
	private Address homeAddress;
	private Address schoolAddress;
	
	
	public BloodGroup getBlood() {
		return blood;
	}

	public void setBlood(BloodGroup blood) {
		this.blood = blood;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(Address schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	@Override
	public void setDateOfBirth(Date dob) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAgeAsDay() {
		// TODO Auto-generated method stub
		return 0;
	}

}
