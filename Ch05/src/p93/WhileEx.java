package p93;

public class WhileEx {

	public static void main(String[] args) {
		
		// while (���ǽ�) {���๮;}
		// ������ : ���� i�� �߰�ȣ ��� �ȿ��� 1�� ������Ű�� �ʴ� ��� ���� �ݺ�(����)
		
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("�հ� : "+sum);
		
	}
	
}
