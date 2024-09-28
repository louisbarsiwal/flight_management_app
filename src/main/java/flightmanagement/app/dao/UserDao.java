package flightmanagement.app.dao;

import java.io.IOException;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialException;

import flightmanagement.app.entity.BusinessOwner_Registration;

public interface UserDao {
	int insertBusinessOwner(BusinessOwner_Registration businessOwnerRegistration) throws IOException,SerialException,SQLException;
	
}
