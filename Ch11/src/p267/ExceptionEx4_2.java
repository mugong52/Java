package p267;

public class ExceptionEx4_2 {

	public static void main(String[] args) {
		System.out.println("DB���� ����");
		try {
			System.out.println("DB�۾�");
			System.out.println(3/0);
		} catch (Exception e) {
			System.out.println("DB�۾� �� ���ܹ߻�");
		} finally {
			System.out.println("DB���� ����");
		}
	}
}
// try ������ ����ϸ� �ݵ�� �ϳ� �̻��� catch �����̳� finally�� �����ؾ� ��