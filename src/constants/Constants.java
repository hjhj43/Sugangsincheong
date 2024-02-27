package constants;

public class Constants {
	
	public enum EConfiguration{
		rootFileNmae("root"),
		miridamgiFilePostfix("M"),
		sincheongFilePostfix("S");
		
		private String text;
		private EConfiguration(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}
	
	public enum ELoginDialog{
		width("300"),
		height("250"),
		idLabel("���̵�"),
	    sizeNameText("10"),
	    passwordLabel("��й�ȣ"),
	    nowpwLabel("���� ��й�ȣ"),
	    newpwLabel("���ο� ��й�ȣ"),
	    nameLabel("�̸�"),
	    birthLabel("�������"),
	    sizePasswordText("10"),
	    okButtonLabel("Ȯ��"),
	    cancelButtonLabel("���"),
	    exitButtonLabel("�ݱ�"),
	    gaibButtonLabel("ȸ������"),
	    findButtonLabel("��й�ȣ ã��"),
	    changeButtonLabel("��й�ȣ ����"),
	    delLabel("ȸ��Ż��"),
	    noAccountInfo("ȸ�������� �������� �ʽ��ϴ�."),
	    LoginFailed("���̵� ��й�ȣ�� �ٸ��ϴ�."),
	    gaibSuccess("ȸ������ �Ǿ����ϴ�."),
	    gaibFail("ȸ�����Կ� �����Ͽ����ϴ�."),
		blankFilled("��ĭ�� ä���ּ���."),
		equalFailed("������ ������ ��й�ȣ�� ������ �� �����ϴ�."),
		changedLabel("��й�ȣ�� ����Ǿ����ϴ�."),
		delSuccess("ȸ��Ż�� �����Ͽ����ϴ�.");
		
		private String text;
		private ELoginDialog(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}
	
	public enum EMainFrame{
		width("1000"),
		height("600");

		private String text;
		private EMainFrame(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}

	public enum EMenuBar {
		FILE("File"),
		EDIT("Edit");
		
		private String text;

		EMenuBar(String text){
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EFileMenu {
		NEW("����"),
		OPEN("����"),
		SAVE("����"),
		SAVEAS("�ٸ��̸�����"),
		PRINT("����Ʈ"),
		EXIT("�ݱ�");
		
		private String text;

		EFileMenu(String text){
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EEditMenu {
		COPY("����"),
		CUT("�ڸ���"),
		PASTE("����"),
		DELETE("����");
		
		private String text;

		EEditMenu(String text){
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EDirectory{
		campus("ķ�۽�"),
		college("����"),
		hakgwa("�а�");
		
		private String text;
		private EDirectory(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}

	public enum EPGangjwaSelection{
		gangjwaNo("���¹�ȣ"),
		gangjwaName("���¸�"),
		damdangGyosu("��米��"),
		hakjum("����"),
		time("�ð�");

		private String text;
		private EPGangjwaSelection(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}
	
	public enum EPResult{
		gangjwaNo("���¹�ȣ"),
		gangjwaName("���¸�");

		private String text;
		private EPResult(String text) {
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
		public int getInt() {
			return Integer.parseInt(text);
		}
	}
}
