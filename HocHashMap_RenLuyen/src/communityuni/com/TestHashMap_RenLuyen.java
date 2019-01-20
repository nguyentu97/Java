package communityuni.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TestHashMap_RenLuyen {
	static HashMap<Integer, String> dsData = new HashMap<Integer, String>();

	public static void menu() {
		System.out.println("1.Thêm");
		System.out.println("2.Xuất");
		System.out.println("3.Sửa");
		System.out.println("4.Xóa");
		System.out.println("5.Tìm kiếm");
		System.out.println("6.Thoát");
		System.out.println("Thím chọn số mấy ?");
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
			timKiem();
			break;
		case 6:
			System.err.println("Cảm ơn thím đã dùng phần mềm");
			System.exit(0);
			break;
		default:
			System.out.println("Nhập lụi rồi thím ơi!!!");
			break;
		}
	}

	private static void timKiem() {
		// lọc bất kỳ 1 cuốn sách có tên là gì
		System.out.println("Nhập tên sách muốn tìm :");
		String tenSach = new Scanner(System.in).nextLine();
		for (Map.Entry<Integer, String> item : dsData.entrySet()) {
			if (item.getValue().contains(tenSach)) {
				System.out.println(item.getKey() + "-" + item.getValue());
			}
		}

	}

	private static void xoa() {
		System.out.println("Nhập mã cuốn sách mà bạn muốn xóa :");
		int maSach = new Scanner(System.in).nextInt();
		if (dsData.containsKey(maSach) == false) {
			System.out.println("chả thấy mã cuốn sách nào để sửa");
		} else
			dsData.remove(maSach);

	}

	private static void sua() {
		System.out.println("Cuốn sách thím muốn sửa có thông tin");
		System.out.println("Mã cuốn sách cần đổi tên");
		int maSach = new Scanner(System.in).nextInt();
		System.out.println("Tên cuốn sách mới :");
		String tenSach = new Scanner(System.in).nextLine();
		if (dsData.containsKey(maSach) == true) {
			dsData.put(maSach, tenSach);
		}

	}

	private static void xuat() {
		System.out.println("Danh sách tên các cuốn sách :");
		System.out.println("Mã\t  Tên Sách");
		for (Map.Entry<Integer, String> iteam : dsData.entrySet()) {
			System.out.println(iteam.getKey() + "\t" + iteam.getValue());
		}
	}

	private static void them() {
		System.out.println("Mời thím thêm cuốn sách");
		System.out.println("Nhập mã cuốn sách");
		int key = new Scanner(System.in).nextInt();
		System.out.println("Nhập tên cuốn sách");
		String name = new Scanner(System.in).nextLine();
		if (dsData.containsKey(key) == false) {
			dsData.put(key, name);
		}
	}

	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}

}
