package p176;

public class InitEx2 {

	// static 변수
	static int sVar;
	// static 메서드
	static void sMethod() {
		
	}
	
	// 인스턴스 변수
	int var;
	// 인스턴스 메서드
	void method() {
		
	}
	
	// static 초기화블럭
	static {
		sVar = 0;
		sMethod();
		
		// 에러(인스턴스 변수, 메서드 사용 불가)
//		var = 0;
//		method();
	}
	
	// static 메서드
	static void sMethod2() {
		
		// 에러(static 메서드에서 this 키워드 사용불가)
//		this.sVar = 0;
//		this.sMethod();
	}
}
// static 초기화 블록은 주로 클래스 변수(static 변수)의 초기화 담당
// 인스턴스 초기화 블록은 주로 인스턴수 변수의 초기화 담당
// 하지만 생성자도 인스턴스 변수의 초기화로 많이 사용되기 때문에 인스턴스 블록은 자주 사용하지 않음 
