package p158;

public class MethodCall {

	public static void main(String[] args) {
		
		// ���� ����
		Method.printName();
		
		// ��ü�� �����ؼ� ����
		Method m = new Method();
		m.printEmail();
	}
}

class Method {
	
	static void printName() {
		System.out.println("printName() ����");
	}
	
	void printEmail() {
		System.out.println("printEmail() ����");
		
		printId();  // �ٸ� �޼��� ����
	}
	
	void printId() {
		System.out.println("printId() ����");
	}
}