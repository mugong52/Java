package p240;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal eagle = new Eagle();
		
		eagle.sleep();
//		eagle.eat();  // ����
		
		Eagle eagleObj = (Eagle)eagle;  // ���� ����ȯ
		eagleObj.eat();  // Eagle Ŭ������ eat() �޼���
	}
}
