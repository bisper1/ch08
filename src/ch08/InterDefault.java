package ch08;

public interface InterDefault {
//	추상 메서드
	public void method1();
	public void method2();
	
	public default void defaultMethod() {
		System.out.println("InterDefault 인터페이스의 디폴트 메서드");
	}
}
