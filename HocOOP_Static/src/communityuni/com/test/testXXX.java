package communityuni.com.test;

import communityuni.com.model.XXX;

public class testXXX {

	public static void main(String[] args) {
		//biến static
		XXX a = new XXX();
		a.setA(113);
		
		XXX b = new XXX();
		System.out.println(b.getA());//"113"

		
		XXX c = new XXX();
		System.out.println(a.getA());//"113"
		
		// Hàm static
		 XXX.fc1();

	}

}
