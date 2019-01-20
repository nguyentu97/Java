package communityuni.com;

import java.util.Scanner;

public class Bai2_Chuoi_Panydrome {

	public static void main(String[] args) {
		System.out.println("Nhập vào 1 chuỗi : ");
		String s = new Scanner(System.in).nextLine();
		char []arr = s.toCharArray();
		int i = 0 ;
		boolean flag = true;
		for(i = 0 ; i < arr.length ; i++ ) {
			if(arr[i] != arr[arr.length - 1 -i]) {
				flag = false;
				break;
			}
		}	
		if(flag == true) {
			System.out.println(s+" là chuỗi panlydrome");
		}else {
			System.out.println(s+" không là chuỗi panlydrome");
		}
	}
}

