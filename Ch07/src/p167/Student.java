// 생성자 : 클래스명(매개변수...) {초기화 실행문...}
package p167;

public class Student {

	// 필드
	String name;
	int grade;
	String department;
	
	// 생성자
	Student(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
	}
	
	// 생성자 오버로딩
	// a번 생성자
	Student(String n) {
		name = n;
	}
	
	// b번 생성자
	Student(String n, int g) {
		name = n;
		grade = g;
	}
	
	// 에러 발생 : 매개변수의 타입과 순서가 다른 생성자와 동일하면 중복으로 인식
//	Studnet(String d, int g) {
//		department = d;
//		grade = g;
//	}
}
