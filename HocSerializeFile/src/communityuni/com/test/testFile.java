package communityuni.com.test;

import java.util.ArrayList;

import communityuni.com.io.SerializeFileFactory;
import communityuni.com.model.KhachHang;

public class testFile {

	public static void main(String[] args) {
		/*ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang(1, "Ty"));
		dsKH.add(new KhachHang(1, "Bin"));
		dsKH.add(new KhachHang(1, "Bo"));
		dsKH.add(new KhachHang(1, "Cafe"));
		dsKH.add(new KhachHang(1, "Teo"));
		dsKH.add(new KhachHang(1, "Ty"));
		dsKH.add(new KhachHang(1, "Ty"));
		
		boolean kq = SerializeFileFactory.luuFile(dsKH, "E:/data_KH");
		if(kq==true) {
			System.out.println("Luu file thanh cong");
		}else {
			System.out.println("Luu file that bai!");
		}
		*/
		
		Object data = SerializeFileFactory.docFile("E:/data_KH");
		ArrayList<KhachHang>dsKH = (ArrayList<KhachHang>) data;
		for(KhachHang kh:dsKH) {
			System.out.println(kh.getMa()+"-"+kh.getTen());
		}

	}

}
