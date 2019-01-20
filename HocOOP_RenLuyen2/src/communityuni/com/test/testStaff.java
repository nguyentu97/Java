package communityuni.com.test;

import communityuni.com.model.Employee;
import communityuni.com.model.Excutive;
import communityuni.com.model.Staff;
import communityuni.com.model.StaffMember;
import communityuni.com.model.Volumteer;

public class testStaff {

	public static void main(String[] args) {
		Staff st = new Staff();
		Employee teo =new Employee();
		teo.setName("NGuyenVan Teo");
		teo.setAddress("HN");
		teo.setPhone("123");
		teo.setSocialSecurityNumber("SEC123");
		teo.setPayRate(0.12);
		st.addStaffMember(teo);
		
		Employee ty =new Employee();
		ty.setName("Tran thi Ty");
		ty.setAddress("HCM");
		ty.setPhone("456");
		ty.setSocialSecurityNumber("SEC456");
		ty.setPayRate(0.15);
		st.addStaffMember(ty);
		
		Excutive an =new Excutive();
		an.setName("HVA");
		an.setAddress("HCM");
		an.setPhone("789");
		an.setSocialSecurityNumber("SEC789");
		an.setPayRate(0.15);
		an.awardBonus(100);
		st.addStaffMember(an);
		st.payDay();
		
		
		

	}

}
