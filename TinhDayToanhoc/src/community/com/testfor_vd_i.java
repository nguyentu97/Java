package community.com;

public class testfor_vd_i {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = i; j <= 4; j++) {
				System.out.print("  ");
			}
			for (int k = 5 - i; k <= 5; k++) {
				System.out.print("* ");
			}
			for (int x = 5 - i; x <= 4; x++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
