package p63;

public class OpEx5_2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// & ����
		System.out.println(a == b & test());
		
		// && ���� (�������� false�� �������� Ȯ��X)
		System.out.println(a == b && test());
	}
	
	public static boolean test() {
		System.out.println("test()�޼��� �����");
		return true;
	}
}
