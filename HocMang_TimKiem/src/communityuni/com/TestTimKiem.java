package communityuni.com;

import java.util.Scanner;

public class TestTimKiem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap so gia tri toi da cua mang :");
		int gt = sc.nextInt();
		int M[] = new int[gt];
		System.out.println("Moi ban nhap cac phan tu mang ");
		for (int i = 0; i < M.length; i++) {
			System.out.print("M[" + i + "] = ");
			M[i] = sc.nextInt();
		}
		System.out.println("Mang cac phan tu la:");
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i] + "\t");
		}
		System.out.println("\nPhan tu ban muon tim : ");
		int k = sc.nextInt();
		int i = 0;
		boolean timThay = false;
		for (i = 0; i < M.length; i++) {
			if (M[i] == k) {
				timThay = true;
				break;
			}
		}
		if (timThay == true) {
			System.out.println("Tim thay phan tu " + k + " trong mang");
			if (M[i] == k) {
				String s = "";
				int dem = 0;
				for (int j = 0; j < M.length; j++) {
					if (M[j] == k) {
						s = s + j + ",";
						dem++;
					}
				}
				System.out.println("Phan tu " + k + " xuat hien : " + dem + " lan");
				System.out.println("Vi tri xuat hien : " + s);
			}
		} else {
			System.out.println("Khong tim thay phan tu " + k + " trong mang");
		}

	}
}
