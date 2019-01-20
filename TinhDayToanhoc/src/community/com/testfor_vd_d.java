package community.com;

public class testfor_vd_d {

	public static void main(String[] args) {
		int a = 4;
		for (int i = 4; i >= 0; i--) {
			for (int j = i; j <= 4; j++) {
				 if (i==2 && j==3 || i==1 && j == 3 ||i==1 && j==2 ) {
				//if (i>=1 && i<=2 && j>=2 && j<=3) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
				// System.out.print("* ");
			}
			System.out.println();
		}
	}
}
