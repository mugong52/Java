package p167;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu = new Student("홍길동", 4, "소프트웨어공학");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
		
		Student stu2 = new Student("이순신", 3, "디자인");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		// 기본 생성자로 객체 생성
		// Student stu0 = new Student();  // 에러 발생
		// 매개변수가 있는 생성자를 정의한 경우 기본 생성자가 자동으로 추가되지 않기 때문에
		// 직접 정의해야 한다.
		
		// 오버로딩한 생성자로 객체 생성
		Student stuA = new Student("홍길동");  // a번 생성자
		Student stuB = new Student("홍길동", 4);  // b번 생성자
	}
}
