package communityuni.test;

import java.util.ArrayList;

import communityuni.model.Man;
import communityuni.model.Person;
import communityuni.model.Woman;


public class TestPerson {

	public static void main(String[] args) {
		
		ArrayList<Person>dsPerson = new ArrayList<Person>();
		// đa hình
		Person an = new Man() ;
		an.setFirsName("An");
		Person hong = new Woman();
		hong.setFirsName("Hong");
		((Woman)hong).setWearingMakeUp(true);
		
		dsPerson.add(an);
		dsPerson.add(hong);
		for(Person p : dsPerson) {
			if(p instanceof Man) {
				System.out.println(p.getFirsName()+" la Nam");
			}else {
				System.out.println(p.getFirsName()+" la Nu");
			}
		}
		
		

	}

}
