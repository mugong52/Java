package p179;

import p179.test.TestPackage;
// import p179.test.TestPackage2;
// import p179.test.*;  // TestPackage, TestPackage2 클래스 모두 사용 but 하위 패키지 포함 X

public class PackageEx2 {

	public static void main(String[] args) {
		
		TestPackage test = new TestPackage();
		test.method();
		
	}
	
}
/* 
프로그램 작성 시 패키지명 생략 가능한 경우 세가지
1. 작성 중인 클래스와 사용하고자 하는 클래스가 같은 패키지에 존재하는 경우
2. import
3. java.lang 패키지에 있는 클래스를 사용하는 경우

import 단축키 : ctrl + shift + o
*/