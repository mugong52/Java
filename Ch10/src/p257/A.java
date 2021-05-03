// ����Ŭ����(��øŬ����): Ŭ���� �ȿ� Ŭ����
// � �ϳ��� Ŭ�������� ���������� ���Ǵ� Ŭ����/�������̽��� ���ο� �����ϸ� ��

// ���� Ŭ���� - ��� Ŭ����(Ŭ������ ���) / ���� Ŭ����(Ŭ���� ���ο� ����)
// ��� Ŭ����: ��ü ���� �� ��𼭵� �ٽ� ��� ����
// ���� Ŭ����: �޼��� �������� ���

// ��� Ŭ���� - static / �ν��Ͻ�
// static ���� Ŭ����: �ٱ� Ŭ���� ��ü ���� ���� ���� Ŭ���� ��ü ����
//					Outer.inner inn = new Outer.Inner();
// �ν��Ͻ� ���� Ŭ����: �ٸ� ������ �� Ŭ������ ��ü �����Ϸ��� �ٱ� Ŭ���� ��ü ���� �� �� ��ü ������ �̿��ؼ� ����
//					Outer outer = new Outer();
//					Outer.Inner inn = outer.new Inner();

// ��� Ŭ����: �ٱ� Ŭ������ ����� ���� ��ġ�� ����
// ���� Ŭ����: �ٱ� Ŭ������ �޼��� ���� ����

package p257;

class A {  // �ٱ� Ŭ����
	A() {  // �ٱ� Ŭ������ ������
		System.out.println("A ��ü ����");
	}
	
	static class B {  // static ���� Ŭ����
		B() {  // static ���� Ŭ������ ������
			System.out.println("C ��ü ����");
		}
		
		int var1;
		static int var2;
		
		void method1() {
			System.out.println("static ���� Ŭ������ method1()");
		}
		
		static void method2() {
			System.out.println("static ���� Ŭ������ static method2()");
		}
	}
	
	public class C {  // �ν��Ͻ� ���� Ŭ����
		C() {  // �ν��Ͻ� ���� Ŭ������ ������
			System.out.println("B ��ü ����");
		}
		
		int var1;
		
		void method1() {
			System.out.println("�ν��Ͻ� ���� Ŭ������ method1()");
		}
	}
	
	void method() {  // �ٱ� Ŭ������ �޼���
		
		class D {  // ���� ���� Ŭ����
			D() {
				System.out.println("D ��ü ����");
			}
			
			int var1;
			
			void method1() {
				System.out.println("���� ���� Ŭ������ method1()");
			}
		}
		
		D d = new D();
		d.var1 = 3;
		d.method1();
	}
}
