package p130;

public class ReferenceType2 {

	public static void main(String[] args) {
		
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		
		System.out.println("name1 == name2 :	"+(name1 == name2));
		// 주소값이 다름
		
		System.out.println("name1.equals(name2) :	"+name1.equals(name2));
		// 문자열값 자체만 비교
		
	}
}
