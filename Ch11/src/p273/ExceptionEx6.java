// �޼��� ����ο� throws Ű���� ����ؼ� ���� �����ϱ� (ó���ؾ� �� ���� ��������� �޸��� �����ؼ� ����)

package p273;

public class ExceptionEx6 {
	
	public static void main(String[] args) {
		try {
			first();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void first() throws Exception {  // throw(���� �߻�) =/= throws(���� ó��)
		second();
	}
	
	static void second() throws Exception {
		throw new Exception ("���� �߻�");
	}

}
