package outfrost.hallowedconnection.server.data;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import outfrost.hallowedconnection.server.OutletInfoManager;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class BuildingTest {
	
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
	void getLat() throws SQLException {
		Building building = outletInfoManager.getBuilding(720195837538547236L);
		assertEquals(51.4232, building.getLat());
	}
	
	@Test
	void getLon() throws SQLException {
		Building building = outletInfoManager.getBuilding(720195837538547236L);
		assertEquals(17.1992, building.getLon());
	}
	
	@Test
	void getName() throws SQLException {
		Building building = outletInfoManager.getBuilding(720195837538547236L);
		assertEquals("Pasaż Grunwaldzki", building.getName());
	}
	
	@Test
	void getSubmittedBy() throws SQLException {
		Building building = outletInfoManager.getBuilding(720195837538547236L);
		assertEquals(7654723162654012354L, building.getSubmittedBy().getId());
	}
	
	@Test
	void getOutletCount() throws SQLException {
		Building building = outletInfoManager.getBuilding(720195837538547236L);
		assertEquals(0, building.getOutletCount());
	}
}