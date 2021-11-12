
public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone ex = new DmbCellPhone("자기폰","검정" , 5);
		
		ex.powerOn();
		ex.powerOff();
		ex.sendVoice("여보세요");
		ex.receiveVoice("이숭무 폰 맞나여");
		ex.sendVoice("안녕하세요");
		ex.hangUp();
		
		//
		
		ex.turnOnDmb();
		ex.changeChannelDmb(12);
		ex.turnOffDmb();
		

	}

}
