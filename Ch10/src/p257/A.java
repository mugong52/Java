// 내부클래스(중첩클래스): 클래스 안에 클래스
// 어떤 하나의 클래스에만 종속적으로 사용되는 클래스/인터페이스는 내부에 선언하면 편리

// 내부 클래스 - 멤버 클래스(클래스의 멤버) / 로컬 클래스(클래스 내부에 정의)
// 멤버 클래스: 객체 생성 후 어디서든 다시 사용 가능
// 로컬 클래스: 메서드 내에서만 사용

// 멤버 클래스 - static / 인스턴스
// static 내부 클래스: 바깥 클래스 객체 생성 없이 내부 클래스 객체 생성
//					Outer.inner inn = new Outer.Inner();
// 인스턴스 내부 클래스: 다른 곳에서 이 클래스의 객체 생성하려면 바깥 클래스 객체 생성 후 그 객체 변수를 이용해서 생성
//					Outer outer = new Outer();
//					Outer.Inner inn = outer.new Inner();

// 멤버 클래스: 바깥 클래스의 멤버와 같은 위치에 선언
// 로컬 클래스: 바깥 클래스의 메서드 내에 선언

package p257;

class A {  // 바깥 클래스
	A() {  // 바깥 클래스의 생성자
		System.out.println("A 객체 생성");
	}
	
	static class B {  // static 내부 클래스
		B() {  // static 내부 클래스의 생성자
			System.out.println("C 객체 생성");
		}
		
		int var1;
		static int var2;
		
		void method1() {
			System.out.println("static 내부 클래스의 method1()");
		}
		
		static void method2() {
			System.out.println("static 내부 클래스의 static method2()");
		}
	}
	
	public class C {  // 인스턴스 내부 클래스
		C() {  // 인스턴스 내부 클래스의 생성자
			System.out.println("B 객체 생성");
		}
		
		int var1;
		
		void method1() {
			System.out.println("인스턴스 내부 클래스의 method1()");
		}
	}
	
	void method() {  // 바깥 클래스의 메서드
		
		class D {  // 로컬 내부 클래스
			D() {
				System.out.println("D 객체 생성");
			}
			
			int var1;
			
			void method1() {
				System.out.println("로컬 내부 클래스의 method1()");
			}
		}
		
		D d = new D();
		d.var1 = 3;
		d.method1();
	}
}
