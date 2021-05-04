// 예외 재발생: 메서드 내 발생하는 예외가 여러개일 때 try~catch문과 선언부 양쪽에서 처리하는 것.
// 			 try~catch문으로 예외 처리 후 강제로 예외 다시 발생시키는 방법으로 처리.

package p273;

public class ExceptionEx7 {

	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			System.out.println("main() 예외 처리");
			System.out.println(e.getMessage());
		}
	}
	
	static void first() throws Exception {
		try {
			second();
		} catch (Exception e) {
			System.out.println("first() 예외 처리");
			throw e;  // 예외 재발생
		}
	}
	
	static void second() throws Exception {
		try {
			throw new Exception("예외 발생");
		} catch (Exception e) {
			System.out.println("second() 예외 처리");
			throw e;  // 예외 재발생
		}
	}
}