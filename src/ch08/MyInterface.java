package ch08;

public interface MyInterface {
//	기존 인터페이스의 기능
	public void method1();
	
//	기존의 인터페이스에 기능이 추가로 필요함
//	1. 기존 인터페이스에 추상 메서드를 추가
//	문제 : 기존 인터페이스를 상속받은 모든 클래스에서 오류가 발생, 새로 추가된 추상 메서드를 추가로 구현해야하기 때문
//	public void method2();
//	2. 새로운 인터페이스 파일을 생성하여 다중 상속받음
//	문제 : 인터페이스를 사용한 다형성 부분에서 오류가 발생할 가능성이 존재, 여러개의 인터페이스를 생성해야하는 경우가 발생
//	3. 기존 인터페이스 파일에 디폴트 메서드를 추가하여 사용
	public default void method2() {
		System.out.println("MyInterface의 method2 실행");
	}
}
