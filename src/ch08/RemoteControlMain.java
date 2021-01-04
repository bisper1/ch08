package ch08;

public class RemoteControlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		Audio audio = new Audio();
		
		tv.turnOn();
		tv.setVolume(15);
		tv.setMute(true);
		tv.turnOff();
		
		audio.turnOn();
		audio.setMute(false);
		audio.setVolume(-10);
		audio.turnOff();
		
		
		System.out.println("----- interface의 다형성 -----");
//		인터페이스도 다형성 구현이 가능함
//		인터페이스 타입의 변수는 생성이 가능함(객체화는 불가)
//		인터페이스 타입의 변수에 구현 클래스 타입의 객체를 대입할 수 있음
		RemoteControl rc;
		rc = tv;
		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(5);
		rc.turnOff();
		
		rc = audio;
		rc.turnOn();
		rc.setMute(false);
		rc.setVolume(8);
		rc.turnOff();
		
		
		System.out.println("----- 추상 클래스로 구현한 RemoteControl -----");
		Television2 tv2 = new Television2();
		Audio2 audio2 = new Audio2();
		
		tv2.turnOn();
		tv2.setVolume(15);
		tv2.setMute(true);
		tv2.turnOff();
		
		audio2.turnOn();
		audio2.setMute(false);
		audio2.setVolume(-10);
		audio2.turnOff();
		
		System.out.println("----- 추상 클래스로 구현한 다형성 -----");
		RemoteControlClass rcc;
		
		rcc = tv2;
		rcc.turnOn();
		rcc.setMute(true);
		rcc.setVolume(5);
		rcc.turnOff();
		
		rcc = audio2;
		rcc.turnOn();
		rcc.setMute(false);
		rcc.setVolume(8);
		rcc.turnOff();
	}

}













