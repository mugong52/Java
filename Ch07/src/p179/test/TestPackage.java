package p179.test;  // src/p179/test 폴더에 위치
/* 패키지 이름 작성 규칙
 * 숫자로 시작할 수 없고, _, $외 특수문자 사용 불가
 * 관례적으로 소문자로 작성
 * 회사에서는 회사 도메인으로 많이 사용
 */

public class TestPackage {

	public void method() {
		System.out.println("p179.test 패키지의 TestPackage 클래스");
	}
}
// main() 메서드가 없고 method() 메서드 하나만 존재하는 클래스
// 실행하기 위한 클래스가 아니라 다른 곳에서 사용되기 위한 클래스