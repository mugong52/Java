package p222;

public class FinalMethod {

	// ������ ������ �޼���
	void method() {
		
	}
	
	// �����ǰ� �Ұ����� �޼���
	final void finalMethod() {
		
	}
}

class SubFianllMethod extends FinalMethod {
	
	void method() { // ������ ����
		System.out.println("method() ������");
	}
	
//	void finalMethod() { // ������ �Ұ�
//		System.out.println("finalMehtod() ������");
//	}
}
