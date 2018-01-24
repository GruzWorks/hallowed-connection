package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.sql.Timestamp;

public class Rating implements Serializable {

	private User user;
	private Timestamp timeCreated;
	private Timestamp timeModified;
	private RatingValue value;
	private String comment;
	private Building building;
	
	public Rating() {
	
	}
	
	public Rating(User user, Timestamp timeCreated, Timestamp timeModified, RatingValue value, String comment, Building building) {
		this.user = user;
		this.timeCreated = timeCreated;
		this.timeModified = timeModified;
		this.value = value;
		this.comment = comment;
		this.building = building;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Timestamp getTimeCreated() {
		return timeCreated;
	}
	
	public void setTimeCreated(Timestamp timeCreated) {
		this.timeCreated = timeCreated;
	}
	
	public Timestamp getTimeModified() {
		return timeModified;
	}
	
	public void setTimeModified(Timestamp timeModified) {
		this.timeModified = timeModified;
	}
	
	public RatingValue getValue() {
		return value;
	}
	
	public void setValue(RatingValue value) {
		this.value = value;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Building getBuilding() {
		return building;
	}
	
	public void setBuilding(Building building) {
		this.building = building;
	}
	
}
