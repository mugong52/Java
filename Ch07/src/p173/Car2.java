// this ������ : �����ڰ��� ���� ������ ��, �Ǵ� ���������μ��� "��ü �ڽ�"
package p173;

public class Car2 {

	// �ʵ�
	String color;
	String company;
	String type;
	
	// this ������
	Car2() {
		this("white", "���", "����");
	}
	
	Car2(String color, String company, String type) {
		// ���⼭�� this�� ��ü �ڽ�
		// �̷��� this.�� ���� ������ �Ű����� �̸��� �ʵ� �̸��� ���� ������ �����ϱ� ���ؼ�
		// this�� �޼ҵ� ������ ������ ������ �ν��Ͻ� ������ �̸��� ���� �� �ν��Ͻ� ������ �����ϱ� ���� ����
		// ��ü�� �ʱ�ȭ�ϰų�, �ʵ忡 ���� �����ϴ� ��� ���� ���Ǵ� ����
		this.color = color;
		this.company = company;
		this.type = type;
	}
	
	Car2(String com, String t) {
		this("white", com, t);
	}
	
	Car2(String t) {
		this("white", "���", t);
	}
	
	// �̰� ���ٳ�
	public String toString() {
		return color + "-" + company + "-" + type;
	}
}
