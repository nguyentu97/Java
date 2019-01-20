package communityuni.com;

public class test_InHoa_InThuong {

	public static void main(String[] args) {
		String s = "hello ";
		
		// Đưa IN THƯỜNG về IN HOA	
//		s = s.toUpperCase();
//		System.out.println(s);
		 
		System.out.println("------------------------");
		
		// Đưa 1 KÝ TỰ BẤT KỲ từ IN THƯỜNG về IN HOA		
		s = s.replaceFirst(
				(s.charAt(0)+""),//charAt(a) trả về 1 ký tự ở vị trí a , cộng "" để đưa về chuỗi
				(s.charAt(0)+"").toUpperCase());
		System.out.println(s);
		
		System.out.println("------------------------");
		
		// Đưa IN HOA về IN THƯỜNG		
		String s1 = "PUTIN";
		s1=s1.toLowerCase();
		System.out.println(s1);
		
		System.out.println("------------------------");
		
		//Đưa 1 ký tự bất kỳ từ IN THƯỜNG vềvIN HOA  
		s1 = s1.replaceFirst(
				(s1.charAt(0)+""),//charAt(a) trả về 1 ký tự ở vị trí a , cộng "" để đưa về chuỗi
				(s1.charAt(0)+"").toUpperCase());
		System.out.println(s1);
		

	}
 
}
