package ch08;

public class InterDefaultImpl implements InterDefault {

	@Override
	public void method1() {
		System.out.println("오버라이딩된 method1");
	}

	@Override
	public void method2() {
		System.out.println("오버라이딩된 method2");
	}
	
//	인터페이스의 디폴트 메서드는 일반적인 메서드이기 때문에 인터페이스를 상속받았을 경우 디폴트 메서드를 오버라이딩할 필요가 없음
//	부모의 메서드이기 때문에 오버라이딩해서 사용할 수 있음
//
	@Override
	public void defaultMethod() {
		System.out.println("InterDefaultImpl 클래스에서 오버라이딩한 defaultMethod");
	}
	
//	오버라이딩하여 추상 메서드로 변경할 수 있음
//	@Override
//	public abstract void defaultMethod();
}







