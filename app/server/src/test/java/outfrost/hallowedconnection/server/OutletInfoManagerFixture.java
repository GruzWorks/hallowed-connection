package outfrost.hallowedconnection.server;

import outfrost.hallowedconnection.server.data.User;
import outfrost.hallowedconnection.server.data.UserAccessLevel;

import java.sql.SQLException;

public class OutletInfoManagerFixture {
	
	private OutletInfoManager outletInfoManager;
	private String getUserValidation;
	
	public OutletInfoManagerFixture() {
	
	}
	
	public void execute() throws SQLException, ClassNotFoundException {
		outletInfoManager = new OutletInfoManager();
		
		User user = outletInfoManager.getUser(28464942894168541L);
		getUserValidation = (user.getDisplayName().equals("mkay") && user.getAccessLevel() == UserAccessLevel.REGISTERED && user.getEmail().equals("idontknow@thispersonsemail.com")) ? "OK" : "FAIL";
		
	}
	
	public String getUserValidation() {
		return getUserValidation;
	}
	
}
