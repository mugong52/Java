package p230;

public interface InterfaceEx {

	// ���
	public int MIN_PRICE = 0;
	public int MAX_PRICE = 100000;
	
	// �߻� �޼���
	public double meanPrice();
	public double totalPrice();
	
	// default �޼��� (������ �ۼ�)
	default double getSalePrice(double price) {
		return price - (price * 0.05);
	}
	
	// static �޼��� : ��ü ���� �������̽������� ȣ�� ����
	static void printPrice(double price) {
		System.out.println(price);
	}
}
/* �������̽��� Ư¡
1. Ŭ���� �� ���, �������̽��� Ŭ���� �� ����
2. ��ü���� �Ұ�, ���� Ŭ������ ��ü ����
3. ���� ���� ���� (�ϳ��� Ŭ�������� ���� ���� �������̽��� ���� ����)
4. �������̽����� ��� ���� (�������̽� ���� ���� ��ӵ� ����)
5. �������̽��� ��� ����� ���� �����ڴ� public
6. �������̽��� ��� ��� ������ final�� ���� ��� */