package p130;

public class ReferenceType2 {

	public static void main(String[] args) {
		
		String name1 = new String("ȫ�浿");
		String name2 = new String("ȫ�浿");
		
		System.out.println("name1 == name2 :	"+(name1 == name2));
		// �ּҰ��� �ٸ�
		
		System.out.println("name1.equals(name2) :	"+name1.equals(name2));
		// ���ڿ��� ��ü�� ��
		
	}
}
