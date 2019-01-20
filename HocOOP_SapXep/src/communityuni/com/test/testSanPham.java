package communityuni.com.test;

import java.util.ArrayList;
import java.util.Collections;

import communityuni.com.model.SanPham;

public class testSanPham {

	public static void main(String[] args) {
		ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
		dsSP.add(new SanPham(1,"PoCa" ,25));
		dsSP.add(new SanPham(2,"Repsi" ,15));
		dsSP.add(new SanPham(3,"CedBull" ,20));
		System.out.println("Danh sach sp :");
		for(SanPham sp : dsSP) {
			System.out.println(sp);
		}
		Collections.sort(dsSP);
		System.out.println("Danh sach sp sau khi sort:");
		for(SanPham sp : dsSP) {
			System.out.println(sp);
		}

	}

}
