package p179;

import p179.test.TestPackage;
// import p179.test.TestPackage2;
// import p179.test.*;  // TestPackage, TestPackage2 Ŭ���� ��� ��� but ���� ��Ű�� ���� X

public class PackageEx2 {

	public static void main(String[] args) {
		
		TestPackage test = new TestPackage();
		test.method();
		
	}
	
}
/* 
���α׷� �ۼ� �� ��Ű���� ���� ������ ��� ������
1. �ۼ� ���� Ŭ������ ����ϰ��� �ϴ� Ŭ������ ���� ��Ű���� �����ϴ� ���
2. import
3. java.lang ��Ű���� �ִ� Ŭ������ ����ϴ� ���

import ����Ű : ctrl + shift + o
*/