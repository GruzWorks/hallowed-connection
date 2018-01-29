package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BuildingModificationVote implements Serializable {
	
	private BuildingModification buildingModification;
	private User user;
	private LocalDateTime timeCast;
	private boolean value;
	
	public BuildingModificationVote() {
	
	}
	
	public BuildingModificationVote(BuildingModification buildingModification, User user, LocalDateTime timeCast, boolean value) {
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
	
	public LocalDateTime getTimeCast() {
		return timeCast;
	}
	
	public void setTimeCast(LocalDateTime timeCast) {
		this.timeCast = timeCast;
	}
	
	public boolean isValue() {
		return value;
	}
	
	public void setValue(boolean value) {
		this.value = value;
	}
	
}
