package p209;

public class Computer2 {

	public static void main(String[] args) {
		
		Game g = new Game();
		
		GraphicCard gc = new GraphicCard();
		g.display(gc);
		
		Amd gc2 = new Amd();
		g.display(gc2);
		
		Nvidia gc3 = new Nvidia();
		g.display(gc3);
	}
}
// Game Ŭ�������� GraphciCard �ڷ������� �����س��� ������, 
// �� �޼��带 ȣ���� �� �Ű������� GraphicCard Ŭ������ ���� Ŭ�������� �ڵ�����ȯ
// GraphicCard gc = new Amd();
// BraphicCard gc = new Nvidia();
// ���� ��� Ŭ������ �Ű������� �ް� ������, �޼��带 ������ �� �Ű����� �ڷ����� Object�� ����