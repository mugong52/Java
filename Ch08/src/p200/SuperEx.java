package p200;

public class SuperEx {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		System.out.println();
		
		child.print();
		
	}
}

class Parent {
	
	int number = 3;
	
	Parent() {
		System.out.println("부모 객체 생성");
	}
}

class Child extends Parent {
	
	int number = 2;
	
	Child() {
		System.out.println("자식 객체 생성");
	}
	
	void print() {
		int number = 1;
		System.out.println(number);  // 아무것도 붙지 않으면 가장 가까이에 있는 변수 참조
		System.out.println(this.number);  // this : 자신 객체의 변수, 상위 객체의 변수 순서대로 찾음
		System.out.println(super.number);  // super : 부모 객체의 변수 참조
	}
}