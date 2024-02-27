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
		idLabel("아이디"),
	    sizeNameText("10"),
	    passwordLabel("비밀번호"),
	    nowpwLabel("현재 비밀번호"),
	    newpwLabel("새로운 비밀번호"),
	    nameLabel("이름"),
	    birthLabel("생년월일"),
	    sizePasswordText("10"),
	    okButtonLabel("확인"),
	    cancelButtonLabel("취소"),
	    exitButtonLabel("닫기"),
	    gaibButtonLabel("회원가입"),
	    findButtonLabel("비밀번호 찾기"),
	    changeButtonLabel("비밀번호 변경"),
	    delLabel("회원탈퇴"),
	    noAccountInfo("회원정보가 존재하지 않습니다."),
	    LoginFailed("아이디나 비밀번호가 다릅니다."),
	    gaibSuccess("회원가입 되었습니다."),
	    gaibFail("회원가입에 실패하였습니다."),
		blankFilled("빈칸을 채워주세요."),
		equalFailed("기존과 동일한 비밀번호로 변경할 수 없습니다."),
		changedLabel("비밀번호가 변경되었습니다."),
		delSuccess("회원탈퇴 성공하였습니다.");
		
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
		NEW("생성"),
		OPEN("열기"),
		SAVE("저장"),
		SAVEAS("다른이름으로"),
		PRINT("프린트"),
		EXIT("닫기");
		
		private String text;

		EFileMenu(String text){
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EEditMenu {
		COPY("복사"),
		CUT("자르기"),
		PASTE("복사"),
		DELETE("삭제");
		
		private String text;

		EEditMenu(String text){
			this.text = text;
		}
		public String getText() {
			return this.text;
		}
	}
	
	public enum EDirectory{
		campus("캠퍼스"),
		college("대학"),
		hakgwa("학과");
		
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
		gangjwaNo("강좌번호"),
		gangjwaName("강좌명"),
		damdangGyosu("담당교수"),
		hakjum("학점"),
		time("시간");

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
		gangjwaNo("강좌번호"),
		gangjwaName("강좌명");

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
