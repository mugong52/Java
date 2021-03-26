package p102;

public class ContinueEx {

	public static void main(String[] args) {

		for (int i=0; i<10; i++) {
			if (i == 5) {
				continue;
				// 실행문을 더 이상 실행하지 않고 다음 반복으로 계속됨
				// 즉 해당 반복문만 중지하는 것
			}
			System.out.println(i);
		}
	}

}
