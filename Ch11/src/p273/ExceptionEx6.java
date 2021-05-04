// 메서드 선언부에 throws 키워드 사용해서 예외 선언하기 (처리해야 할 예외 여러개라면 콤마로 구분해서 적기)

package p273;

public class ExceptionEx6 {
	
	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void first() throws Exception {  // throw(예외 발생) =/= throws(예외 처리)
		second();
	}
	
	static void second() throws Exception {
		throw new Exception ("예외 발생");
	}

}
