package outfrost.hallowedconnection.server.data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

public class BuildingChunkModification implements Serializable {

	private BuildingChunk buildingChunk;
	private User submittedBy;
	private Timestamp timeSubmitted;
	private boolean approved;
	private double latBefore;
	private double latAfter;
	private double lonBefore;
	private double lonAfter;
	private String nameBefore;
	private String nameAfter;
	private UUID schematicIdBefore;
	private UUID getSchematicIdAfter;
	private BuildingChunkFlags flagsBefore;
	private BuildingChunkFlags flagsAfter;
	private Building building;
	
	public BuildingChunkModification() {
	
	}
	
	public BuildingChunkModification(BuildingChunk buildingChunk, User submittedBy, Timestamp timeSubmitted, boolean approved, double latBefore, double latAfter, double lonBefore, double lonAfter, String nameBefore, String nameAfter, UUID schematicIdBefore, UUID getSchematicIdAfter, BuildingChunkFlags flagsBefore, BuildingChunkFlags flagsAfter, Building building) {
		this.buildingChunk = buildingChunk;
		this.submittedBy = submittedBy;
		this.timeSubmitted = timeSubmitted;
		this.approved = approved;
		this.latBefore = latBefore;
		this.latAfter = latAfter;
		this.lonBefore = lonBefore;
		this.lonAfter = lonAfter;
		this.nameBefore = nameBefore;
		this.nameAfter = nameAfter;
		this.schematicIdBefore = schematicIdBefore;
		this.getSchematicIdAfter = getSchematicIdAfter;
		this.flagsBefore = flagsBefore;
		this.flagsAfter = flagsAfter;
		this.building = building;
	}
	
	public BuildingChunk getBuildingChunk() {
		return buildingChunk;
	}
	
	public void setBuildingChunk(BuildingChunk buildingChunk) {
		this.buildingChunk = buildingChunk;
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
	
	public UUID getSchematicIdBefore() {
		return schematicIdBefore;
	}
	
	public void setSchematicIdBefore(UUID schematicIdBefore) {
		this.schematicIdBefore = schematicIdBefore;
	}
	
	public UUID getGetSchematicIdAfter() {
		return getSchematicIdAfter;
	}
	
	public void setGetSchematicIdAfter(UUID getSchematicIdAfter) {
		this.getSchematicIdAfter = getSchematicIdAfter;
	}
	
	public BuildingChunkFlags getFlagsBefore() {
		return flagsBefore;
	}
	
	public void setFlagsBefore(BuildingChunkFlags flagsBefore) {
		this.flagsBefore = flagsBefore;
	}
	
	public BuildingChunkFlags getFlagsAfter() {
		return flagsAfter;
	}
	
	public void setFlagsAfter(BuildingChunkFlags flagsAfter) {
		this.flagsAfter = flagsAfter;
	}
	
	public Building getBuilding() {
		return building;
	}
	
	public void setBuilding(Building building) {
		this.building = building;
	}
	
}
