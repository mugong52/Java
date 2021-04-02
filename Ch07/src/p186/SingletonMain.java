package p186;

public class SingletonMain {

	public static void main(String[] args) {
		
//		Singleton s = new Singleton();  // 에러 발생
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		// 변수명은 다르지만 모두 같은 객체(참조 자료형)
		
	}
}