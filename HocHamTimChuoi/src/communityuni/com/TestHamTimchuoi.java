package communityuni.com;

import java.util.StringTokenizer;

public class TestHamTimchuoi {

	public static void main(String[] args) {
		
		String s = "Công tằng anh nữ , nguyễn thị anh long lanh chòng chàn anh tuyết";
		int vt1 = s.indexOf("ô");// trả về vị trí đầu tiên tìm thấy
		System.out.println(vt1);
		int vt2 = s.indexOf("anh");
		System.out.println(vt2);
		int vt3 = s.lastIndexOf("ô");// trả về vị tri cuối cùng tìm thấy
		System.out.println(vt3);
		System.out.println(s.length());
		if(s.contains("nữ") ==true) {
			System.out.println("có chữ Nữ rong chuỗi");
			
		}else {
			System.out.println("ko có chữ nữ trong chuỗi");
		}
		StringTokenizer token = new StringTokenizer(s);
		int dem=0;
		while(token.hasMoreTokens()) {
			String value = token.nextToken();
			if(value.contains("anh")) {
				dem++;
			}
		}
		System.out.println(dem);
	}

}
