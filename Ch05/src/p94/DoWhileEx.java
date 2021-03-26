package p94;

public class DoWhileEx {

	public static void main(String[] args) {
		
		// do {실행문;} while (조건식);
		// 처음 실행문은 한번 실행되고 조건식을 확인해서 true이면 반복
		
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 100);
		System.out.println("합계 : "+sum);
		
		
		int x = 10;
		do {
			System.out.println("x = "+x);
		} while (x < 10);
		// 조건식이 만족하지 않는데도 "x = "+x 의 출력문이 실행됨
		
	}
	
}
