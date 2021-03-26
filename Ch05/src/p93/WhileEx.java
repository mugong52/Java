package p93;

public class WhileEx {

	public static void main(String[] args) {
		
		// while (조건식) {실행문;}
		// 주의점 : 변수 i를 중괄호 블록 안에서 1씩 증가시키지 않는 경우 무한 반복(루프)
		
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("합계 : "+sum);
		
	}
	
}
