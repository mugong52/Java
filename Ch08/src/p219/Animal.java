package p219;

public class Animal {

	String type;
	String name;
	
	Animal(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	void sleep() {
		System.out.println(this.name +"��(��) ���� �ܴ�.");
	}
}