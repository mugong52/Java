package p267;

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);		
			System.out.println(3);		
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(5);  // try 블록 내에서 예외가 발생하지 않았기 때문에 catch 구문 실행 안 됨
		}			
		System.out.println(6);		
	}
}
