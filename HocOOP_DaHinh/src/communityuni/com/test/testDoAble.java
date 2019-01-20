package communityuni.com.test;

import communityuni.com.model.IDoAble;
import communityuni.com.model.NhanVien;
import communityuni.com.model.SinhVien;

public class testDoAble {

	public static void main(String[] args) {
		IDoAble x;
		x =new NhanVien();
		x.doSomeThing();
		
		x =new SinhVien();
		x.doSomeThing();

	}

}
