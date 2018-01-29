package outfrost.hallowedconnection.server.data;

public enum RatingValue {
	
	STARS_00(0),
	STARS_05(1),
	STARS_10(2),
	STARS_15(3),
	STARS_20(4),
	STARS_25(5),
	STARS_30(6),
	STARS_35(7),
	STARS_40(8),
	STARS_45(9),
	STARS_50(10);
	
	private int value;
	
	private RatingValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
