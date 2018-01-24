package outfrost.hallowedconnection.server.data;

import java.io.Serializable;

public class OutletPoint implements Serializable {

	private BuildingChunk buildingChunk;
	private int x;
	private int y;
	private OutletPointType type;
	private OutletPointFlags flags;
	private int outletCount;
	
	public OutletPoint() {
	
	}
	
	public OutletPoint(BuildingChunk chunk, int x, int y, OutletPointType type, OutletPointFlags flags, int outletCount) {
		buildingChunk = chunk;
		this.x = x;
		this.y = y;
		this.type = type;
		this.flags = flags;
		this.outletCount = outletCount;
	}
	
	public BuildingChunk getBuildingChunk() {
		return buildingChunk;
	}
	
	public void setBuildingChunk(BuildingChunk buildingChunk) {
		this.buildingChunk = buildingChunk;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public OutletPointType getType() {
		return type;
	}
	
	public void setType(OutletPointType type) {
		this.type = type;
	}
	
	public OutletPointFlags getFlags() {
		return flags;
	}
	
	public void setFlags(OutletPointFlags flags) {
		this.flags = flags;
	}
	
	public int getOutletCount() {
		return outletCount;
	}
	
	public void setOutletCount(int outletCount) {
		this.outletCount = outletCount;
	}
	
}
