package communityuni.com.test;

import java.util.Scanner;

import communityuni.com.model.Hinh;
import communityuni.com.model.HinhChuNhat;

public class Menu {
	public static void menu() {
		System.out.println("Danh sach cac hinh !");
		System.out.println("1.Hinh Chu Nhat");
		System.out.println("2.Hinh Tron");
		System.out.println("3.Hinh Vuong");
		System.out.println("4.Thoat !");
		System.out.println("Moi thim chon !");
		int chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			hinhChuNhat();
			break;
		case 2:
			hinhTron();
			break;
		case 3:
			hinhVuong();
			break;
		case 4:
			System.out.println("Cam on thim da su dung phan mem");
			System.exit(0);
			break;
		default:
		System.out.println("Nhap luyen thuyen roi thim !");
			break;
		}
		
	}
	private static void hinhVuong() {
		// TODO Auto-generated method stub
		
	}
	private static void hinhTron() {
		// TODO Auto-generated method stub
		
	}
	private static void hinhChuNhat() {
		// TODO Auto-generated method stub
		Hinh hcn = new HinhChuNhat();
		((HinhChuNhat)hcn).input();
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		((HinhChuNhat)hcn).output();
		System.out.println("------------------");
		
		
	}
}
