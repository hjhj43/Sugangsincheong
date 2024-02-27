package model;

public class MUser extends MModel{
	
	private String userId;
	private String name;
	private String userpw;
	private String birth;

	public MUser() {
	}

	public String getUserId() {
		return userId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUserpw() {
		return userpw;
	}
	
	public String getBirth() {
		return birth;
	}
}
