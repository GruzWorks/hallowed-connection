package outfrost.hallowedconnection.server.data;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import outfrost.hallowedconnection.server.OutletInfoManager;

import java.sql.SQLException;
import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
	
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
	void getDisplayName() throws SQLException {
		User user = outletInfoManager.getUser(7654723162654012354L);
		assertEquals("Quanterro", user.getDisplayName());
	}
	
	@Test
	void getAccessLevel() throws SQLException {
		User user = outletInfoManager.getUser(7654723162654012354L);
		assertEquals(UserAccessLevel.MODERATOR, user.getAccessLevel());
	}
	
	@Test
	void getMemberSince() throws SQLException {
		User user = outletInfoManager.getUser(7654723162654012354L);
		assertEquals(Timestamp.valueOf("2018-01-21 20:50:37.61357"), user.getMemberSince());
	}
	
	@Test
	void getEmail() throws SQLException {
		User user = outletInfoManager.getUser(7654723162654012354L);
		assertEquals("quanterro@gmail.com", user.getEmail());
	}
}