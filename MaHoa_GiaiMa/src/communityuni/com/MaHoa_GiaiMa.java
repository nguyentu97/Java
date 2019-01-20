package communityuni.com;

import java.util.Scanner;

public class MaHoa_GiaiMa {
	// khai báo biến
	final static String M = " abcdefghijklmnopqrstuvwxyz";
	static String s ;
	static int k ;
	
	//Hàm mã hóa
	private static void maHoaChuoi() {
		String ans = ""; 
		int ind1, ind2; 
		char x;	
		for (int i = 0;i < s.length();i++) {
			ind1 = M.indexOf(s.charAt(i));
			if (ind1 == 0) {
				x = ' ';
			} else {
				ind2 = 1 + (ind1 + k -1 ) % 26; 
				x = M.charAt(ind2);
			}
			ans = ans + x;
		}
		System.out.println("Chuỗi sau khi mã hóa : ");
		System.out.println(ans);
		
	}
	
	// Hàm nhập chuỗi
	private static void nhapChuoi() {
		System.out.println("Nhập chuỗi ký tự : ");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine(); 
		System.out.println("Nhập khóa K = ");
		k = sc.nextInt();
		
	}
	
	// Main
	public static void main(String[] args) {	
		nhapChuoi();
		maHoaChuoi();
	}

}
