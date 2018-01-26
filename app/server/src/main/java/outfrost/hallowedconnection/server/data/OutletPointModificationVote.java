package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OutletPointModificationVote implements Serializable {
	
	private OutletPointModification outletPointModification;
	private User user;
	private LocalDateTime timeCast;
	private boolean value;
	
	public OutletPointModificationVote() {
	
	}
	
	public OutletPointModificationVote(OutletPointModification outletPointModification, User user, LocalDateTime timeCast, boolean value) {
		this.outletPointModification = outletPointModification;
		this.user = user;
		this.timeCast = timeCast;
		this.value = value;
	}
	
	public OutletPointModification getOutletPointModification() {
		return outletPointModification;
	}
	
	public void setOutletPointModification(OutletPointModification outletPointModification) {
		this.outletPointModification = outletPointModification;
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
