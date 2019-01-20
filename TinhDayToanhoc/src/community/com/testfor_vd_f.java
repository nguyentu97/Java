package community.com;

public class testfor_vd_f {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				if (i == 1 && j == 2 || 
					i == 1 && j == 3 || 
					i == 1 && j == 4 || 
					i == 2 && j == 3 || 
					i == 2 && j == 4 || 
					i == 3 && j == 4) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
