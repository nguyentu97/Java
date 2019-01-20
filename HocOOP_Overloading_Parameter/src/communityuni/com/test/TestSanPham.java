package communityuni.com.test;

import communityuni.com.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		SanPham sp = new SanPham(1234, "Bánh MỲ", 50);
		SanPham sp1 = new SanPham(32, "Sữa", 20);
		SanPham sp2 = new SanPham(2, "Thịt", 10);
		System.out.println(sp);
		double t  = sp.Sum(sp,sp1,sp2);
		System.out.println(t);
	}

}
