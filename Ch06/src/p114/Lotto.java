package p114;

public class Lotto {

	public static void main(String[] args) {
		
		// 1. �ζ� ��ȣ�� ��Ƶ� ���̰� 6���� ���� Ÿ�� �迭 ���� ����
		int[] lotto = new int[6];
		
		int idx = 0;
		while (true) {
			// 2. 1~45������ ��ȣ �߿� �ϳ��� �̴´�.
			/* Math.random �Լ��� �����ΰ�
			 * 0~1 ������ �Ǽ��� ����
			 * Math.randome() * (max - min) + min; // �ִ밪�� ����, �ּҰ��� ����
			*/
			int number = (int)(Math.random() * 45 + 1);
			
			// 3. ���� ��ȣ�� �迭�� �ִٸ� �ٽ� �̰�, ���ٸ� �迭�� �ִ´�.
			boolean insert = true;
			for (int i=0; i<=idx; i++) {
				if (lotto[i] == number) {
					insert = false;
					break;
				}
			}
			
			if (insert == true) {
				lotto[idx] = number;
				idx++;
			}
			
			// 4. 6���� ��ȣ�� �� ���� ������ �ݺ�
			if (idx == 6) break;
		}
		
		// 5. 6���� ��ȣ ���
		for (int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
}
