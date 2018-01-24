package outfrost.hallowedconnection.server.data;

public enum OutletPointType {
	
	NONE(0),
	ELECTRIC_230V50HZ_E(1),
	ELECTRIC_230V50HZ_F(2);
	
	private int value;
	
	private OutletPointType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
