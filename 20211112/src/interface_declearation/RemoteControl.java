package interface_declearation;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	///// �ڹ� 8�������� �߰�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���� �Ѵ�");
		}else {
			System.out.println("���� ������ �Ѵ�.");
		}
		
	}
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
