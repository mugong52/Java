package p273;

public class ExceptionEx5 {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		try {
			throw new Exception("���� �߻�");  // throw Ű���� ���: ���� ���� �߻�
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� ����");
	}
}
