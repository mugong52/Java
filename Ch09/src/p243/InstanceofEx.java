package p243;

public class InstanceofEx {

	public static void main(String[] args) {
		A a = new AAA();
		
		AA aa = new AAA();
		AAA aaa = new AAA();
		
		A b = new ABB();
		AB ab = new ABB();
		ABB abb = new ABB();
		
		System.out.println("a > A : " + (a instanceof A));
		System.out.println("aa > A : " + (aa instanceof A));
		System.out.println("aaa > A : " + (aaa instanceof A));
		
		System.out.println("aaa > AB : " + (aaa instanceof AB));
	}
}
// instanceof : 앞에 객체가 뒤쪽 클래스(인터페이스)의 객체인가? 라는 질문의 대답이 결과로 나옴
