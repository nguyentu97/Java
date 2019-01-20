package communityuni.com;

import java.util.Random;
import java.util.Scanner;

public class BaiLuyenTap1 {
	static int M[];

	public static void menu() {
		System.out.println("1.Nhập Mảng");
		System.out.println("2.Xuất mảng");
		System.out.println("3.Tính Tổng Mảng");
		System.out.println("4.Tìm Kiếm");
		System.out.println("5.Lớn Nhất");
		System.out.println("6.Nhỏ Nhất");
		System.out.println("7.Số Nguyên Tố(Số chia hết cho 1 và chính nó)");
		System.out.println("8.Sắp Tăng");
		System.out.println("9.Sắp Giảm");
		System.out.println("-1.Thoát");
		System.out.println("Thím muốn gì ?");
		int chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			nhapMang();
			break;
		case 2:
			xuatMang();
			break;
		case 3:
			tinhTongMang();
			break;
		case 4:
			soLanXuatHien();
			break;
		case 5:
			timMax();
			break;
		case 6:
			timMin();
			break;
		case 7:
			xuatCacSoNguyenTo();
			break;
		case 8:
			sapXepTangDan(M, 0, M.length - 1);
			System.out.println("Mảng sau khi sắp xếp tăng dần là : ");
			xuatMang();
			break;
		case 9:
			sapXepGiamDan();
			xuatMang();
			break;
		case -1:
			System.err.println("Cảm ơn thím đã dùng phần mềm");
			System.exit(0);
			break;

		default:
			System.out.println("Thím nhập lụi rồi");
			break;
		}

	}

	public static void nhapMang() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Mời bạn nhập số phần tử :");
		int n = sc.nextInt();
		M = new int[n];
		for (int i = 0; i < M.length; i++) {
			M[i] = rd.nextInt(100);
		}
	}

	public static void xuatMang() {
		System.out.println("Mảng các phần tử :");
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i] + "\t");
		}

	}

	public static void tinhTongMang() {
		int result = 0;
		for (int i = 0; i < M.length; i++) {
			result = result + M[i];
		}
		// System.out.println(tong); tý thử
		System.out.println("\nTổng các phần tử trong mảng là :" + result);

	}

	public static void soLanXuatHien() {
		System.out.print("Nhập phần tử cần tìm kiếm :");
		int k = new Scanner(System.in).nextInt();
		int dem = 0;
		String s = "";
		for (int i = 0; i < M.length; i++) {
			if (M[i] == k) {
				s+=i + ",";
				dem++;
			}
		}
		if (dem == 0) {
			System.out.println("Không tìm thấy phàn tử " + k + " trong mảng");
		} else {
			
			System.out.println("Số lần " + k + " xuất hiện trong mảng là : " + dem + " lần");
			System.out.println("xuất hiện ở vị trí : "+s);
		}	
	}

	public static void timMax() {
		int max = M[0], vtMax = 0;
		for (int i = 0; i < M.length; i++) {// M = 1 3 2 5 4
			if (max < M[i]) {
				max = M[i];
				vtMax = i;
			}

		}
		System.out.println("\nPhần tử lớn nhất của mảng là : " + max + " ở vị trí " + vtMax);
	}

	public static void timMin() {
		int min = M[0], vtMin = 0;
		for (int i = 0; i < M.length; i++) {// M = 1 3 2 5 4
			if (min > M[i]) {
				min = M[i];
				vtMin = i;
			}
			System.out.println("Phần tử nhỏ nhất của mảng là : " + min + " ở vị trí " + vtMin);
		}
	}

	public static void xuatCacSoNguyenTo() {
		System.out.println("Các số nguyên tố là :");
		for (int i = 0; i < M.length; i++) {
			int dem = 0;
			for (int j = 1; j <=M[i]; j++) {
				if (M[i] % j == 0) {
					dem++;
				}
			}
			if (dem == 2) {
				System.out.print(M[i] + "\t");
			}
		}
		System.out.println();
	}

	public static void sapXepTangDan(int M[], int left, int right) {
		for (int i = 0; i < M.length; i++) {
			for (int j = i + 1; j < M.length; j++)
				if (M[i] > M[j]) {
					int temp = M[i];
					M[i] = M[j];
					M[j] = temp;
				}
		}
	}

	public static void sapXepGiamDan() {
		for (int i = 0; i < M.length; i++) {
			for (int j = i + 1; j < M.length; j++)
				if (M[i] < M[j]) {
					int temp = M[i];
					M[i] = M[j];
					M[j] = temp;
				}
		}
	}

	public static void main(String[] args) {
		while (true) {
			menu();
			System.out.println("\n---------------");
		}
	}

}
