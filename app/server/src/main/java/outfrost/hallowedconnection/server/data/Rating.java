package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Rating implements Serializable {
	
	private long id;
	private User user;
	private LocalDateTime timeCreated;
	private LocalDateTime timeModified;
	private RatingValue value;
	private String comment;
	private Building building;
	
	public Rating() {
	
	}
	
	public Rating(long id, User user, LocalDateTime timeCreated, LocalDateTime timeModified, RatingValue value, String comment, Building building) {
		this.id = id;
		this.user = user;
		this.timeCreated = timeCreated;
		this.timeModified = timeModified;
		this.value = value;
		this.comment = comment;
		this.building = building;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public LocalDateTime getTimeCreated() {
		return timeCreated;
	}
	
	public void setTimeCreated(LocalDateTime timeCreated) {
		this.timeCreated = timeCreated;
	}
	
	public LocalDateTime getTimeModified() {
		return timeModified;
	}
	
	public void setTimeModified(LocalDateTime timeModified) {
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
