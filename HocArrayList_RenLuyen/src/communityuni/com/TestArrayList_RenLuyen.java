package communityuni.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestArrayList_RenLuyen {
	static ArrayList<Integer> dsData = new ArrayList<Integer>();

	public static void menu() {
		System.out.println("1.Thêm");
		System.out.println("2.Xuất");
		System.out.println("3.Sửa");
		System.out.println("4.Xóa");
		System.out.println("5.Sắp xếp");
		System.out.println("6.Tìm kiếm");
		System.out.println("7.Thoát");
		System.out.println("Thím muốn gì ?");
		int chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			them();
			break;
		case 2:
			xuat();
			break;
		case 3:
			sua();
			break;
		case 4:
			xoa();
			break;
		case 5:
			sapXep();
			break;
		case 6:
			timkiem();
			break;
		case 7:
			System.err.println("Cảm ơn thím đã dùng phần mền");
			System.exit(0);
			break;
		default:
			System.out.println("Thím nhập lụi rồi");
			break;
		}
	}

	private static void timkiem() {
		System.out.println("Thím muốn tìm số mấy?");
		int k = new Scanner(System.in).nextInt();
		int dem = 0;
		String s = "";
		if (dsData.contains(k)) {// contains(int index) : kiểm tra danh sách có chứa phần tử nào đó hay không
			System.out.println("Có " + k + " trong danh sách");
		} else {
			System.out.println("Không có " + k + " trong danh sách");
		}
		for (int i = 0; i < dsData.size(); i++) {
			if (dsData.get(i) == k) {// get(int index) : lấy đối tường đó ra tại vị trí nào đó
				s += i + ",";
				dem++;
			}
		}
		if (s.length() > 0) {
			System.out.println("số " + k + " xuất hiện: " + dem + " lần");
			System.out.println("xuất hiện ở vị trí : " + s);
		} else {
			System.out.println("Không tìm thấy " + k + " trong danh sách các phần tử!");
		}
	}

	private static void sapXep() {
		Collections.sort(dsData);
	}

	private static void xoa() {
		System.out.println("Thím muốn xóa vị trí số mấy?");
		int k = new Scanner(System.in).nextInt();
		dsData.remove(k);
	}

	private static void sua() {
		System.out.println("vị trí muốn sửa : ");
		int k = new Scanner(System.in).nextInt();
		System.out.println("Giá trị mới : ");
		int m = new Scanner(System.in).nextInt();
		dsData.set(k, m);// đặt lại giá trị m ở vị trí k trong danh sách các phần tử.
		System.out.println();
	}

	private static void xuat() {
		System.out.println("Danh sách các phần tử là :");
		for (int i = 0; i < dsData.size(); i++) {
			System.out.print(dsData.get(i) + "\t");
		}
		System.out.println();
	}

	private static void them() {
		System.out.println("Mời thím thêm phần tử vào danh sách");
		int value = new Scanner(System.in).nextInt();
		dsData.add(value);
	}

	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}

}
