package ch08;

// 추상 클래스로 선언한 RemoteControl
public abstract class RemoteControlClass {
	public final static int MAX_VOLUME = 10;
	public final static int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
