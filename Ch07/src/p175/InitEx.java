package p175;

public class InitEx {

	// 생성자
	InitEx() {
		System.out.println("생성자 호출");
	}
	
	// 초기화 블럭 : 생성자보다 먼저 실행됨
	// static 초기화 블럭 : 클래스가 메모리에 로드될 때 한번만 실행됨
	static {
		System.out.println("클래스 초기화 블럭 실행");
	}
	
	// 인스턴스 초기화 블럭 : 객체가 생성될 때마다 실행됨
	{
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	public static void main(String[] args) {
		System.out.println("main 메서드시작");
		System.out.println("main init1 객체 생성");
		InitEx init1 = new InitEx();
		System.out.println("main init2 객체 생성");
		InitEx init2 = new InitEx();
	}
	
}
