package p57;

public class OpEx3 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		++a;  // ��������
		b++;  // ��������
		
		System.out.println(a);
		System.out.println(b);
		
		int c = 10;
		int d = ++c;
		
		System.out.println("�������� ��� : "+d);
		
		int x = 10;
		int y = x++;
		System.out.println("�������� ��� : "+y);
		System.out.println("x : "+x);
	}
}
