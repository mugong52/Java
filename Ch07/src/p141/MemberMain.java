package p141;

public class MemberMain {

	public static void main(String[] args) {
		
		Member m = new Member();
		Member m2 = new Member();
		
		if (m == m2) {
			System.out.println("m��ü�� m2��ü�� ����.");
		}else {
			System.out.println("m��ü�� m2��ü�� ���� �ʴ�.");
			// ���� �ڷ���(��ü����)������ �ּҰ� �ٸ�
		}
		
	}
}
/*
Member Ŭ���� : �ٸ� Ŭ�������� ����ϱ� ���� ���� ��
MemberMain Ŭ���� : ���α׷��� �����ϱ� ���� ���� ��

���α׷��� �����ϱ� ���� �������� main() �޼��尡 �ִ� Ŭ������ �ϳ�(MemberMain)�̰�,
������(Member)�� ���� �ٸ� Ŭ�������� ���Ǳ� ���� Ŭ����.
 */