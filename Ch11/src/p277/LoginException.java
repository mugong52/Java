// 사용자 정의 예외 클래스

package p277;

public class LoginException extends Exception {

	LoginException (String msg) {
		super(msg);
	}
}
