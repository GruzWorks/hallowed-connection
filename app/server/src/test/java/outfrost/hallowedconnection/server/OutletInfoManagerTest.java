package outfrost.hallowedconnection.server;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import outfrost.hallowedconnection.server.data.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class OutletInfoManagerTest {
	
	private OutletInfoManager outletInfoManager;
	private Random random = new Random();
	
	private long newBuildingId;
	
	@BeforeEach
	void setUp() throws SQLException, ClassNotFoundException {
		outletInfoManager = new OutletInfoManager();
	}
	
	@AfterEach
	void tearDown() throws SQLException {
		outletInfoManager.getConnection().close();
	}
	
	@AfterAll
	static void finish() throws SQLException, ClassNotFoundException {
		OutletInfoManager outletInfoManager = new OutletInfoManager();
		outletInfoManager.getConnection().prepareStatement("DELETE FROM Building WHERE name = 'JUnitTest';").executeUpdate();
		outletInfoManager.getConnection().prepareStatement("DELETE FROM BuildingModification WHERE name_before = 'JUnitTest' OR name_after = 'JUnitTest';").executeUpdate();
		outletInfoManager.getConnection().close();
	}
	
	@Test
	void getUser() throws SQLException, ClassNotFoundException {
		User user = outletInfoManager.getUser(-19248712047002142L);
		
		assertNotNull(user);
		assertEquals("Outfrost", user.getDisplayName());
		assertEquals(UserAccessLevel.ADMINISTRATOR, user.getAccessLevel());
		assertEquals("kotlet.bahn@gmail.com", user.getEmail());
	}
	
	@Test
	void getBuilding() throws SQLException, ClassNotFoundException {
		Building building = outletInfoManager.getBuilding(720195837538547236L);
		
		assertNotNull(building);
		assertEquals("Pasaż Grunwaldzki", building.getName());
		assertEquals(51.4232, building.getLat());
		assertEquals(17.1992, building.getLon());
	}
	
	@Test
	void addNewBuilding() throws SQLException {
		BuildingModification buildingModification = new BuildingModification();
		long randomId = random.nextLong();
		buildingModification.setId(randomId);
		buildingModification.setSubmittedBy(outletInfoManager.getUser(-19248712047002142L));
		buildingModification.setTimeSubmitted(Timestamp.from(Instant.now()));
		buildingModification.setApproved(true);
		buildingModification.setLatAfter(51.2137);
		buildingModification.setLonAfter(17.1410);
		buildingModification.setNameAfter("JUnitTest");
		buildingModification.setDescriptionAfter(Integer.toString(random.nextInt()));
		buildingModification.setFlagsAfter(BuildingFlags.NONE);
		
		outletInfoManager.addNewBuilding(buildingModification);
		
		newBuildingId = outletInfoManager.getBuildingModification(randomId).getBuilding().getId();
	}
	
	@Test
	void modifyBuilding() throws SQLException {
		if (newBuildingId == 0) {
			addNewBuilding();
		}
		
		BuildingModification buildingModification = new BuildingModification();
		Building building = outletInfoManager.getBuilding(newBuildingId);
		buildingModification.setId(random.nextLong());
		buildingModification.setBuilding(building);
		buildingModification.setSubmittedBy(outletInfoManager.getUser(-19248712047002142L));
		buildingModification.setTimeSubmitted(Timestamp.from(Instant.now()));
		buildingModification.setApproved(false);
		buildingModification.setLatBefore(51.2137);
		buildingModification.setLatAfter(51.2137);
		buildingModification.setLonBefore(17.1410);
		buildingModification.setLonAfter(17.1666);
		buildingModification.setNameBefore("JUnitTest");
		buildingModification.setNameAfter("Test ~");
		buildingModification.setDescriptionBefore(building.getDescription());
		buildingModification.setDescriptionAfter(building.getDescription());
		buildingModification.setFlagsBefore(BuildingFlags.NONE);
		buildingModification.setFlagsAfter(BuildingFlags.NONE);
		
		outletInfoManager.modifyBuilding(buildingModification);
	}
	
	@Test
	void removeBuilding() throws SQLException {
		if (newBuildingId == 0) {
			addNewBuilding();
		}
		
		BuildingModification buildingModification = new BuildingModification();
		Building building = outletInfoManager.getBuilding(newBuildingId);
		buildingModification.setId(random.nextLong());
		buildingModification.setBuilding(building);
		buildingModification.setSubmittedBy(outletInfoManager.getUser(-19248712047002142L));
		buildingModification.setTimeSubmitted(Timestamp.from(Instant.now()));
		buildingModification.setApproved(false);
		buildingModification.setLatBefore(51.2137);
		buildingModification.setLonBefore(17.1410);
		buildingModification.setNameBefore("JUnitTest");
		buildingModification.setDescriptionBefore(building.getDescription());
		buildingModification.setFlagsBefore(BuildingFlags.NONE);
		
		outletInfoManager.removeBuilding(buildingModification);
	}
}