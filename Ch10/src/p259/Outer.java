package p259;

public class Outer {
	
	interface InterfaceEx {
		void method();
	}
	
	InterfaceEx ie;
	
	void setInterfaceEx(InterfaceEx ie) {
		this.ie = ie;
	}
	
	void outerMethod() {
		ie.method();
	}

}
