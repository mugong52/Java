package p114;

public class Lotto {

	public static void main(String[] args) {
		
		// 1. 로또 번호를 담아둘 길이가 6개인 정수 타입 배열 변수 생성
		int[] lotto = new int[6];
		
		int idx = 0;
		while (true) {
			// 2. 1~45까지의 번호 중에 하나를 뽑는다.
			/* Math.random 함수는 무엇인가
			 * 0~1 사이의 실수를 리턴
			 * Math.randome() * (max - min) + min; // 최대값은 제외, 최소값은 포함
			*/
			int number = (int)(Math.random() * 45 + 1);
			
			// 3. 뽑은 번호가 배열에 있다면 다시 뽑고, 없다면 배열에 넣는다.
			boolean insert = true;
			for (int i=0; i<=idx; i++) {
				if (lotto[i] == number) {
					insert = false;
					break;
				}
			}
			
			if (insert == true) {
				lotto[idx] = number;
				idx++;
			}
			
			// 4. 6개의 번호를 다 뽑을 때까지 반복
			if (idx == 6) break;
		}
		
		// 5. 6개의 번호 출력
		for (int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}
