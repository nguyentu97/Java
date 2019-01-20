package communityuni.com.test;

import communityuni.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		// Cơ chế alias : 2 đối tượng cùng quản lý 1 vùng nhớ , đối tượng nào thay đổi dũ liệu thì đối tượng kia cũng thay đổi theo
		NhanVien nv1 = new NhanVien(1,"Obama");
		NhanVien nv2 = new NhanVien(2, "Putin");
		nv1=nv2;// đối tượng nv1 trỏ đến vùng nhớ do đối tượng nv2 quản lý
		//=> dữ liệu của nv2 cũng là dữ liệu của nv1
		System.out.println("ten cua nv1 :"+nv1.getTen());// In ra "Putin"
		nv2.setTen("Hello World");
		System.out.println("Tên mới của nv1="+nv1.getTen());
		nv1.setTen("Ông Thanh");
		System.out.println("Tên của nv2 :" + nv2.getTen());
/*		
		 Cơ chế gom rác tự động là : sau khi đối tượng nv1 trỏ đến vùng nhớ 
		của nv2 quản lý thì lúc vùng nhớ của đối tượng nv1 quản lý trươc đó 
		sẽ được tụ động thu hôi là vì không sử dụng đến nữa.
*/
		
		
		//sao chép 1 đối tượng giống y xì đối tượng cũ sang vùng nhớ khác  dùng hàm clone trong
		//Interface cloneable để sao chép đối tượng
		NhanVien nv3 = new NhanVien(4, "KimJong Un");
		NhanVien nv4 = new NhanVien(6, "Hồ Cẩm Đào");
		nv3 = nv4.copy();// sao chép y hệt vùng nhớ của nv4 quản lý sang 1 vùng nhớ 
		//mới riêng biệt do nv3 quản lý.Lúc này nv3  thao tác đến vùng nhớ mới này mà không ảnh 
		//hưởng gì đến vùng nhớ do nv4 quản lý ban đầu.
		System.out.println("Tên của nv3 lúc này :" + nv3.getTen());//=>"Hồ Cẩm Đào"
		nv4.setTen("Nguyễn Tú");
		System.out.println("Tên của nv3 :"+nv3.getTen());//=>"Hồ cẩm Đào " :))
		System.out.println("Tên của nv4 :"+nv4.getTen());//=>"Nguyễn Tú " :))
	}

}
