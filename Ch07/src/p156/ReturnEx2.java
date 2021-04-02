package p156;

public class ReturnEx2 {
	
	public static void main(String[] args) {
		
		Return2 obj = new Return2();
		
		obj.getTest(0);
		obj.getTest(1);
		
		System.out.println();
		
		System.out.println(obj.getName(0));
		System.out.println(obj.getName(1));
		
	}

}

class Return2 {
	
	void getTest(int type) {
		System.out.println("getTest() 메서드 시작");
		
		if (type == 1) {
			return;
		}
		
		System.out.println("getTest() 메서드 끝");
	}
	
	String getName(int type) {
		
		if (type == 1) {
			return "빈 문자열이 있었던 자리 헷갈려서 값 입력함";
		}
		
		return "홍길동";
	}
}
