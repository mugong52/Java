package p245;

public class Child extends Parent implements MyInterface1, MyInterface2 {

	@Override
	public void defaultMethod() {
		System.out.println("Child Ŭ������ default �޼���");
		MyInterface1.super.defaultMethod();
		MyInterface2.super.defaultMethod();
	}

}
