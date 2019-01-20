package bai_tap_tu_giai.com;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Bai3_XuatTuoi {

	public static void main(String[] args) {
		// Cách 1 : Ôn tập hàm Calender(lấy thời gian hiện tại của hệ thống) , 
		//          hàm SimpleDateFormat(hiển thị định dạng thời gian)
/*		
		Calendar cal = Calendar.getInstance();
		// lấy năm hiện tại của hệ thống
		int yearNow = cal.get(Calendar.YEAR);
		System.out.println("Mời thím nhập ngày thán năm sinh (dd/MM/yyyy)");
		String ns = new Scanner(System.in).nextLine();
		// hàm hiển thị định dạng ngày tháng năm 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date  t = sdf.parse(ns);// truyền năm sinh kiểu chuỗi 
			// đổi ngày tháng năm
			cal.setTime(t);
			int yearNs = cal.get(cal.YEAR);
			int tuoi = yearNow-yearNs;
			System.out.println("Tuổi hiện tại của thím là : " + tuoi + " tuổi");  
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		
		// Cách 2 : Ôn tập hàm calendar(lấy thời gian hiện tại của hệ thống) , 
		//          kết hợp với cách thông thường
/*		
		Calendar cal = Calendar.getInstance();
		int yearNow = cal.get(Calendar.YEAR);
		System.out.println("Mời bạn nhập năm sinh : ");
		int ns = new Scanner(System.in).nextInt();
		int tuoi = yearNow - ns ;
		System.out.println("Tuổi hiện tại của bạn : " + tuoi + " tuổi");
*/		
		// Cách 3 : Ôn tập hàm calendar(lấy thời gian hiện tại của hệ thống) , 
		//          hàm Split(tách chuỗi)
/*		
		int a =0;
		Calendar cal = Calendar.getInstance();
		int yearNow = cal.get(Calendar.YEAR);
		System.out.println("Mời bạn nhập ngày tháng năm sinh (dd/MM/yyyy)");
		String ns = new Scanner(System.in).nextLine();
		String []arr = ns.split("\\/");
		for(int i = 0 ; i <arr.length ; i++) {
			if(arr[i]==arr[arr.length - 1]) {
				a = Integer.parseInt(arr[i]);
				int tuoi = yearNow - a ;
				System.out.println("Tuổi hiện tại của bạn là : "+tuoi+" tuổi");
			}
		}
*/		
		// Cách 4 : Ôn tập hàm calendar(lấy thời gian hiện tại của hệ thống) , 
		//          lasIndexOf(lấy vị trí cuỗi của chuỗi(trả về kiểu số)),
		//          substring(trích lọc chuỗi)
		
		Calendar cal = Calendar.getInstance();
		int yearNow = cal.get(Calendar.YEAR);
		System.out.println("Mời thím nhập ngày tháng năm sinh (dd/MM/yyyy) : ");
		String ns = new Scanner(System.in).nextLine();
		int a =ns.lastIndexOf("/");
		ns = ns.substring(a+1);
		int yearNS = Integer.parseInt(ns);// ép kiểu chuỗi về kiểu số.
		int tuoi = yearNow-yearNS;
		System.out.println("Tuổi hiện tại của thím : "+tuoi+" tuổi");
		

	}
}
