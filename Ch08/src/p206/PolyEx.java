package p206;

public class PolyEx {

	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.run();
		
		// �θ�Ŭ������ �ڷ������� ���� (�ڵ�����ȯ)
		Parent p = new Child();
		// �ڷ���(Ÿ��)�� Parent�ε� ��ü�� Child() �����ڸ� ���� ������ Child ��ü
		// Parent Ŭ������ Child Ŭ�������� ũ�� ������ Parent Ÿ������ �ڵ�����ȯ(������)
		// ������ : ����Ŭ���� ��ü�� ���� Ŭ���� �ڷ������� ��ȯ�� �����ϴ�
		
		p.run();  // �����ǵ� �޼��尡 ����
//		p.eat();  // ����
	}
}
