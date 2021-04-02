package p153;  // p154에 있는 내용이지만 Param 클래스를 사용하기 위해 같은 패키지에 저장

public class ParamEx2 {

	public static void main(String[] args) {
		
		Param p = new Param();
		// p.add(10.5, 5.5);  // 에러
		
		p.add((int)10.5, (int)5.5);  // 강제 형변환
		
	}
}
