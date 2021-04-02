package P184.test.test2;

import P184.test.*;

public class ClassC {
	public static void main(String[] args) {
		
		ClassA ca = new ClassA();
		ca.print();
		
		// ClassB cb = new ClassB();  // 접근제한자(default) 때문에 에러
	}
}
