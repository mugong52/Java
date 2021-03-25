package p68;

public class OpEx6_1 {
	
	public static void main(String[] args) {
		
		// 비트 쉬프트연산
		// << 연산 : 왼쪽 비트를 오른쪽 수만큼 이동(빈자리는 0으로 채움)
		System.out.println(3 << 2);
		System.out.println("3의 이진수 : "+Integer.toBinaryString(3));
		System.out.println("12의 이진수 : "+Integer.toBinaryString(12));
		
		// >> 연산 : 왼쪽 비트를 오른쪽 수만큼 이동(빈자리는 부호비트로 채움)
		System.out.println(8 >> 2);
		System.out.println("8의 이진수 : "+Integer.toBinaryString(8));
		System.out.println("2의 이진수 : "+Integer.toBinaryString(2));
		
		// >>> 연산 : 왼쪽 비트를 오른쪽 수만큼 이동(빈자리는 0으로 채움)
		System.out.println(-8 >>> 3);
		System.out.println("-8의 이진수 : "+Integer.toBinaryString(-8));
		System.out.println("-8 >>> 3 : "+Integer.toBinaryString(-8 >>> 3));
	}

}
