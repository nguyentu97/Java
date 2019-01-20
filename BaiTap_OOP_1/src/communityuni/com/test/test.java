package communityuni.com.test;

import java.util.ArrayList;
import java.util.Scanner;
import communityuni.com.model.SanPham;

public class test {
	static ArrayList<SanPham> dsSanPham = new ArrayList<SanPham>();

	public static void menu() {
		System.out.println("1.Nhập thông tin danh mục và sản phẩm");
		System.out.println("2.Xuất thông tin danh mục và sản phẩm");
		System.out.println("3.Cập nhật thông tin sản phẩm");
		System.out.println("4.Xóa sản phẩm bất kỳ trong danh mục");
		System.out.println("5.Thống kê tổng các giá trị mặt hàng");
		System.out.println("6.Liệt kê các sản phẩm xuất xứ từ trung quốc");
		System.out.println("7.Thoát");
		System.out.println("Thím chọn số mấy !");
		int chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			nhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			capNhat();
			break;
		case 4:
			xoa();
			break;
		case 5:
			thongKe();
			break;
		case 6:
			lietKe();
			break;
		case 7:
			System.err.println("Cảm ơn thím đã dùng phần mềm");
			System.exit(0);
			break;
		}
	}

	private static void lietKe() {
		System.out.println("Liệt kê các sản phẩm từ Việt Nam");
		for (int i = 0; i < dsSanPham.size(); i++) {
			if (dsSanPham.contains("VN")) {
				System.out.println(dsSanPham.get(i));
			}
		}
	}

	private static void thongKe() {
		System.out.println("Tổng giá trị của tất cả các mặt hàng là:");
		double s = 0;
		for (SanPham d : dsSanPham) {
			s += d.getGiaSP();
		}
		System.out.println(s);

	}

	private static void xoa() {
		System.out.println("Thứ tự sản phẩm bạn muốn xóa :");
		int k = new Scanner(System.in).nextInt();
		for (int i = 0; i < dsSanPham.size() + 1; i++) {
			if (i == k) {
				dsSanPham.remove(k - 1);
				System.out.println("xóa thành công");
			}
		}

	}

	private static void capNhat() {
		SanPham SP = new SanPham();
		System.out.println("Thứ tự sản phẩm bạn muốn cập nhật");
		int k = new Scanner(System.in).nextInt();
		System.out.println("Cập nhật thông tin sản phẩm mới");
		SP.nhapSanPham();
		for (int i = 0; i < dsSanPham.size() + 1; i++) {
			if (i == k) {
				dsSanPham.set(k - 1, SP);
			}
		}
	}

	private static void xuat() {
		System.out.println("STT\t Mã Danh Mục\t Tên Danh Mục \t Mã Sản Phẩm \t Tên Sản Phẩm \t\t Giá Cả \t Xuất xứ");
		for (int i = 0; i < dsSanPham.size(); i++) {
			System.out.println((i + 1) + "\t " + dsSanPham.get(i));
		}
	}

	private static void nhap() {

		SanPham SP = new SanPham();
		SP.nhapSanPham();
		dsSanPham.add(SP);
	}

	public static void main(String[] args) {
		while (true) {
			menu();
		}

	}

}
