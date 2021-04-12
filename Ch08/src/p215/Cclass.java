package p215;

import p214.Aclass;

public class Cclass extends Aclass{

	Cclass() {
		this.varA = "varA";  // 사용가능
//		this.varA2 = "varA2";  // 사용불가
		this.methodA();  // 사용가능
//		this.methodA2();  // 사용불가
	}
}
// protected 접근제한자 : 같은 패키지에서만 사용 가능하지만, 
// 상속관계에 있으면 다른 패키지여도 생성자에서 this 참조변수를 사용해서 사용 가능 