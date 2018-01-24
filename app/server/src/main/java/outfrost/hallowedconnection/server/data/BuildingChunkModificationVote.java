package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.sql.Timestamp;

public class BuildingChunkModificationVote implements Serializable {
	
	private BuildingChunkModification buildingChunkModification;
	private User user;
	private Timestamp timeCast;
	private boolean value;
	
	public BuildingChunkModificationVote() {
	
	}
	
	public BuildingChunkModificationVote(BuildingChunkModification buildingChunkModification, User user, Timestamp timeCast, boolean value) {
		this.buildingChunkModification = buildingChunkModification;
		this.user = user;
		this.timeCast = timeCast;
		this.value = value;
	}
	
	public BuildingChunkModification getBuildingChunkModification() {
		return buildingChunkModification;
	}
	
	public void setBuildingChunkModification(BuildingChunkModification buildingChunkModification) {
		this.buildingChunkModification = buildingChunkModification;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Timestamp getTimeCast() {
		return timeCast;
	}
	
	public void setTimeCast(Timestamp timeCast) {
		this.timeCast = timeCast;
	}
	
	public boolean isValue() {
		return value;
	}
	
	public void setValue(boolean value) {
		this.value = value;
	}
	
}
