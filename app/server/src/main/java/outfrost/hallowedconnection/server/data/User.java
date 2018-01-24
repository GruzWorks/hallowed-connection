package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {

	private String displayName;
	private UserAccessLevel accessLevel;
	private Timestamp memberSince;
	private String email;
	
	public User() {
	
	}
	
	public User(String displayName, UserAccessLevel accessLevel, Timestamp memberSince, String email) {
		this.displayName = displayName;
		this.accessLevel = accessLevel;
		this.memberSince = memberSince;
		this.email = email;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public UserAccessLevel getAccessLevel() {
		return accessLevel;
	}
	
	public void setAccessLevel(UserAccessLevel accessLevel) {
		this.accessLevel = accessLevel;
	}
	
	public Timestamp getMemberSince() {
		return memberSince;
	}
	
	public void setMemberSince(Timestamp memberSince) {
		this.memberSince = memberSince;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
