package outfrost.hallowedconnection.server;

import outfrost.hallowedconnection.server.data.*;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.EnumSet;
import java.util.Random;

public class OutletInfoManager {
	
	private Connection connection;
	private Random random = new Random();
	
	public OutletInfoManager() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		connection = DriverManager.getConnection("jdbc:postgresql://localhost/hallowed?user=hallowedserver&password=1337test");
		connection.setAutoCommit(true);
	}
	
	public User getUser(long id) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("SELECT id, display_name, access_level, " +
			                                                          "member_since, email FROM public.User WHERE id = ?;");
		
		statement.setLong(1, id);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			User user = new User();
			user.setId(resultSet.getLong(1));
			user.setDisplayName(resultSet.getString(2));
			int accessLevelNumeric = resultSet.getInt(3);
			for (UserAccessLevel accessLevel : UserAccessLevel.values()) {
				if (accessLevel.getValue() == accessLevelNumeric) {
					user.setAccessLevel(accessLevel);
				}
			}
			user.setMemberSince((Timestamp) resultSet.getObject(4));
			user.setEmail(resultSet.getString(5));
			return user;
		}
		else {
			return null;
		}
	}
	
	public Building getBuilding(long id) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("SELECT id, lat, lon, name, description, " +
			                                                          "submitted_by, time_submitted, flags, outlet_count " +
			                                                          "FROM Building WHERE id = ?;");
		
		statement.setLong(1, id);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			Building building = new Building();
			building.setId(resultSet.getLong(1));
			building.setLat(resultSet.getDouble(2));
			building.setLon(resultSet.getDouble(3));
			building.setName(resultSet.getString(4));
			building.setDescription(resultSet.getString(5));
			building.setSubmittedBy(getUser(resultSet.getLong(6)));
			building.setTimeSubmitted((Timestamp) resultSet.getObject(7));
			long flagsNumeric = resultSet.getLong(8);
			EnumSet<BuildingFlags> flags = EnumSet.noneOf(BuildingFlags.class);
			for (BuildingFlags flag : BuildingFlags.values()) {
				if ((flagsNumeric & flag.getValue()) != 0) {
					flags.add(flag);
				}
			}
			building.setFlags(flags);
			building.setOutletCount(resultSet.getInt(9));
			return building;
		}
		else {
			return null;
		}
	}
	
	public void addNewBuilding(BuildingModification buildingModification) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("INSERT INTO BuildingModification " +
			                                                          "(id, building_id, submitted_by, time_submitted, " +
			                                                          "approved, lat_before, lat_after, " +
			                                                          "lon_before, lon_after, name_before, name_after, " +
			                                                          "description_before, description_after, " +
			                                                          "flags_before, flags_after) VALUES " +
			                                                          "(?, NULL, ?, ?, ?, NULL, ?, NULL, ?, NULL, ?, NULL, ?, NULL, ?);");
		statement.setLong(1, buildingModification.getId());
		statement.setLong(2, buildingModification.getSubmittedBy().getId());
		statement.setObject(3, buildingModification.getTimeSubmitted());
		statement.setBoolean(4, buildingModification.isApproved());
		statement.setDouble(5, buildingModification.getLatAfter());
		statement.setDouble(6, buildingModification.getLonAfter());
		statement.setString(7, buildingModification.getNameAfter());
		statement.setString(8, buildingModification.getDescriptionAfter());
		statement.setLong(9, buildingModification.getFlagsAfter().getValue());
		
		statement.executeUpdate();
	}
	
	public void modifyBuilding(BuildingModification buildingModification) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("INSERT INTO BuildingModification " +
			                                                          "(id, building_id, submitted_by, time_submitted, " +
			                                                          "approved, lat_before, lat_after, " +
			                                                          "lon_before, lon_after, name_before, name_after, " +
			                                                          "description_before, description_after, " +
			                                                          "flags_before, flags_after) VALUES " +
			                                                          "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
		
		statement.setLong(1, buildingModification.getId());
		statement.setLong(2, buildingModification.getBuilding().getId());
		statement.setLong(3, buildingModification.getSubmittedBy().getId());
		statement.setObject(4, buildingModification.getTimeSubmitted());
		statement.setBoolean(5, buildingModification.isApproved());
		statement.setDouble(6, buildingModification.getLatBefore());
		statement.setDouble(7, buildingModification.getLatAfter());
		statement.setDouble(8, buildingModification.getLonBefore());
		statement.setDouble(9, buildingModification.getLonAfter());
		statement.setString(10, buildingModification.getNameBefore());
		statement.setString(11, buildingModification.getNameAfter());
		statement.setString(12, buildingModification.getDescriptionBefore());
		statement.setString(13, buildingModification.getDescriptionAfter());
		statement.setLong(14, buildingModification.getFlagsBefore().getValue());
		statement.setLong(15, buildingModification.getFlagsAfter().getValue());
		
		statement.executeUpdate();
	}
	
	public void removeBuilding(BuildingModification buildingModification) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("INSERT INTO BuildingModification " +
			                                                          "(id, building_id, submitted_by, time_submitted, " +
			                                                          "approved, lat_before, lat_after, " +
			                                                          "lon_before, lon_after, name_before, name_after, " +
			                                                          "description_before, description_after, " +
			                                                          "flags_before, flags_after) VALUES " +
			                                                          "(?, ?, ?, ?, ?, ?, NULL, ?, NULL, ?, NULL, ?, NULL, ?, NULL);");
		statement.setLong(1, buildingModification.getId());
		statement.setLong(2, buildingModification.getBuilding().getId());
		statement.setLong(3, buildingModification.getSubmittedBy().getId());
		statement.setObject(4, buildingModification.getTimeSubmitted());
		statement.setBoolean(5, buildingModification.isApproved());
		statement.setDouble(6, buildingModification.getLatBefore());
		statement.setDouble(7, buildingModification.getLonBefore());
		statement.setString(8, buildingModification.getNameBefore());
		statement.setString(9, buildingModification.getDescriptionBefore());
		statement.setLong(10, buildingModification.getFlagsBefore().getValue());
		
		statement.executeUpdate();
	}
	
	public BuildingModification getBuildingModification(long id) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("SELECT id, building_id, submitted_by, " +
			                                                          "time_submitted, approved, lat_before, lat_after, " +
			                                                          "lon_before, lon_after, name_before, name_after, " +
			                                                          "description_before, description_after, " +
			                                                          "flags_before, flags_after FROM BuildingModification WHERE id = ?;");
		
		statement.setLong(1, id);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			BuildingModification buildingModification = new BuildingModification();
			buildingModification.setId(resultSet.getLong(1));
			buildingModification.setBuilding(getBuilding(resultSet.getLong(2)));
			buildingModification.setSubmittedBy(getUser(resultSet.getLong(3)));
			buildingModification.setTimeSubmitted((Timestamp) resultSet.getObject(4));
			buildingModification.setApproved(resultSet.getBoolean(5));
			buildingModification.setLatBefore(resultSet.getDouble(6));
			buildingModification.setLatAfter(resultSet.getDouble(7));
			buildingModification.setLonBefore(resultSet.getDouble(8));
			buildingModification.setLonAfter(resultSet.getDouble(9));
			buildingModification.setNameBefore(resultSet.getString(10));
			buildingModification.setNameAfter(resultSet.getString(11));
			buildingModification.setDescriptionBefore(resultSet.getString(12));
			buildingModification.setDescriptionAfter(resultSet.getString(13));
			long flagsBeforeNumeric = resultSet.getLong(14);
			long flagsAfterNumeric = resultSet.getLong(15);
			BuildingFlags flagsBefore = BuildingFlags.NONE;
			BuildingFlags flagsAfter = BuildingFlags.NONE;
			for (BuildingFlags flag : BuildingFlags.values()) {
				if (flagsBeforeNumeric == flag.getValue()) {
					flagsBefore = flag;
				}
				if (flagsAfterNumeric == flag.getValue()) {
					flagsAfter = flag;
				}
			}
			buildingModification.setFlagsBefore(flagsBefore);
			buildingModification.setFlagsAfter(flagsAfter);
			return buildingModification;
		}
		else {
			return null;
		}
	}
	
	public Connection getConnection() {
		return connection;
	}
	
}
