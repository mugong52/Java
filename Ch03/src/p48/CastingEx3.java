package p48;

public class CastingEx3 {

	public static void main(String[] args) {
		
		//강제형변환 예시
		double score = 100;
		
		int score2 = (int)score;
		
		System.out.println("score : "+score);
		System.out.println("score2 : "+score2);
		// 값 손실 발생하지 않고 출력형태만 달라짐
	}
}
