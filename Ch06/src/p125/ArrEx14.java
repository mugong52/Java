package p125;

public class ArrEx14 {

	public static void main(String[] args) {
		
		// ���� �迭
		int[] arrInt = {1, 2, 3};
		
		// ������ �迭
		int[] arrInt2 = new int[5];
		
		System.arraycopy(arrInt, 0, arrInt2, 2, arrInt.length);
		// arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length)
		
		// �迭 �� ���
		for (int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}
}
