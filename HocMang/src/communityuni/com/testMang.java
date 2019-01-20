package communityuni.com;

import java.util.Scanner;

public class testMang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int []M;// khai bao mang
		System.out.println("Moi ban nhap so gia tri toi da cua mang :");
		int gt = sc.nextInt();
		int []M = new int[gt];// cap phat so phan tu trong mang
		System.out.println("Moi ban nhap cac phan tu cua mang ");
		for(int i = 0 ; i < M.length ; i++) {
			System.out.print("M["+i+"] = ");
			M[i] = sc.nextInt();
		}
		System.out.println("Mang cac phan tu la :");
		for(int i = 0 ; i<M.length ; i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println("\nMang gia tri cua cac phan tu :");
		for(int i : M) {
			System.out.print(i+"\t");
		}
		M[3]=1997;
		System.out.println("\nMang sau khi cap nhat gia tri :");
		for(int i : M) {
			System.out.print(i + "\t");
		}

	}

}
