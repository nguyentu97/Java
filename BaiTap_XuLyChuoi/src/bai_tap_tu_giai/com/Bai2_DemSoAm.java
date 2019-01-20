package bai_tap_tu_giai.com;

import java.util.Scanner;

public class Bai2_DemSoAm {
	public static void main(String[] args) {
		// String s = "abc-5xyz-12k91--p";
		// System.out.println(s);
		// char []arr = s.toCharArray();
		// System.out.println("=>Số nguyên âm trong chuỗi là : ");
		// for(int i = 0 ; i < arr.length ; i++) {
		// if(arr[i]=='-'&& arr[i+1] =='5') {
		// System.out.print(arr[i] +""+arr[i+1]+",");
		// }else if(arr[i]=='-'&& arr[i+1] =='1'&& arr[i+2]=='2') {
		// System.out.println(arr[i] +""+arr[i+1]+""+arr[i+2]);
		// }
		// }

		// chuoi ban dau
		
		System.out.println("Mời bạn nhập chuỗi bất kỳ(gồm : số nguyên,chữ,ký tự bất kỳ) :");	
		String str = new Scanner(System.in).nextLine();

		/**
		 * thay the toan bo nhung ky tu khong phai so, khong phai dau am, khong phai dau
		 * cham bang dau phay
		 */
		str = str.replaceAll("[^0-9,-\\./]", ",");
		System.out.println(str);

		/** cat thanh cac phan tu thong qua dau phay */
		String[] item = str.split(",");
		int a = 0;
		String s = "";
		// duyet cac phan tu, neu la so thi in ra
		for (int i = 0; i < item.length; i++) {
			try {
				a = (int) Double.parseDouble(item[i]);
				if (a < 0) {
					//System.out.println(a);
					s+=a + ",";
				}
			} catch (NumberFormatException e) {
			}
			
		}
		System.out.println("=> Số nguyên âm trong dãy là : " + s);
	}
}
