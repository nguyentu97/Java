package communityuni.com;

import java.util.Scanner;

public class Bai2 {

	static int M[];

	private static void nhapMang() {
		
		// Nhập mảng
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử tối đa của mảng");
		int n = sc.nextInt();
		M = new int[n];// khởi tạo mảng với sô phần tử n nhập từ bàn phím
		System.out.println("Nhập các phần tử của mảng :");
		int min = 0;// khởi tạo giá trị cho biến min = 0
		for (int i = 0; i < M.length; i++) {// duyệt từng phần tử để nhập M[i]
			System.out.print("M[" + i + "]=");
			M[i] = sc.nextInt();// nhập M[i] từ bàn phím
			while (M[i] < min) {// vòng lặp kiểm tra nếu M[i] < 0 thì lặp lại yêu cầu nhập lại cho đến khi M[i]
								// > min để thoát khỏi vòng lặp
				System.out.println("M[" + i + "] < M[" + (i - 1) + "] . Yêu cầu nhập lại M[" + i + "]");
				System.out.print("M[" + i + "]=");
				M[i] = sc.nextInt();
			}
			min = M[i];// gán M[i] vừa tìm được bên trên lưu vào biến min , để lấy min so sánh với các
						// giá trị tiếp theo
		}
	}

	// Xuất mảng

	private static void xuatMang() {
		System.out.println("Mảng các phần tử :");// duyệt các phần tử vừa nhập trong mảng để in ra màn hình
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i] + "\t");
		}
	}
	public static void main(String[] args) {
		nhapMang();
		xuatMang();
	}

}
