// ��ü�� �迭�� ����
package p144;  // p145�� �ִ� ���������� Car Ŭ������ ����ϱ� ���� ���� ��Ű���� ����

public class CarMain2 {

	public static void main(String[] args) {
		
		// Car Ÿ���� �迭��ü ����
		Car[] cars = new Car[3];
		
		// car ��ü ����
		Car tico = new Car();
		tico.color = "ȭ��Ʈ";
		tico.company = "���";
		tico.type = "����";
		
		// ��� �ε����� tico ��ü ����
		for (int i=0; i<cars.length; i++) {
			cars[i] = tico;
		}
		
		System.out.println("2�� �ε��� color : "+cars[2].color);
		
		cars[0].color = "��";  // 0�� �ε��� ��ü�� color �ʵ忡 "��" ����
		System.out.println("2�� �ε��� color : "+cars[2].color);
		// cars[0], cars[1], cars[2] ��� ���� �ּҰ� ����
		// ���� ����� ���� �ϳ��� �� ���� �ٲٸ� �� ���� �����ϰ� �ִ� ��� ������ �ٲ� �� ����
		
		System.out.println();
		
		// Car Ÿ���� �迭��ü ����
		Car[] cars2 = new Car[3];
		
		// ��� �ε����� new �����ڷ� ��ü ���� �� ����
		for (int i=0; i<cars.length; i++) {
			cars2[i] = new Car();
			cars2[i].color = "ȭ��Ʈ";
			cars2[i].company = "���";
			cars2[i].type = "����";
		}
		
		System.out.println("0�� �ε��� color : "+cars2[0].color);
		System.out.println("1�� �ε��� color : "+cars2[1].color);
		System.out.println("2�� �ε��� color : "+cars2[2].color);
		
		cars2[0].color = "��";  // 0�� �ε��� ��ü�� color �ʵ忡 "��" ����
		System.out.println("0�� �ε��� color : "+cars2[0].color);
		System.out.println("1�� �ε��� color : "+cars2[1].color);
		System.out.println("2�� �ε��� color : "+cars2[2].color);
	}
}
/* Ŭ������ ����� ���� �ڷ���, ����� ���� �ڷ����� ���� �ڷ���.
 * ���� �ڷ����� ���� ���� �����ϴ°� �ƴ϶�, ����� ��ġ�� �ּҰ��� �����ϱ� ������
 * ������ ������ ��ü�� �����Ϸ��� new �����ڸ� ���� �ٸ� ��ü�� �����ؾ� �Ѵ�.
 * ...���ظ��� 
 */