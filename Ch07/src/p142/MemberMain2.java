package p142;

public class MemberMain2 {

	public static void main(String[] args) {
		
		MemberMain2 m = new MemberMain2();
		MemberMain2 m2 = new MemberMain2();
		
		if (m == m2) {
			System.out.println("m개체와 m2객체는 같다.");
		} else {
			System.out.println("m개체와 m2객체는 같지 않다.");
		}
	}
}
/* 
자기 자신의 객체를 생성한 것. MemberMain과 실행 결과는 동일.
하지만 객체 지향 프로그램에서는 객체를 부품으로 나눠서 조립하는 형태로 실행하는 것이 좋다.
 */