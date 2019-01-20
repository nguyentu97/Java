package communityuni.com;

public class Test_Split {

	public static void main(String[] args) {
		String s = "Obama>putin     kim Jong Un";
		String []arr = s.split("\\ "); // "\\" dùng để đánh dấu đây là ký hiệu đặc biệt trong mọi trường hợp đều thêm "\\"
		if(arr.length == 3);
		{
			
//			System.out.println("Ten 1 :" + arr[0]);
//			System.out.println("Ten 2 :" + arr[1]);
//			System.out.println("Ten 3 :" + arr[2]);
		}
		
		System.out.println("-------------------------");
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------------------");
		
		for(String x : arr) {
			System.out.println(x);
		}

	}

}
