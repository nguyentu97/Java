package community.com;

public class testfor_vd_5 {

	public static void main(String[] args) {
		int h = 10 ;
		for(int i = 0 ; i <h ; i ++) {
			
			for(int j = 0 ; j < h ;j++)
			{
				if(i+j == h-1 || 
					j == h/2 || 
					(i==0 && j >= h/2)  || 
					i ==h-1 && j <=h/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
