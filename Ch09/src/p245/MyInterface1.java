package p245;

public interface MyInterface1 {

	default void defaultMethod() {
		System.out.println("MyInterface1�� default �޼���");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface1�� static �޼���");
	}
}
