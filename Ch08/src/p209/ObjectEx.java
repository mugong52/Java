package p209;

public class ObjectEx {
	
	public static void main(String[] args) {
		
		allObject(new GraphicCard());
		allObject(new Amd());
		allObject(new Nvidia());
		allObject("안녕");
	}
	
	public static void allObject(Object obj) {
		
		System.out.println(obj.toString());
	}

}
// Object는 모든 클래스의 최상위 클래스. 하위 클래스들을 매개변수로 받을 수 있다.
