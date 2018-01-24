package outfrost.hallowedconnection.server.data;

public enum BuildingChunkFlags {
	
	NONE(0);
	
	private long value;
	
	private BuildingChunkFlags(long value) {
		this.value = value;
	}
	
	public long getValue() {
		return value;
	}
	
}
