package valueObject;

public class VUser {
	
	private String userId;
	private String name;
	private String userpw;
	private String birth;

	public VUser(String userId, String name, String birth, String userpw) {
		this.userId = userId;
		this.name = name;
		this.userpw = userpw;
		this.birth = birth;
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
