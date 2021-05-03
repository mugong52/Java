package p255;

public class LocalInnerEx {  // �ٱ� Ŭ����

	int i = 10;
	
	void outerMethod() {
		class Inner {  // ���� Ŭ����
			int x=20;  // �޼��� ��������
			int i=30;  // �޼��� ��������
			void innerMethod() {
				System.out.println(x);
				System.out.println(i);  // ���� Ŭ������ i����
				System.out.println(this.i);  // ���� Ŭ������ i����
				System.out.println(LocalInnerEx.this.i);  // �ٱ� Ŭ������ i����
			}
		}
		
		Inner inn = new Inner();
		inn.innerMethod();
		
	}
	
	public static void main(String[] args) {
		LocalInnerEx lic = new LocalInnerEx();
		lic.outerMethod();
	}
	
}
