package p150;

public class LocalValEx {

	public static void main(String[] args) {
		
		Local local = new Local();
		
		System.out.println(local.name);  // null
		
		local.process();
		System.out.println(local.name);  // ȫ�浿
		
		local.printAge1();
		local.printAge2();
		
		// for�� ��� �������� ���� ����
		for (int i=0; i<10; i++) {
			int temp = 0;
			temp += 1;
		}
		
		// System.out.println(temp);  // ����
	}
}

class Local {
	
	String name;  // Ŭ������ �ν��Ͻ� ������ ��������
	
	void process() {
		name = "ȫ�浿";
	}
	void printAge1() {
		int age = 20;  // ��������
		System.out.println(age);
	}
	void printAge2() {
		int age = 30;  // ��������
		System.out.println(age);
	}
}
// ���������� ��밡���� ���� �߰�ȣ ���({})
