package bai_tap_tu_giai.com;

import java.util.Random;
import java.util.Scanner;

public class Bai1_GameDoanSo {

	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			int diem = 5; 
			int random = rd.nextInt(diem+1);
			System.out.println("Điểm của bạn : " + diem);
			System.out.println("Máy đã sinh ra 1 số ngẫu nhiên ! Mời bạn đoán !");
			System.out.println("--------------------");
			while(diem < 10 && diem > 0) {
				//System.out.println("Điểm của bạn : " + diem);
				System.out.print("Mời bạn đoạn số : ");
				int number = sc.nextInt();
				if(number >random || number < random) {
					diem = diem-1 ;
					System.out.println("Sai ! Bạn bị -1 điểm " );
					System.out.println("Điểm của bạn : " + diem);
				}
				else {
					diem = diem + 1;
					System.out.println("Đúng ! Bạn được +1 điểm " );
					System.out.println("Điểm của bạn : " + diem);
				}
			}
			if(diem ==0) {
				System.out.println("GAME OVER!!! ");
			}else if(diem==10) {
				System.out.println("Congratulations!You Win");
			}
			System.out.println("Bạn có muốn chơi tiếp không(có/không):");
			String s = new Scanner(System.in).nextLine();
			if(s.equalsIgnoreCase("không")) {
				System.out.println("BYE BYE THÍM !!");
				break;
			}
			
		}	
	}
}
