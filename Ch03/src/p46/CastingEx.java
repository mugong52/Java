package p46;

public class CastingEx {

	public static void main(String[] args) {
		/*
		 * �ڵ�����ȯ
		 * ū ũ�� �ڷ��� = ���� ũ�� �ڷ���
		 * byte < short < int < long < float < double
		*/
		// �ڵ�����ȯ ����
		int number = 10;  // int �ڷ���
		
		long number2 = number;  // �ڵ�����ȯ int < long
		
		System.out.println(number2);
	}
}
