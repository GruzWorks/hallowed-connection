package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.sql.Timestamp;

public class Building implements Serializable {
	
	private double lat;
	private double lon;
	private String name;
	private String description;
	private User submittedBy;
	private Timestamp timeSubmitted;
	private BuildingFlags flags;
	private int outletCount;
	
	public Building() {
	
	}
	
	public Building(double lat, double lon, String name, String description, User submittedBy, Timestamp timeSubmitted, BuildingFlags flags, int outletCount) {
		this.lat = lat;
		this.lon = lon;
		this.name = name;
		this.description = description;
		this.submittedBy = submittedBy;
		this.timeSubmitted = timeSubmitted;
		this.flags = flags;
		this.outletCount = outletCount;
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
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public User getSubmittedBy() {
		return submittedBy;
	}
	
	public void setSubmittedBy(User submittedBy) {
		this.submittedBy = submittedBy;
	}
	
	public Timestamp getTimeSubmitted() {
		return timeSubmitted;
	}
	
	public void setTimeSubmitted(Timestamp timeSubmitted) {
		this.timeSubmitted = timeSubmitted;
	}
	
	public BuildingFlags getFlags() {
		return flags;
	}
	
	public void setFlags(BuildingFlags flags) {
		this.flags = flags;
	}
	
	public int getOutletCount() {
		return outletCount;
	}
	
	public void setOutletCount(int outletCount) {
		this.outletCount = outletCount;
	}
}
