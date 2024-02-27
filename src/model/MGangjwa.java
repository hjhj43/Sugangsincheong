package model;

public class MGangjwa extends MModel{
	
	private String id;
	private String name;
	private String lecture;
	private String credit;
	private String time;
	
	public MGangjwa() {
	}

	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getLecture() {return lecture;}
	public void setLecture(String lecture) {this.lecture = lecture;}
	public String getCredit() {return credit;}
	public void setCredit(String credit) {this.credit = credit;}
	public String getTime() {return time;}
	public void setTime(String time) {this.time = time;}
}
