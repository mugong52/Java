/*
추상적이다 : 대상을 추려서 나타낸 것 != 구체적
추상메서드 : 구현부가 없고, 선언부만 가지고 있는 메서드
추상메서드가 하나라도 있는 클래스는 추상클래스가 되어야 함.
추상클래스는 new 연산자를 사용해서 객체화할 수 없고, 부모 클래스로만 사용됨
자식 클래스는 부모 클래스에게 있는 추상메서드를 반드시 구현해야 함
구현한다 : 구현부(몸통)가 빠져 있는 추상메서드의 구현부를 채워준다 = 메서드 재정의(오버라이딩)
*/

package p216;

abstract class Shape {
	String type;
	Shape (String type) {
		this.type = type;
	}
	
	// 추상메서드 선언 : 접근제한자 abstract 리턴타입 메서드명(매개변수);
	// 구현부(몸통)와 중괄호 없음
	abstract double area();
	abstract double length();
}

class Circle extends Shape {
	int r;
	Circle(int r) {
		super ("원");
		this.r = r;
	}
	@Override
	double area() {
		return r * r * Math .PI;
	}
	@Override
	double length() {
		return 2 * r * Math .PI;
	}
	@Override
	public String toString() {
		return "Shape [type=" + type + ", r=" + r + "]";
	}
}

class Rectangle extends Shape {
	int width, height;
	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	
	@Override
	double area() {
		return width * height;
	}
	@Override
	double length() {
		return 2 * (width + height);
	}
	@Override
	public String toString() {
		return "Shape [type="+type+", width="+width+", height="+height+"]";
	}
}

public class ShapeEx {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5, 5);
		for (Shape s : shapes) {
			System.out.println(s);
			System.out.println("넓이:"+s.area()+" 둘레:"+s.length());
		}
	}
}
/*
추상메서드, 추상클래스 왜 만드는가?
1. 클래스 설계 시 변수와 메서드 이름을 공통적으로 적용하기 위해
2. 중복 소스 줄이기 위해
3. 다형성 개념 적용 가능 = 소스 수정 변경 용이
*/