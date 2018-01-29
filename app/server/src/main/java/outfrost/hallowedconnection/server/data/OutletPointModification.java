package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OutletPointModification implements Serializable {
	
	private long id;
	private OutletPoint outletPoint;
	private User submittedBy;
	private LocalDateTime timeSubmitted;
	private boolean approved;
	private int xBefore;
	private int xAfter;
	private int yBefore;
	private int yAfter;
	private OutletPointType typeBefore;
	private OutletPointType typeAfter;
	private OutletPointFlags flagsBefore;
	private OutletPointFlags flagsAfter;
	private int outletCountBefore;
	private int outletCountAfter;
	private BuildingChunk buildingChunk;
	
	public OutletPointModification() {
	
	}
	
	public OutletPointModification(long id, OutletPoint outletPoint, User submittedBy, LocalDateTime timeSubmitted, boolean approved, int xBefore, int xAfter, int yBefore, int yAfter, OutletPointType typeBefore, OutletPointType typeAfter, OutletPointFlags flagsBefore, OutletPointFlags flagsAfter, int outletCountBefore, int outletCountAfter, BuildingChunk buildingChunk) {
		this.id = id;
		this.outletPoint = outletPoint;
		this.submittedBy = submittedBy;
		this.timeSubmitted = timeSubmitted;
		this.approved = approved;
		this.xBefore = xBefore;
		this.xAfter = xAfter;
		this.yBefore = yBefore;
		this.yAfter = yAfter;
		this.typeBefore = typeBefore;
		this.typeAfter = typeAfter;
		this.flagsBefore = flagsBefore;
		this.flagsAfter = flagsAfter;
		this.outletCountBefore = outletCountBefore;
		this.outletCountAfter = outletCountAfter;
		this.buildingChunk = buildingChunk;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public OutletPoint getOutletPoint() {
		return outletPoint;
	}
	
	public void setOutletPoint(OutletPoint outletPoint) {
		this.outletPoint = outletPoint;
	}
	
	public User getSubmittedBy() {
		return submittedBy;
	}
	
	public void setSubmittedBy(User submittedBy) {
		this.submittedBy = submittedBy;
	}
	
	public LocalDateTime getTimeSubmitted() {
		return timeSubmitted;
	}
	
	public void setTimeSubmitted(LocalDateTime timeSubmitted) {
		this.timeSubmitted = timeSubmitted;
	}
	
	public boolean isApproved() {
		return approved;
	}
	
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	public int getxBefore() {
		return xBefore;
	}
	
	public void setxBefore(int xBefore) {
		this.xBefore = xBefore;
	}
	
	public int getxAfter() {
		return xAfter;
	}
	
	public void setxAfter(int xAfter) {
		this.xAfter = xAfter;
	}
	
	public int getyBefore() {
		return yBefore;
	}
	
	public void setyBefore(int yBefore) {
		this.yBefore = yBefore;
	}
	
	public int getyAfter() {
		return yAfter;
	}
	
	public void setyAfter(int yAfter) {
		this.yAfter = yAfter;
	}
	
	public OutletPointType getTypeBefore() {
		return typeBefore;
	}
	
	public void setTypeBefore(OutletPointType typeBefore) {
		this.typeBefore = typeBefore;
	}
	
	public OutletPointType getTypeAfter() {
		return typeAfter;
	}
	
	public void setTypeAfter(OutletPointType typeAfter) {
		this.typeAfter = typeAfter;
	}
	
	public OutletPointFlags getFlagsBefore() {
		return flagsBefore;
	}
	
	public void setFlagsBefore(OutletPointFlags flagsBefore) {
		this.flagsBefore = flagsBefore;
	}
	
	public OutletPointFlags getFlagsAfter() {
		return flagsAfter;
	}
	
	public void setFlagsAfter(OutletPointFlags flagsAfter) {
		this.flagsAfter = flagsAfter;
	}
	
	public int getOutletCountBefore() {
		return outletCountBefore;
	}
	
	public void setOutletCountBefore(int outletCountBefore) {
		this.outletCountBefore = outletCountBefore;
	}
	
	public int getOutletCountAfter() {
		return outletCountAfter;
	}
	
	public void setOutletCountAfter(int outletCountAfter) {
		this.outletCountAfter = outletCountAfter;
	}
	
	public BuildingChunk getBuildingChunk() {
		return buildingChunk;
	}
	
	public void setBuildingChunk(BuildingChunk buildingChunk) {
		this.buildingChunk = buildingChunk;
	}
	
}
