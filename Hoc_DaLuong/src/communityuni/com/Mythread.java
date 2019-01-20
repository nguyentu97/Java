package communityuni.com;

import java.util.Random;

public class Mythread extends Thread {

	public static void findMax(int[]M,int numThread ) {

		Random rd = new Random();
		for (int i = 0; i < M.length; i++) {
			M[i] = rd.nextInt(100);
		}
		// Xuất mảng	
		for (int i = 0; i < M.length; i++) {
			System.out.print(M[i] + "\t");
		}
		//tim Max
		int max=M[0];
		for(int i = 0; i < M.length; i++) {
			if(max<M[i]) {
				max = M[i];
			}
		}
		System.out.println(max);
	}





	@Override
	public void run() {
		super.run();
		for(int i = 0 ; i <10;i++) {
			try {
				Thread.sleep(500);
				System.out.println(getName()+":i = "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.start();
		Mythread t1 = new Mythread();
		t1.start();


	}

}
