package p209;

public class Computer {

	public static void main(String[] args) {
		
		GraphicCard gc = new GraphicCard();
		gc.process();  // ���� �׷���ī�� process
		
		gc = new Amd();
		gc.process();
		
		gc = new Nvidia();
		gc.process();
	}
}
