package communityuni.com;

import java.util.Scanner;

public class Bai1 {
	static int M[];
	
	//Hàm nhập mảng
	private static void nhapMang() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử tối đa :");
		int n = sc.nextInt();
		M = new int[n];
		System.out.println("Nhập các phần tử mảng là :");
		for (int i = 0; i < M.length; i++) {
			System.out.println("M[" + i + "]= ");
			M[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				while (M[i] == M[j]) {
					System.out.println("Phần tử đã tồn tại trong mảng . Mời nhập lại M[" + i + "]");
					System.out.println("M[" + i + "]= ");
					M[i] = sc.nextInt();
				}
			}
		}
	}
	
	//Hàm xuất mảng
	private static void xuatMang() {
		System.out.println("Mảng các phần tử :");
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i] + "\t");
		}
	}
	//Hàm Main
	public static void main(String[] args) {
		nhapMang();
		xuatMang();
	}
}
//tes test test
