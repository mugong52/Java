package p232;

public class ComplexerMain3 {

	public static void main(String[] args) {
		
		ComplexcerInterface ci = new ComplexcerInterface() {
			
			@Override
			public void send(String tel) {
				System.out.println("����� �͸� ���� ��ü�� send()");
			}
			
			@Override
			public void receive(String tel) {
				System.out.println("����� �͸� ���� ��ü�� receive()");
			}
			
			@Override
			public void print() {
				System.out.println("����� �͸� ���� ��ü�� print()");
			}
			
			@Override
			public void scan() {
				System.out.println("����� �͸� ���� ��ü�� scan()");
			}
			
		};
		
		ci.send("1234");
		ci.receive("5678");
		ci.print();
		ci.scan();
	}
}
