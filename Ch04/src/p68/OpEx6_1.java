package p68;

public class OpEx6_1 {
	
	public static void main(String[] args) {
		
		// ��Ʈ ����Ʈ����
		// << ���� : ���� ��Ʈ�� ������ ����ŭ �̵�(���ڸ��� 0���� ä��)
		System.out.println(3 << 2);
		System.out.println("3�� ������ : "+Integer.toBinaryString(3));
		System.out.println("12�� ������ : "+Integer.toBinaryString(12));
		
		// >> ���� : ���� ��Ʈ�� ������ ����ŭ �̵�(���ڸ��� ��ȣ��Ʈ�� ä��)
		System.out.println(8 >> 2);
		System.out.println("8�� ������ : "+Integer.toBinaryString(8));
		System.out.println("2�� ������ : "+Integer.toBinaryString(2));
		
		// >>> ���� : ���� ��Ʈ�� ������ ����ŭ �̵�(���ڸ��� 0���� ä��)
		System.out.println(-8 >>> 3);
		System.out.println("-8�� ������ : "+Integer.toBinaryString(-8));
		System.out.println("-8 >>> 3 : "+Integer.toBinaryString(-8 >>> 3));
	}

}
