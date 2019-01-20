package communitiuni.com.model;

import java.util.Scanner;

public class Question implements Complexity {

	@Override
	public int getComplexity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setComplexity(int Complexity) {
		// TODO Auto-generated method stub

	}
	public String getQuestion() {
		System.out.println("Bác hồ sinh ngày 2-9 đúng hay không(đúng/sai) ?");
		String nhap = new Scanner(System.in).nextLine();
		return nhap;
	}
	public String getAnswer() {
			return "Đúng";

	}
	public boolean answerCorrect() {
		if(getAnswer()==getQuestion()){
			System.out.println("Câu trả lời chính xác!");;
		}else {
			System.out.println("Trả lời sai!");
		}
		return false ;

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
