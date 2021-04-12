package p219;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal[] ani = new Animal[4];
		
		Animal eagle = new Eagle("����", "������");
		Animal tiger = new Tiger("������", "ȣ����");
		Animal lion = new Lion("������", "����");
		Animal shark = new Shark("���", "���");
		
		ani[0] = eagle;
		ani[1] = tiger;
		ani[2] = lion;
		ani[3] = shark;
		
		for (int i=0; i<ani.length; i++) {
			ani[i].sleep();
		}
	}
}
