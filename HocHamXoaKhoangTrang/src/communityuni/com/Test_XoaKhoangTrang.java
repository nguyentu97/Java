package communityuni.com;

public class Test_XoaKhoangTrang {

	public static void main(String[] args) {
		String s =  "   Xin chào các bạn na   " ;
//		System.out.println(s);
//		System.out.println(s.length());
//		s=s.trim();
//		System.out.println(s);
//		System.out.println(s.length());
		
		// Xóa bên trái của chuỗi s , bên phải giữ nguyên
		
		int vtLeft = 0; // khởi tạo giá trị để lưu lại vị trí hiện tại của i;
		int i =0 ;
		for(i = 0 ; i < s.length() ; i++) { // duyệt toàn bộ ký tự từ đầu tới cuối trong độ dài của chuỗi.
			char c = s.charAt(i); // lấy kí tự ở vị trí i ra gán vào c 
			if(c==' ') //  i = ' ' thì => c =' ' chạy vào điều kiện bên trong if
				vtLeft = i; // lưu i đầu tiên băng rỗng vào vtLeft
			else // ngược lại i != ' ' thì dừng lưu lại i hiện tại
				break;
		}
		s =s.substring(i); // trích lọc chuỗi từ vị trí i trở đi , 
							// lấy toàn bộ bên phải từ vị trí i trở đi
		System.out.println(s);
		
		//Xóa bên phải của chuỗi s , bên trái giữ nguyên.
		int vtRight = 0 ;
		i = 0;
		for(i = s.length() - 1 ; i>0;i--) {
			char c = s.charAt(i);
			if(c ==' ')
				vtRight = i;
			else
				break;
					
		}
		s = s.substring(0,vtRight);
		System.out.println(s);

	}

}
