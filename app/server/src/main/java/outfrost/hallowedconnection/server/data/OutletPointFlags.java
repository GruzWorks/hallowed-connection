package outfrost.hallowedconnection.server.data;

public enum OutletPointFlags {
	
	NONE(0);
	
	private long value;
	
	private OutletPointFlags(long value) {
		this.value = value;
	}
	
	public long getValue() {
		return value;
	}
	
}
