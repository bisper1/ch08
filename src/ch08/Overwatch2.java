package ch08;

public class Overwatch2 {

	public static void main(String[] args) {
		Zarya z = new Zarya();
		Winston w = new Winston();
		Dva d = new Dva();
		
		z.forward();
		z.attack();
		z.skill();
		z.specialSkill();
		
		w.left();
		w.right();
		w.skill();
		w.attack();
		
		d.backward();
		d.skill();
		d.attack();
		d.specialSkill();
		
		System.out.println("\n----- 추상 클래스로 구현 -----\n");
		
		DvaClass dc = new DvaClass();
		dc.attack();
		dc.skill();
		
		
		System.out.println("\n----- 인터페이스의 다중 상속 시 다형성 -----\n");
		Movement vm = null;
		Attack va = null;
		
//		부모 인터페이스 타입의 변수에 구현 클래스 타입의 객체를 대입 하였기 때문에 부모 인터페이스의 멤버만 사용이 가능
		vm = z;
		vm.left();
		vm.right();
		vm.forward();
		vm.backward();
		// 오류, attack(), skill() 은 Attack 인터페이스의 멤버이므로 오류가 발생
//		vm.attack(); 
//		vm.skill(); // 오류
		va = z;
		va.attack();
		va.skill();
		va.specialSkill();
		
		Character2 ch2 = null;
		ch2 = new Sombra();
		ch2.attack();
		ch2.left();
		ch2.right();
		ch2.specialSkill();
		
	}

}
