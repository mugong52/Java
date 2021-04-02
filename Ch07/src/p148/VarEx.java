// 필드 = 멤버 변수 = 클래스 변수, 인스턴스 변수
// 변수 : 클래스 변수, 인스턴스 변수, 지역 변수
// 클래스 변수 : static 키워드 붙임. 모든 객체가 공유되는 변수. 객체 생성 없이 사용 가능. 클래스명.클래스변수명
// 인스턴스 변수 : 객체 생성 시 생성. 객체는 서로 독립적이기 때문에 이 변수 역시 객체마다 독립적인 값을 가짐. 객체명.인스턴스변수명
package p148;

public class VarEx {

	public static void main(String[] args) {
		
		// 클래스 변수 사용
		System.out.println("Avante 제조사 : "+Avante.company);
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		// 인스터스 변수의 값 변경
		a1.color = "화이트";
		a2.color = "블랙";
		
		// 인스턴스 변수 출력
		System.out.println("a1 색상 : "+a1.color);
		System.out.println("a2 색상 : "+a2.color);
		
		// 클래스 변수를 인스턴스 객체로 출력
		System.out.println("a1 제조사 : "+a1.company);
		System.out.println("a2 제조사 : "+a2.company);
		
		// 클래스 변수의 값 변경
		a1.company = "기아";
		
		// 클래스 변수의 값 변경 후 클래스변수와 인스턴스변수 출력
		System.out.println("Avante 제조사 : "+Avante.company);
		System.out.println("a1 제조사 : "+a1.company);
		System.out.println("a2 제조사 : "+a2.company);
	}
}

class Avante {
	
	String color;  // 인스턴스 변수
	static String company = "현대";  // 클래스 변수
	
}
