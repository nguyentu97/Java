package communityuni.com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test_QuickSort {
	public static void nhapMang(int M[]) {
		Random rd = new Random() ;
		for(int i =0 ; i<M.length ; i++) {
			M[i] = rd.nextInt(100);
			//System.out.print(M[i] + "\t");
		}
	}
	public static void xuatMang(int M[]) {
		for(int i = 0 ; i<M.length ; i++) {
			System.out.print(M[i]+"\t");
		}
	}
	public static void QuickSort(int M[] , int left , int right) {
		if(left>=right) return ;
		int pivot = M[(left + right)/2];
		int i = left , j =right ;
		do {
			while(M[i]<pivot) i++;
			while (M[j]>pivot) j--;
			if(i<=j) {
				int temp = M[i];
				M[i] = M[j];
				M[j] = temp;
				i++;
				j--;
			}
			
		} while (i<j);
		QuickSort(M, left,j);
		QuickSort(M, i ,right);
	}

	public static void main(String[] args) {
		//Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giá trị tối đa của mảng :");
		int n = sc.nextInt();
		int M[] = new int[n];
		System.out.println("Mảng các phần tử ngẫu nhiên :");	
		nhapMang(M);
		xuatMang(M);
		QuickSort(M, 0, M.length -1);
		System.out.println("\nMảng sau khi sắp xếp là :");
		xuatMang(M);

	}

}
