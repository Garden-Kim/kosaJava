package interface_declearation;

public class RemoteControlNoNameExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			int vol;
			@Override
			public void turnOn() {
				System.out.println("cd�� �մϴ�.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("cd�� ���ϴ�.");
				
			}

			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME) {
					this.vol = RemoteControl.MAX_VOLUME;
				}else if(volume < RemoteControl.MIN_VOLUME) {
					this.vol = RemoteControl.MIN_VOLUME;
				}else {
					this.vol = volume;
				}
				System.out.println("���� ������ "+vol+"�Դϴ�.");
				
			}};
			rc.turnOn();
			rc.turnOff();
	}

}
