// ������ : Ŭ������(�Ű�����...) {�ʱ�ȭ ���๮...}
package p167;

public class Student {

	// �ʵ�
	String name;
	int grade;
	String department;
	
	// ������
	Student(String n, int g, String d) {
		name = n;
		grade = g;
		department = d;
	}
	
	// ������ �����ε�
	// a�� ������
	Student(String n) {
		name = n;
	}
	
	// b�� ������
	Student(String n, int g) {
		name = n;
		grade = g;
	}
	
	// ���� �߻� : �Ű������� Ÿ�԰� ������ �ٸ� �����ڿ� �����ϸ� �ߺ����� �ν�
//	Studnet(String d, int g) {
//		department = d;
//		grade = g;
//	}
}
