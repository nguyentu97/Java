package communityuni.com.test;

import communityuni.com.model.HCN;
import communityuni.com.model.HV;
import communityuni.com.model.HinhHoc;

public class testHinhHoc {

	public static void main(String[] args) {
		HinhHoc h;
		h = new HCN(4,5);
		System.out.println("Chu vi = "+ h.tinhChuVI());
		System.out.println("Dien Tich = "+ h.tinhDienTich());
		
		h=new HV(5);
		System.out.println("Chu vi = "+ h.tinhChuVI());
		System.out.println("Dien Tich = "+ h.tinhDienTich());
	}

}
