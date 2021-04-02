// 객체를 배열에 저장
package p144;  // p145에 있는 내용이지만 Car 클래스를 사용하기 위해 같은 패키지에 저장

public class CarMain2 {

	public static void main(String[] args) {
		
		// Car 타입의 배열객체 생성
		Car[] cars = new Car[3];
		
		// car 객체 생성
		Car tico = new Car();
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";
		
		// 모든 인덱스에 tico 객체 저장
		for (int i=0; i<cars.length; i++) {
			cars[i] = tico;
		}
		
		System.out.println("2번 인덱스 color : "+cars[2].color);
		
		cars[0].color = "블랙";  // 0번 인덱스 객체의 color 필드에 "블랙" 대입
		System.out.println("2번 인덱스 color : "+cars[2].color);
		// cars[0], cars[1], cars[2] 모두 같은 주소값 가짐
		// 값이 저장된 곳은 하나고 이 값을 바꾸면 이 값을 참조하고 있는 모든 변수도 바뀐 값 참조
		
		System.out.println();
		
		// Car 타입의 배열객체 생성
		Car[] cars2 = new Car[3];
		
		// 모든 인덱스에 new 연산자로 객체 생성 후 저장
		for (int i=0; i<cars.length; i++) {
			cars2[i] = new Car();
			cars2[i].color = "화이트";
			cars2[i].company = "대우";
			cars2[i].type = "경차";
		}
		
		System.out.println("0번 인덱스 color : "+cars2[0].color);
		System.out.println("1번 인덱스 color : "+cars2[1].color);
		System.out.println("2번 인덱스 color : "+cars2[2].color);
		
		cars2[0].color = "블랙";  // 0번 인덱스 객체의 color 필드에 "블랙" 대입
		System.out.println("0번 인덱스 color : "+cars2[0].color);
		System.out.println("1번 인덱스 color : "+cars2[1].color);
		System.out.println("2번 인덱스 color : "+cars2[2].color);
	}
}
/* 클래스는 사용자 정의 자료형, 사용자 정의 자료형은 참조 자료형.
 * 참조 자료형은 값을 직접 저장하는게 아니라, 저장된 위치의 주소값을 저장하기 때문에
 * 독립된 별도의 객체를 생성하려면 new 연산자를 통해 다른 객체로 생성해야 한다.
 * ...이해못함 
 */