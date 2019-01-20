package communityuni.com.test;

import java.util.Scanner;

import communityuni.com.model.NhanVien;

public class testNhanVien {

	public static void main(String[] args) {
		NhanVien nv1,nv2 ;
		System.out.println("Mời bạn nhập thông tin nhan vien 1 ;");
		System.out.println("Nhập họ :");
		String ho1 = new Scanner(System.in).nextLine();
		System.out.println("Nhập Tên :");
		String ten1 = new Scanner(System.in).nextLine();
		System.out.println("Số sản phẩm :");
		int soSP1 = new Scanner(System.in).nextInt();
		nv1 = new NhanVien(ho1, ten1,soSP1);
		
		System.out.println("Mời bạn nhập thông tin nhan vien 2 ;");
		System.out.println("Nhập họ :");
		String ho2 = new Scanner(System.in).nextLine();
		System.out.println("Nhập Tên :");
		String ten2 = new Scanner(System.in).nextLine();
		System.out.println("Số sản phẩm :");
		int soSP2 = new Scanner(System.in).nextInt();
		nv2 = new NhanVien(ho2, ten2,soSP2);
		
		System.out.println("Lương của nhan viên 1 "+nv1.getLuong());
		System.out.println("Lương của nhan viên 2 "+ nv2.getLuong());
		
		// dùng hàm lonHon()
		if(nv1.lonHon(nv2)) {
			System.out.println("Nhân viên["+nv1.getHo()+" "+nv1.getTen()+"] có nhiều hơn số sản phẩm");
			System.out.println("cụ thể :"+(nv1.getSP()-nv2.getSP())+"sản phẩm");
		}else {
			System.out.println("Nhân viên["+nv2.getHo()+" "+nv2.getTen()+"] có nhiều hơn số sản phẩm");
			System.out.println("cụ thể :"+(nv2.getSP()-nv1.getSP())+"sản phẩm");
		}
		// ko dùng hàm lonHon()
		if(soSP1>soSP2) {
			System.out.println("Nhân viên["+nv1.getHo()+" "+nv1.getTen()+"] có nhiều hơn số sản phẩm");
			System.out.println("cụ thể :"+(nv1.getSP()-nv2.getSP())+"sản phẩm");
		}else {
			System.out.println("Nhân viên["+nv2.getHo()+" "+nv2.getTen()+"] có nhiều hơn số sản phẩm");
			System.out.println("cụ thể :"+(nv2.getSP()-nv1.getSP())+"sản phẩm");
	}

}
}
