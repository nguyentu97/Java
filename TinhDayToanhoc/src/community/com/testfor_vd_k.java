package community.com;

public class testfor_vd_k {

	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 3; j++) {
				if(i==0&&j==1||i==0&&j==2||
					i==0&&j==3||i==1&&j==2||
					i==1&&j==3||i==2&&j==3||
					i==4&&j==0||i==5&&j==0||
					i==5&&j==1||i==6&&j==0||
					i==6&&j==1||i==6&&j==2)
				System.out.print("  ");
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
