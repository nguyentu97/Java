package communityuni.com;

import java.util.Scanner;

public class Test_Doi_InHoa_InThuong {

	public static void main(String[] args) {
		/*
		 * String s1= "obama"; s1 = s1.toUpperCase(); // đưa chuỗi về in hoa
		 * System.out.println(s1); 
		 * s1="hello"; 
		 * s1=s1.toLowerCase(); // đưa chuỗi về in
		 * thường System.out.println(s1);
		 */
		// Bài tập tự đặt ra : Nhập vào 1 chuỗi danh từ riêng có định dạng bất kỳ , đưa
		// chuỗi đó về dạng chuẩn
		// VD : "nGuYễn văN a" - > "Nguyễn Văn A"

		System.out.print("Mời bạn nhập tên : ");
		String s1 = new Scanner(System.in).nextLine(); // Nhập chuỗi
		s1 = s1.trim();
		s1 = s1.toLowerCase(); // Đưa chuỗi về in thường
		String[] arr = s1.split(" "); // hàm split tách chuỗi theo khoảng trắng
		String result = "";
		String value = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 0) {
				value = arr[i].replaceFirst((arr[i].charAt(0) + ""), // đưa ký tự đầu tiên của chuỗi về in hoa
						(arr[i].charAt(0) + "").toUpperCase());
				result = result + " " + value; // ghép các chuỗi bị tách bởi khoảng trắng thành 1 chuỗi
				// System.out.println(value);
			}
		}
		result = result.trim();// xóa khoẳng trắng 2 bên trái phải của 1 chuỗi

		System.out.println(result);
		// System.out.println(value);
	}

}
