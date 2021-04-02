package p188;

public class FinalEx {

	public static void main(String[] args) {
		
		Final f = new Final();
//		f.number = 200;  // 에러
	}
}

class Final {
	final int number;
	
	Final() {
		number = 100;
	}
}
// final 키워드로 선언된 변수는 더 이상 값 변경 불가
// 생성자를 통해 초기화하는 겨우에는 변경 가능. 객체마다 다른 값 가질 수 있도록 하기 위함.