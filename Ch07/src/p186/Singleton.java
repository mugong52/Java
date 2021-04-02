// 싱글톤 : 객체의 무분별한 생성을 막기 위해 하나의 객체만 생성되도록 프로그래밍을 하는 기법
// 디자인 패턴(Design Pattern) : 클래스가 객체를 생성하는 방법을 별도로 정의하는 것
package p186;

public class Singleton {

	// static 변수 - 클래스가 로드될 때 초기 한번만 실행됨
	private static Singleton instance = new Singleton();
	
	// 생성자에 private 접근 제한자 - 외부 클래스에서는 실행할 수 없도록 제한
	private Singleton() {
		System.out.println("객체 생성");
	}
	
	// static 메서드 - 객체 생성 없이 직접 호출 가능
	public static Singleton getInstance() {
		System.out.println("객체 리턴");
		return instance;
	}
	// 하나의 객체만 사용해서 사용하게 됨
}
