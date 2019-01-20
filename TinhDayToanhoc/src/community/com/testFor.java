package community.com;

import java.util.Scanner;

public class testFor {

	
	public static void main(String[] args) {
/*		
		
		 * ý tưởng
		 * 
		int x = 5 ;
		int n = 6 ;
		double r = 5 ;
		int k = 1 ;
		for (int i = 2 ; i < n ; i++) {
			k = k + i ;
			r = (double) (r + Math.pow(x, i)/k);
		}
		System.out.println("S(5,3) = " + r);
		
*/		
		
	
		System.err.println("Nhập x,n . \nTính S(x,n) = x + x^2/(1+2) + x^3/(1+2+3) + .... + x^n/(1+2+3+...+n)");
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập x = ");
		int x = sc.nextInt() ;
		System.out.println("Nhập n = ");
		int n = sc.nextInt();
		double r = x ;
		int k = 1 ;
		for(int i = 2 ; i <= n ; i ++) {
			k = k + i ;
			r = (double)(r + (Math.pow(x, i)/k)) ;
		}
		System.out.println("S"+"("+x+","+n+") = " + r );
		System.out.println("Nhập nữa không thím ? \nTiếp tục bấm \"y\" Hủy thì bấm \"n\" :");
		String y = new Scanner(System.in).nextLine();
		if(y.equalsIgnoreCase("n")) {
			System.out.println("bye bye Thím !!");
			break;
		}
		}
		

		
/*		
		int n= 10 ;
		for(int i = 10 ; i >= 1 ; i--)
		{
			for(int j = i ; j <=10 ; j ++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
*/
	}	
}

