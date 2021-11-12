package interface_declearation;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	///// 자바 8버전부터 추가
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리를 한다");
		}else {
			System.out.println("무음 해제를 한다.");
		}
		
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
