package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.sql.Timestamp;

public class BuildingModification implements Serializable {
	
	private Building building;
	private User submittedBy;
	private Timestamp timeSubmitted;
	private boolean approved;
	private double latBefore;
	private double latAfter;
	private double lonBefore;
	private double lonAfter;
	private String nameBefore;
	private String nameAfter;
	private String descriptionBefore;
	private String descriptionAfter;
	private BuildingFlags flagsBefore;
	private BuildingFlags flagsAfter;
	
	public BuildingModification() {
	
	}
	
	public BuildingModification(Building building, User submittedBy, Timestamp timeSubmitted, boolean approved, double latBefore, double latAfter, double lonBefore, double lonAfter, String nameBefore, String nameAfter, String descriptionBefore, String descriptionAfter, BuildingFlags flagsBefore, BuildingFlags flagsAfter) {
		this.building = building;
		this.submittedBy = submittedBy;
		this.timeSubmitted = timeSubmitted;
		this.approved = approved;
		this.latBefore = latBefore;
		this.latAfter = latAfter;
		this.lonBefore = lonBefore;
		this.lonAfter = lonAfter;
		this.nameBefore = nameBefore;
		this.nameAfter = nameAfter;
		this.descriptionBefore = descriptionBefore;
		this.descriptionAfter = descriptionAfter;
		this.flagsBefore = flagsBefore;
		this.flagsAfter = flagsAfter;
	}
	
	public Building getBuilding() {
		return building;
	}
	
	public void setBuilding(Building building) {
		this.building = building;
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
	
	public boolean isApproved() {
		return approved;
	}
	
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	public double getLatBefore() {
		return latBefore;
	}
	
	public void setLatBefore(double latBefore) {
		this.latBefore = latBefore;
	}
	
	public double getLatAfter() {
		return latAfter;
	}
	
	public void setLatAfter(double latAfter) {
		this.latAfter = latAfter;
	}
	
	public double getLonBefore() {
		return lonBefore;
	}
	
	public void setLonBefore(double lonBefore) {
		this.lonBefore = lonBefore;
	}
	
	public double getLonAfter() {
		return lonAfter;
	}
	
	public void setLonAfter(double lonAfter) {
		this.lonAfter = lonAfter;
	}
	
	public String getNameBefore() {
		return nameBefore;
	}
	
	public void setNameBefore(String nameBefore) {
		this.nameBefore = nameBefore;
	}
	
	public String getNameAfter() {
		return nameAfter;
	}
	
	public void setNameAfter(String nameAfter) {
		this.nameAfter = nameAfter;
	}
	
	public String getDescriptionBefore() {
		return descriptionBefore;
	}
	
	public void setDescriptionBefore(String descriptionBefore) {
		this.descriptionBefore = descriptionBefore;
	}
	
	public String getDescriptionAfter() {
		return descriptionAfter;
	}
	
	public void setDescriptionAfter(String descriptionAfter) {
		this.descriptionAfter = descriptionAfter;
	}
	
	public BuildingFlags getFlagsBefore() {
		return flagsBefore;
	}
	
	public void setFlagsBefore(BuildingFlags flagsBefore) {
		this.flagsBefore = flagsBefore;
	}
	
	public BuildingFlags getFlagsAfter() {
		return flagsAfter;
	}
	
	public void setFlagsAfter(BuildingFlags flagsAfter) {
		this.flagsAfter = flagsAfter;
	}
	
}
