package p245;

public interface MyInterface2 {

	default void defaultMethod() {
		System.out.println("MyInterface2�� default �޼���");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface2�� static �޼���");
	}
}
