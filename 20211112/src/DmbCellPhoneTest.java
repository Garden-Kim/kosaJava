
public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone ex = new DmbCellPhone("�ڱ���","����" , 5);
		
		ex.powerOn();
		ex.powerOff();
		ex.sendVoice("��������");
		ex.receiveVoice("�̼��� �� �³���");
		ex.sendVoice("�ȳ��ϼ���");
		ex.hangUp();
		
		//
		
		ex.turnOnDmb();
		ex.changeChannelDmb(12);
		ex.turnOffDmb();
		

	}

}
