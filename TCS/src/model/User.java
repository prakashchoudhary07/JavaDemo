package model;

public class User {
	private int usn;
	private String name;
	
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public User() {
		
	}
	
	public User(int usn, String name) {
		super();
		this.usn = usn;
		this.name = name;
	}
	
}
