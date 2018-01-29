package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BuildingChunkModificationVote implements Serializable {
	
	private BuildingChunkModification buildingChunkModification;
	private User user;
	private LocalDateTime timeCast;
	private boolean value;
	
	public BuildingChunkModificationVote() {
	
	}
	
	public BuildingChunkModificationVote(BuildingChunkModification buildingChunkModification, User user, LocalDateTime timeCast, boolean value) {
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
