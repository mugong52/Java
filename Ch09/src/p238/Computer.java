package p238;

public class Computer {

	public static void main(String[] args) {
		
		GraphicCard gc = new Amd();
		
		System.out.println("�޸� : "+gc.MEMORY);
		
		// Amd�� ����
		gc = new Amd();  // �ڵ� ����ȯ
		gc.process();
		
		// Nvidia�� ��ü
		gc = new Nvidia();  // �ڵ� ����ȯ
		gc.process();
	}
}
