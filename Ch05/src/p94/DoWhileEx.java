package p94;

public class DoWhileEx {

	public static void main(String[] args) {
		
		// do {���๮;} while (���ǽ�);
		// ó�� ���๮�� �ѹ� ����ǰ� ���ǽ��� Ȯ���ؼ� true�̸� �ݺ�
		
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 100);
		System.out.println("�հ� : "+sum);
		
		
		int x = 10;
		do {
			System.out.println("x = "+x);
		} while (x < 10);
		// ���ǽ��� �������� �ʴµ��� "x = "+x �� ��¹��� �����
		
	}
	
}
