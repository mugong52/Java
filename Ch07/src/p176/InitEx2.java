package p176;

public class InitEx2 {

	// static ����
	static int sVar;
	// static �޼���
	static void sMethod() {
		
	}
	
	// �ν��Ͻ� ����
	int var;
	// �ν��Ͻ� �޼���
	void method() {
		
	}
	
	// static �ʱ�ȭ��
	static {
		sVar = 0;
		sMethod();
		
		// ����(�ν��Ͻ� ����, �޼��� ��� �Ұ�)
//		var = 0;
//		method();
	}
	
	// static �޼���
	static void sMethod2() {
		
		// ����(static �޼��忡�� this Ű���� ���Ұ�)
//		this.sVar = 0;
//		this.sMethod();
	}
}
// static �ʱ�ȭ ����� �ַ� Ŭ���� ����(static ����)�� �ʱ�ȭ ���
// �ν��Ͻ� �ʱ�ȭ ����� �ַ� �ν��ϼ� ������ �ʱ�ȭ ���
// ������ �����ڵ� �ν��Ͻ� ������ �ʱ�ȭ�� ���� ���Ǳ� ������ �ν��Ͻ� ����� ���� ������� ���� 
