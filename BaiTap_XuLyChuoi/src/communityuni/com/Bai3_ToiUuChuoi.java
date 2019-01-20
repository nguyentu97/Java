package communityuni.com;

public class Bai3_ToiUuChuoi {

	public static void main(String[] args) {
		
		 String s = "    NGuyỄn                đỨC          tÚ            ";
		 s = s.trim();// xóa khoảng trắng dư thừa trái , phải của chuỗi
		 s = s.toLowerCase();// đưa chuỗi về in thường
		 String []arr = s.split(" ");// Hàm split dùng để tách chuỗi theo khoảng trắng 
		 String result = "";
		 for(String x : arr) {
			 if(x.length()>0) {// kiểm tra chuỗi không rỗng !
			 String value = x.replaceFirst((x.charAt(0)+""),
					 					   (x.charAt(0)+"").toUpperCase());
			 result += value + " " ;
			 }
		 }
		 result=result.trim();
		 System.out.println(result);

	}

}
