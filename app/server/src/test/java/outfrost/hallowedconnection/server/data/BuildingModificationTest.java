package outfrost.hallowedconnection.server.data;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import outfrost.hallowedconnection.server.OutletInfoManager;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class BuildingModificationTest {
	
	private OutletInfoManager outletInfoManager;
	
	@BeforeEach
	void setUp() throws SQLException, ClassNotFoundException {
		outletInfoManager = new OutletInfoManager();
	}
	
	@AfterEach
	void tearDown() throws SQLException {
		outletInfoManager.getConnection().close();
	}
	
	@Test
	void getSubmittedBy() throws SQLException {
		BuildingModification buildingModification = outletInfoManager.getBuildingModification(9847211560751L);
		assertEquals(-5312645915735884624L, buildingModification.getSubmittedBy().getId());
	}
	
	@Test
	void getLatAfter() throws SQLException {
		BuildingModification buildingModification = outletInfoManager.getBuildingModification(9847211560751L);
		assertEquals(51.43, buildingModification.getLatAfter());
	}
	
	@Test
	void getLonAfter() throws SQLException {
		BuildingModification buildingModification = outletInfoManager.getBuildingModification(9847211560751L);
		assertEquals(17.3, buildingModification.getLonAfter());
	}
	
	@Test
	void getNameAfter() throws SQLException {
		BuildingModification buildingModification = outletInfoManager.getBuildingModification(9847211560751L);
		assertEquals("Test location #1", buildingModification.getNameAfter());
	}
	
	@Test
	void getFlagsAfter() throws SQLException {
		BuildingModification buildingModification = outletInfoManager.getBuildingModification(9847211560751L);
		assertEquals(BuildingFlags.NONE, buildingModification.getFlagsAfter());
	}
}