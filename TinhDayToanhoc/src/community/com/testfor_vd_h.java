package community.com;

public class testfor_vd_h {

	public static void main(String[] args) {
		for(int i = 0 ; i <=5 ; i++) {
			for(int j = i ; j<=4;j++) {
				System.out.print("  ");
			}
			for(int k = 5-i ; k <=5 ; k++) {
				if(i == 2 && k==4||
				   i == 3  && k==4||
				   i == 3 && k==3 ||
				   i == 4 && k == 4||
				   i == 4 && k == 3||
		           i == 4 && k == 2)
					System.out.print("  ");
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
