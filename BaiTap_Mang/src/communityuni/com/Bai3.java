	package communityuni.com;

import java.util.Scanner;

public class Bai3 {
	static double M[];
	
	// hàm tìm giá trị nhỏ nhất cảu mảng
	private static void timMin() {
		System.out.println("Phần tử nhỏ nhất của mảng là :");
		double min = M[0];
		int vtmin = 0;
		for(int i = 0 ; i <M.length;i++) {
			if(min>M[i]) {
				min = M[i];
				vtmin =i;
			}
		}
		System.out.println(min+"\t"+ "ở vị trí "+vtmin);		
	}
	
	// Hàm xuất mảng
	private static void xuatMang() {
		for(int i = 0 ; i<M.length ; i++) {			
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	
	// Hàm nhập mảng
	private static void nhapMang() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhấp số phần tử tối đa của mảng :");
		int n  =sc.nextInt();
		M = new double[n]; 
		System.out.println("Nhập các phần tử :");
		for(int i = 0 ; i <M.length ; i++) {
			System.out.println("M["+i+"]= ");
			M[i] = sc.nextDouble();
		}
		System.out.println("Mảng các phần tử là :");	
	}
	
	// Hàm sắp xếp giảm
	private static void sapXepGiam() {
		System.out.println("Mảng sắp xếp giảm dần là :");
		for(int i = 0 ; i<M.length ; i++) {
			for(int j=i+1 ; j<M.length ;j++) {
				if(M[i] < M[j]) {
					double temp = M[i];
					M[i] = M[j];
					M[j] = temp;			
				}
			}
		}		
	}
	
	//Hàm Main
	public static void main(String[] args) {
		nhapMang();
		xuatMang();
		timMin();
		sapXepGiam();
		xuatMang();

	}

}
