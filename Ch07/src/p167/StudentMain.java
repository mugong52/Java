package p167;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu = new Student("ȫ�浿", 4, "����Ʈ�������");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student stu2 = new Student("�̼���", 3, "������");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		// �⺻ �����ڷ� ��ü ����
		// Student stu0 = new Student();  // ���� �߻�
		// �Ű������� �ִ� �����ڸ� ������ ��� �⺻ �����ڰ� �ڵ����� �߰����� �ʱ� ������
		// ���� �����ؾ� �Ѵ�.
		
		// �����ε��� �����ڷ� ��ü ����
		Student stuA = new Student("ȫ�浿");  // a�� ������
		Student stuB = new Student("ȫ�浿", 4);  // b�� ������
	}
}
