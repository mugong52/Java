// 메서드 : 접근제한자 리턴타입(리턴값 없으면 void) 메서드명(매개변수...) {실행문 / return 값;}
package p153;

public class ParamEx {

	public static void main(String[] args) {
		
		Param p = new Param();
		p.add(10, 5);
		p.add2(10, 5);

	}

}

class Param {
	
	void add(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}
	
	void add2(double x, double y) {
		double z = x + y;
		System.out.println(z);
	}
}
