// this 생성자 : 생성자간에 서로 실행할 때, 또는 참조변수로서의 "객체 자신"
package p173;

public class Car2 {

	// 필드
	String color;
	String company;
	String type;
	
	// this 생성자
	Car2() {
		this("white", "기아", "경차");
	}
	
	Car2(String color, String company, String type) {
		// 여기서의 this가 객체 자신
		// 이렇게 this.를 붙인 이유는 매개변수 이름과 필드 이름이 같기 때문에 구분하기 위해서
		// this는 메소드 내에서 선언한 변스와 인스턴스 변수의 이름이 같을 때 인스턴스 변수를 지정하기 위해 사용됨
		// 객체를 초기화하거나, 필드에 값을 세팅하는 경우 자주 사용되는 구문
		this.color = color;
		this.company = company;
		this.type = type;
	}
	
	Car2(String com, String t) {
		this("white", com, t);
	}
	
	Car2(String t) {
		this("white", "기아", t);
	}
	
	// 이건 뭐다냐
	public String toString() {
		return color + "-" + company + "-" + type;
	}
}
