package p127;

public class ArrEx16 {

	public static void main(String[] args) {
		
		// �迭
		int[] arrInt = {1,2,3,4,5};
		
		// ���� for���� �̿��� ���
		for (int i=0; i<arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		
		// ���� for���� �̿��� ���
		for (int number : arrInt) {
			System.out.println(number);
		}
	}
}
