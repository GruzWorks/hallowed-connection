package outfrost.hallowedconnection.server.data;

public enum BuildingFlags {
	
	NONE(0);
	
	private long value;
	
	private BuildingFlags(long value) {
		this.value = value;
	}
	
	public long getValue() {
		return value;
	}
	
}
