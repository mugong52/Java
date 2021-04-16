package p230;

public interface InterfaceEx {

	// 상수
	public int MIN_PRICE = 0;
	public int MAX_PRICE = 100000;
	
	// 추상 메서드
	public double meanPrice();
	public double totalPrice();
	
	// default 메서드 (구현부 작성)
	default double getSalePrice(double price) {
		return price - (price * 0.05);
	}
	
	// static 메서드 : 객체 없이 인터페이스만으로 호출 가능
	static void printPrice(double price) {
		System.out.println(price);
	}
}
/* 인터페이스의 특징
1. 클래스 간 상속, 인터페이스와 클래스 간 구현
2. 객체생성 불가, 구현 클래스로 객체 생성
3. 다중 구현 가능 (하나의 클래스에서 여러 개의 인터페이스를 구현 가능)
4. 인터페이스간의 상속 가능 (인터페이스 간은 다중 상속도 가능)
5. 인터페이스의 모든 멤버의 접근 제한자는 public
6. 인터페이스의 모든 멤버 변수는 final이 붙은 상수 */