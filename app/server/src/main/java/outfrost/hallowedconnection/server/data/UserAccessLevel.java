package outfrost.hallowedconnection.server.data;

public enum UserAccessLevel {
	
	ANONYMOUS(0),
	REGISTERED(1<<0),
	MODERATOR(1<<6),
	ADMINISTRATOR(1<<7);
	
	private int value;
	
	private UserAccessLevel(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
