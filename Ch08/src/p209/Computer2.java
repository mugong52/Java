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
// Game 클래스에서 GraphciCard 자료형으로 정의해놨기 때문에, 
// 이 메서드를 호출할 때 매개변수는 GraphicCard 클래스의 하위 클래스들이 자동형변환
// GraphicCard gc = new Amd();
// BraphicCard gc = new Nvidia();
// 만약 모든 클래스를 매개변수로 받고 싶으면, 메서드를 정의할 때 매개변수 자료형을 Object로 선언