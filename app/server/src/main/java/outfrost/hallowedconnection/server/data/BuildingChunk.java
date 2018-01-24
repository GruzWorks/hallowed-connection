package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.util.UUID;

public class BuildingChunk implements Serializable {

	private Building building;
	private double lat;
	private double lon;
	private String name;
	private BuildingChunkFlags flags;
	private UUID schematicId;
	private int outletCount;
	
	public BuildingChunk() {
	
	}
	
	public BuildingChunk(Building building, double lat, double lon, String name, BuildingChunkFlags flags, UUID schematicId, int outletCount) {
		this.building = building;
		this.lat = lat;
		this.lon = lon;
		this.name = name;
		this.flags = flags;
		this.schematicId = schematicId;
		this.outletCount = outletCount;
	}
	
	public Building getBuilding() {
		return building;
	}
	
	public void setBuilding(Building building) {
		this.building = building;
	}
	
	public double getLat() {
		return lat;
	}
	
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	public double getLon() {
		return lon;
	}
	
	public void setLon(double lon) {
		this.lon = lon;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BuildingChunkFlags getFlags() {
		return flags;
	}
	
	public void setFlags(BuildingChunkFlags flags) {
		this.flags = flags;
	}
	
	public UUID getSchematicId() {
		return schematicId;
	}
	
	public void setSchematicId(UUID schematicId) {
		this.schematicId = schematicId;
	}
	
	public int getOutletCount() {
		return outletCount;
	}
	
	public void setOutletCount(int outletCount) {
		this.outletCount = outletCount;
	}
	
}
