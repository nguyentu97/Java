package communityuni.com;

import java.util.Scanner;

public class TestTimKiem_Cach2 {
	// Nhập giá trị các phần tử của mảng
	public static void NhapMang(int M[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < M.length; i++) {
			System.out.print("M[" + i + "] = ");
			M[i] = sc.nextInt();
		}
	}

	// Xuất các giá trị vừa nhập
	public static void XuatMang(int M[]) {
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i] + "\t");
		}
	}

	// Tìm kiếm 1 phần tử có xuất hiện trong mảng hay không
	public static void TimKiemPhanTu(int M[], int k) {
		boolean timThay = false;
		for (int i = 0; i < M.length; i++) {
			if (M[i] == k) {
				timThay = true;
				break;
			}
		}
		if (timThay == true) {
			System.out.println("Tìm thấy " + k + " trong mảng các phần tử");
		} else {
			System.out.println("Không tim thấy " + k + " trong mảng các phần tử");
		}
	}

	// Tìm số lân phần tử xuất hiện , xuất hiện ở những vị trí nào.
	public static void TimSoLanPhanTuXuatHien(int M[], int k) {
		String s = "";
		int dem = 0;
		int i = 0;
		for (i = 0; i < M.length; i++) {
			if (M[i] == k) {
				s += i + ",";
				dem++;
			}
		}
		if (s.length() > 0) {
			System.out.println("Phần tử " + k + " xuất hiện " + dem + " lần.");
			System.out.println("Xuất hiện ở các vị trí " + s);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập kích thước tối đa của mảng :");
		int n = sc.nextInt();
		int M[] = new int[n];
		System.out.println("Mời bạn nhập giá trị cho mảng");
		// Gọi hàm và truyền tham số
		NhapMang(M);
		System.out.println("Mảng sau khi nhập là :");
		XuatMang(M);
		System.out.println("\nNhập phần tử bạn muốn tìm kiếm : ");
		int k = sc.nextInt();
		TimKiemPhanTu(M, k);
		System.out.println("Nhập phần tử khác bạn muốn tìm :");
		k = sc.nextInt();
		TimSoLanPhanTuXuatHien(M, k);

	}

}
