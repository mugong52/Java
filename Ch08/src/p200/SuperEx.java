package p200;

public class SuperEx {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		System.out.println();
		
		child.print();
		
	}
}

class Parent {
	
	int number = 3;
	
	Parent() {
		System.out.println("�θ� ��ü ����");
	}
}

class Child extends Parent {
	
	int number = 2;
	
	Child() {
		System.out.println("�ڽ� ��ü ����");
	}
	
	void print() {
		int number = 1;
		System.out.println(number);  // �ƹ��͵� ���� ������ ���� �����̿� �ִ� ���� ����
		System.out.println(this.number);  // this : �ڽ� ��ü�� ����, ���� ��ü�� ���� ������� ã��
		System.out.println(super.number);  // super : �θ� ��ü�� ���� ����
	}
}