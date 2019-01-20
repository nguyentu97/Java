package communityuni.com;

import java.util.Random;
import java.util.Scanner;

public class Bai4 {
	static int M[];
	public static void menu() {
		System.out.println("Mời thím chọn các chức năng hiển thị sau :");
		System.out.println("1.Dãy các số lẻ");
		System.out.println("2.Dãy các số chẵn");
		System.out.println("3.Dãy gồm các số nguyên tố");
		System.out.println("4.Dãy gồm các số không phải số nguyên tố");
		System.out.println("-1.Thoát");
		System.out.println("Thím chọn số mấy?");
		int chon  = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			dayLe();
			break;
		case 2:
			dayChan();
			break;
		case 3:
			soNguyenTo();
			break;
		case 4:
			khongPhaiSoNguyenTo();
			break;
		case -1:
			System.err.println("Cảm ơn thím đã dùng phần mềm ! Bye Bye Thím!!");
			System.exit(0);
			break;
		default:
			break;
		}
	}
	private static void khongPhaiSoNguyenTo() {
		System.out.println("Dãy các số không phải là số nguyên tố là :");
		for (int i = 0; i < M.length; i++) {
			int dem = 0;
			for (int j = 1; j <=M[i]; j++) {
				if (M[i] % j == 0) {
					dem++;
				}
			}
			if (dem != 2) {
				System.out.print(M[i] + "\t");
			}
		}
		System.out.println();
		
	}
	private static void soNguyenTo() {
		for (int i = 0; i < M.length; i++) {
			int dem = 0;
			for (int j = 1; j <=M[i]; j++) {
				if (M[i] % j == 0) {
					dem++;
				}
			}
			if (dem == 2) {
				System.out.println("Dãy các số nguyên tố là :");
				System.out.print(M[i] + "\t");
			}
			}
		}

	private static void dayChan() {
		String s = "";
		for(int i = 0 ; i<M.length ; i++) {
			if(M[i]%2==0) {
				s+=M[i]+",";
			}
		}
		if(s.length()>0) {
			System.out.println("Dãy các số chẵn là:"+s);
		}else {
			System.out.println("Không tồn tại số chẵn");
		}
		System.out.println();
		
	}
	private static void dayLe() {
		String s = "";
		int dem=0;
		for(int i = 0 ; i<M.length ; i++) {
			if(M[i]%2!=0) {
				s+=M[i]+",";
				dem++;
			}
		}
		if(s.length()>0) {
			System.out.println("Có "+dem+" số lẻ");
			System.out.println("Dãy các số lẻ là:"+s);
		}else {
			System.out.println("Không tồn tại số lẻ");
		}
		System.out.println();
	}
	public static void nhapMang() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Mời thím nhập số phần tử :");
		int n = sc.nextInt();
		M = new int[n];
		for(int i =0 ; i<M.length;i++) {
			M[i]=rd.nextInt(100);
		}
	}
	public static void xuatMang() {
		System.out.println("Mảng các phần tử là :");
		for(int i =0;i<M.length;i++) {
			System.out.print(M[i] +  "\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		nhapMang();
		xuatMang();
		System.out.println("-------------");
		while(true) {
		menu();
		}
	}

}
