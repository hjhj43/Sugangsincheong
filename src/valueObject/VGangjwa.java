package valueObject;

public class VGangjwa {
	private String id;
	private String name;
	private String lecture;
	private String credit;
	private String time;

	public VGangjwa(String id, String name,String lecture,String credit,String time) {
		this.id = id;
		this.name = name;
		this.lecture = lecture;
		this.credit = credit;
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLecture() {
		return lecture;
	}

	public String getCredit() {
		return credit;
	}

	public String getTime() {
		return time;
	}

}
