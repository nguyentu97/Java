package communityuni.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestSapXep {
	public static void nhapMang(int M[]) {

		Random rd = new Random();
		for (int i = 0; i < M.length; i++) {
			M[i] = rd.nextInt(100);
		}

	}

	public static void xuatMang(int M[]) {
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i] + "\t");
		}
	}
	// Sắp xếp BubbleSoft
	public static void BubbleSoft(int[] M) {
		int i, j;
		for (i = 0; i < M.length; i++) {
			for (j = M.length - 1; j > i; j--) {
				if (M[j] < M[j - 1]) {
					int temp = M[j];
					M[j] = M[j - 1];
					M[j - 1] = temp;
				}
			}
		}
	}
	// Sắp xếp SelectionSoft
	public static void SelectionSoft(int M[]) {
		int min ;
		for(int i = 0;i< M.length-1 ;i++ ) {
			min = i;
			for(int j = i+1;j<M.length ;j++) {
				if(M[j]<M[min]) {
					min = j;
				}
			}
			if(min!=i) {
				int temp = M[i];
				M[i]=M[min];
				M[min]=temp;
			}
		}
	}
	// Sắp xếp QuickSoft
	public static void QuickSoft(int M[],int left , int right) {
		if(left >= right)
			return;
		int pivot = M[(left+right)/2];
		int i = left , j = right;
		do {
			while (M[i]<pivot)
				i++;
			while (M[j]>pivot)
				j--;
			if(i<=j) {
				int temp = M[i];
				M[i] = M[j];
				M[i] = temp;
				i++;
				j--;
			}
		}while (i<j);
		QuickSoft(M, left, j);
		QuickSoft(M, i, right);
	}
	// tìm max
	public static void LonNhat(int M[]) 
	{
		// Thuật toán lấy giá trị lớn nhất
		int max = M[0];
		for(int i=1; i<M.length; i++)	{	
			if(M[i] > max)
				max = M[i];
			}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng :");
		int n = sc.nextInt();
		int[] M = new int[n];
		nhapMang(M);
		System.out.println("Mảng sau khi nhập ngẫu nhiên :");
		xuatMang(M);
		Arrays.sort(M);
		System.out.println("\nMảng sau khi sắp xếp (Arrays.soft) trong java hỗ trợ :");
		xuatMang(M);
		BubbleSoft(M);
		System.out.println("\nMảng sau khi sắp xếp (Bubble Soft) :");
		xuatMang(M);
		SelectionSoft(M);
		System.out.println("\nMảng sau khi sắp xếp (Seclection Soft) :");
		xuatMang(M);
		QuickSoft(M, 0, M.length-1);
		System.out.println("\nMảng sau khi sắp xếp (Quick Soft) :");
		xuatMang(M);
		System.out.println("Tìm số lớn nhất");
		LonNhat(M);
		xuatMang(M);
	}

}
