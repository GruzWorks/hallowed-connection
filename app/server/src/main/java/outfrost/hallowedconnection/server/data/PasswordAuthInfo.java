package outfrost.hallowedconnection.server.data;

import java.io.Serializable;

public class PasswordAuthInfo implements Serializable {

	private User user;
	private String login;
	private String salt;
	private String passwordHash;
	
	public PasswordAuthInfo() {
	
	}
	
	public PasswordAuthInfo(User user, String login, String salt, String passwordHash) {
		this.user = user;
		this.login = login;
		this.salt = salt;
		this.passwordHash = passwordHash;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSalt() {
		return salt;
	}
	
	public void setSalt(String salt) {
		this.salt = salt;
	}
	
	public String getPasswordHash() {
		return passwordHash;
	}
	
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	
}
