package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.sql.Timestamp;

public class BuildingModificationVote implements Serializable {
	
	private BuildingModification buildingModification;
	private User user;
	private Timestamp timeCast;
	private boolean value;
	
	public BuildingModificationVote() {
	
	}
	
	public BuildingModificationVote(BuildingModification buildingModification, User user, Timestamp timeCast, boolean value) {
		this.buildingModification = buildingModification;
		this.user = user;
		this.timeCast = timeCast;
		this.value = value;
	}
	
	public BuildingModification getBuildingModification() {
		return buildingModification;
	}
	
	public void setBuildingModification(BuildingModification buildingModification) {
		this.buildingModification = buildingModification;
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
