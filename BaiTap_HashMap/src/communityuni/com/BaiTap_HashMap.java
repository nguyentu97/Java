package communityuni.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

public class BaiTap_HashMap {
	static HashMap<Integer, String> dsSV = new HashMap<Integer, String>();

	public static void menu() {
		System.out.println("Danh sách các lựa chọn ");
		System.out.println("1.Thêm sinh viên");
		System.out.println("2.Xuất sinh viên theo mã và tên");
		System.out.println("3.Sửa sinh viên");
		System.out.println("4.Xóa sinh viên chứa tên bất kỳ");
		System.out.println("5.Tìm sinh viên mà tên có chữ An");
		System.out.println("6.Xuất ra các mã sinh viên(chỉ mã)");
		System.out.println("7.Xuất ra các tên sinh viên(chỉ tên)");
		System.out.println("8.Thoát");
		System.out.println("Thím chọn số mấy ?");
		int chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			themSV();
			break;
		case 2:
			xuatSV();
			break;
		case 3:
			suaSV();
			break;
		case 4:
			XoaSV();
			break;
		case 5:
			timSV();
			break;
		case 6:
			xuatMaSV();
			break;
		case 7:
			xuatTenSV();
			break;
		case 8:
			System.err.println("Cảm ơn thím đã dùng phần mềm !");
			System.exit(0);
			break;

		default:
			System.out.println("Nhập lụi rồi thím");
			break;
		}
		System.out.println("--------------------");

	}

	private static void themSV() {
		System.out.println("Nhập mã sv :");
		int maSV = new Scanner(System.in).nextInt();
		System.out.println("Nhập tên sv :");
		String tenSV = new Scanner(System.in).nextLine();
		if (dsSV.containsKey(maSV) == false) {
			dsSV.put(maSV, tenSV);
			System.out.println("Thêm thành công!");
		} else {
			System.out.println("Không thành công ! Mã sinh viên đã tồn tại trong danh sách sv");
		}
	}

	private static void xuatSV() {
		System.out.println("Danh sách sinh viên :");
		System.out.println("Mã SV\t Tên SV");
		for (Map.Entry<Integer, String> xuatSV : dsSV.entrySet()) {
			System.out.println(xuatSV.getKey() + "\t" + xuatSV.getValue());
		}

	}

	private static void suaSV() {
		System.out.println("Mã sv muốn sửa :");
		int maSV = new Scanner(System.in).nextInt();
		System.out.println("Tên sv mới :");
		String tenSV = new Scanner(System.in).nextLine();
		if (dsSV.containsKey(maSV) == true) {
			dsSV.put(maSV, tenSV);
		} else {
			System.out.println("Không tồn tại mã sv cần sửa trong danh sách sv");
		}

	}

	private static void XoaSV() {
		System.out.println("Nhập mã sv muốn xóa");
		int maSV = new Scanner(System.in).nextInt();
		if (dsSV.containsKey(maSV) == true) {
			dsSV.remove(maSV);
			System.out.println("Xóa Thành công !");
		} else {
			System.out.println("Không thành công ! không tồn tại mã sv trong danh sách ");
		}

	}

	private static void timSV() {
		System.out.println("Nhập tên sv cần tìm :");
		String tenSv = new Scanner(System.in).nextLine();
		String s = "";
		for (Map.Entry<Integer, String> item : dsSV.entrySet()) {// cú pháp duyệt mảng trong hashmap
			if (item.getValue().contains(tenSv)) {
				s = item.getKey() + "\t" + item.getValue();
				System.out.println(s);
			}
		}
		if (s.length() == 0) {
			System.out.println("Không tìm thấy tên sv cần tìm trong danh sách");
		}

	}

	private static void xuatMaSV() {
		for (Map.Entry<Integer, String> item : dsSV.entrySet()) {
			System.out.println(item.getKey());
		}

	}

	private static void xuatTenSV() {
		for (Map.Entry<Integer, String> item : dsSV.entrySet()) {
			System.out.println(item.getValue());
		}

	}

	public static void main(String[] args) {
		while (true) {
			menu();

		}

	}

}
