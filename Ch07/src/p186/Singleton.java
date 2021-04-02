// �̱��� : ��ü�� ���к��� ������ ���� ���� �ϳ��� ��ü�� �����ǵ��� ���α׷����� �ϴ� ���
// ������ ����(Design Pattern) : Ŭ������ ��ü�� �����ϴ� ����� ������ �����ϴ� ��
package p186;

public class Singleton {

	// static ���� - Ŭ������ �ε�� �� �ʱ� �ѹ��� �����
	private static Singleton instance = new Singleton();
	
	// �����ڿ� private ���� ������ - �ܺ� Ŭ���������� ������ �� ������ ����
	private Singleton() {
		System.out.println("��ü ����");
	}
	
	// static �޼��� - ��ü ���� ���� ���� ȣ�� ����
	public static Singleton getInstance() {
		System.out.println("��ü ����");
		return instance;
	}
	// �ϳ��� ��ü�� ����ؼ� ����ϰ� ��
}
