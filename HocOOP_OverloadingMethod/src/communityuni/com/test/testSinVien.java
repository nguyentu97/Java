package communityuni.com.test;

import communityuni.com.model.SinhVien;

public class testSinVien {

	public static void main(String[] args) {
		SinhVien teo = new SinhVien(1, "Teo", 8);
		teo.xetTotNghiep();
		teo.xetTotNghiep(4);
		teo.xetTotNghiep(9, 1 );

	}

}
