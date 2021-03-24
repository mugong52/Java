package p46;

public class CastingEx {

	public static void main(String[] args) {
		/*
		 * 자동형변환
		 * 큰 크기 자료형 = 작은 크기 자료형
		 * byte < short < int < long < float < double
		*/
		// 자동형번환 예시
		int number = 10;  // int 자료형
		
		long number2 = number;  // 자동형변환 int < long
		
		System.out.println(number2);
	}
}
