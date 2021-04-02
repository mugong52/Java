package p141;

public class MemberMain {

	public static void main(String[] args) {
		
		Member m = new Member();
		Member m2 = new Member();
		
		if (m == m2) {
			System.out.println("m개체와 m2객체는 같다.");
		}else {
			System.out.println("m개체와 m2객체는 같지 않다.");
			// 같은 자료형(객체변수)이지만 주소값 다름
		}
		
	}
}
/*
Member 클래스 : 다른 클래스에서 사용하기 위해 만든 것
MemberMain 클래스 : 프로그램을 실행하기 위해 만든 것

프로그램을 실행하기 위한 시작점인 main() 메서드가 있는 클래스는 하나(MemberMain)이고,
나머지(Member)는 전부 다른 클래스에서 사용되기 위한 클래스.
 */