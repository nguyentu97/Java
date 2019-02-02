package communityuni.com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import communityuni.com.io.SerializeFileFactory;
import communityuni.com.model.KhachHang;

public class testKhachHang {
	static ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();

	public static void menu() {
		System.out.println("1.Nhập khách hàng");
		System.out.println("2.Xuất khách hàng");
		System.out.println("3.Xóa theo Khách Hàng");
		System.out.println("4.Tìm kiếm khách hàng");
		System.out.println("5.Sắp xếp khách hàng");
		System.out.println("6.Lưu file");
		System.out.println("7.Đọc file");
		System.out.println("8.Thống kê");
		System.out.println("9.Thoát");
		System.out.println("10.Sua Khách Hàng");
		System.out.println("Mời bạn chọn[1->8]!");
		int chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			nhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			xoaKH();
			break;
		case 4:
			timKiemKH();
			break;
		case 5:
			sapXep();
			break;
		case 6:
			luuFile();
			break;
		case 7:
			docFile();
			break;
		case 8:
			thongKe();
			break;
		case 9:
			System.err.println("Cảm ơn thím đã dùng phần mềm!");
			System.exit(0);
			break;
		case 10:
			suaSV();
			break;

		default:
			System.err.println("Nhập luyên thuyên rồi thím ơi!\nMời thím nhập lại ngeng!");
			break;
		}
	}

	private static void suaSV() {
		System.out.println("Số thứ tự sinh viên sửa :");
		int k = new Scanner(System.in).nextInt();
		System.out.println("Tên sinh viên mới :");
		String tenKH = new Scanner(System.in).nextLine();
		for (int i = 0; i < dsKH.size()+1; i++) {
			if (i == k) {
				;// đặt lại tên sv theo số thứ tự của sv
			}
		}

	}
	
	private static void xoaKH() {
		System.out.println("Số thứ tự Khách Hàng muốn xóa :");
		int xoaKH = new Scanner(System.in).nextInt();
		for (int i = 0; i < dsKH.size(); i++) {
			if (i == xoaKH) {
			   dsKH.remove(xoaKH+1);// xóa sv theo thứ tự
			}
		}
		
	}

	private static void thongKe() {
		System.out.println("Thông kê danh sách khách hàng có đầu số :");
		String phone = new Scanner(System.in).nextLine();
		int n = 0;
		for (KhachHang kh : dsKH) {
			if (kh.getPhone().startsWith(phone)) {
				n++;
			}
		}
		System.out.println("Có " + n + " khách hàng dung đầu số \"" + phone + "\"");
		System.out.println("MãKH\tTênKH\tPhone");
		for (KhachHang kh : dsKH) {
			if (kh.getPhone().startsWith(phone)) {
				System.out.println(kh);
			}
		}
	}

	private static void docFile() {
		dsKH = SerializeFileFactory.docFile("E:/Tu/dataKH.db");
		if (dsKH.size() != 0) {
			System.out.println("Đã đọc file thành công!");
		} else {
			System.out.println("Danh sách rỗng!");
		}

	}

	private static void luuFile() {
		boolean kq = SerializeFileFactory.luuFile(dsKH, "E:/Tu/dataKH.db");
		if (kq == true) {
			System.out.println("Lưu File thành công!");
		} else {
			System.out.println("Lưu File thất bại!");
		}

	}

	private static void sapXep() {
		Collections.sort(dsKH);
		System.out.println("Đã sắp xếp xong rồi nè!");

	}

	private static void timKiemKH() {
		System.out.println("Bạn muốn tìm kiếm theo :");
		System.out.println("1.Tên Khách Hàng");
		System.out.println("2.Số điện thoại Khách Hàng");
		int chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			System.out.println("Mời bạn nhập tên khách hàng cần tìm: ");
			String tenKH = new Scanner(System.in).nextLine();
			System.out.println("Khách hàng có tên \"" + tenKH + "\": ");
			System.out.println("MãKH\tTênKH\tPhone");
			for (KhachHang kh : dsKH) {
				if (kh.getTenKH().startsWith(tenKH)) {
					System.out.println(kh);
				}
			}
			break;
		case 2:
			System.out.println("Mời bạn nhập đầu số cần tìm: ");
			String phone = new Scanner(System.in).nextLine();
			System.out.println("Khách hàng có đầu số \"" + phone + "\": ");
			System.out.println("MãKH\tTênKH\tPhone");
			for (KhachHang kh : dsKH) {
				if (kh.getPhone().startsWith(phone)) {
					System.out.println(kh);
				}
			}
			break;
		}
	}

	private static void xuat() {
		System.out.println("Danh sách khách hàng:");
		System.out.println("===========================");
		System.out.println("MãKH\tTênKH\tPhone");
		System.out.println("===========================");
		for (KhachHang kh : dsKH) {
			System.out.println(kh);
		}
		System.out.println("===========================");

	}

	private static void nhap() {
		KhachHang kh = new KhachHang();
		System.out.println("Mã Khách Hàng: ");
		int maKH = new Scanner(System.in).nextInt();
		System.out.println("Tên Khách Hàng: ");
		String tenKH = new Scanner(System.in).nextLine();
		System.out.println("Số điện thoại Khách Hàng: ");
		String phone = new Scanner(System.in).nextLine();
		kh.setMaKH(maKH);
		kh.setTenKH(tenKH);
		kh.setPhone(phone);
		dsKH.add(kh);

	}

	public static void main(String[] args) {
		while (true) {
			menu();
		}

	}

}
