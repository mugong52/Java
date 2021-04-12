package p206;

public class PolyEx {

	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.run();
		
		// 부모클래스의 자료형으로 선언 (자동형변환)
		Parent p = new Child();
		// 자료형(타입)은 Parent인데 객체는 Child() 생성자를 통해 생성된 Child 객체
		// Parent 클래스가 Child 클래스보다 크기 때문에 Parent 타입으로 자동형변환(다형성)
		// 다형성 : 하위클래스 객체를 상위 클래스 자료형으로 변환이 가능하다
		
		p.run();  // 재정의된 메서드가 실행
//		p.eat();  // 에러
	}
}
