package p214;

public class AclassMain {

	public static void main(String[] args) {
		
		Aclass ac = new Aclass();
		ac.varA = "varA";
		ac.varA2 = "varA2";
		ac.methodA();
		ac.methodA2();
		
	}
}
// Aclass와 AclassMain 클래스는 같은 패키지에 존재하므로 
// protected, default 접근제한자가 있는 변수 메서드 모두 사용 가능