package flightmanagement.app.dao;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import flightmanagement.app.entity.BusinessOwner_Registration;

@Repository
public class UserDaoImpl implements UserDao {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertBusinessOwner(BusinessOwner_Registration businessOwnerRegistration)
			throws IOException, SerialException, SQLException {
		Blob profileImage = getBlob(businessOwnerRegistration.getProfileImage());

		String query = "INSERT INTO businessowner " + "(`first_name`, `last_name`, `email_id`, `mobile_no`, "
				+ "`date_of_birth`, `username`, `password_salt`, `password_hash`, "
				+ "`profile_image`) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		return jdbcTemplate.update(query, 
				businessOwnerRegistration.getFirstName(), 
				businessOwnerRegistration.getLastName(), 
				businessOwnerRegistration.getEmailId(),
				businessOwnerRegistration.getMobileNo(), 
				businessOwnerRegistration.getDateOfBirth(), 
				businessOwnerRegistration.getUsername(), 
				businessOwnerRegistration.getPasswordSalt(),
				businessOwnerRegistration.getPasswordHash(), 
				profileImage);
	}
		
		private Blob getBlob(MultipartFile image) throws IOException, SerialException, SQLException {
			byte[] byteArr = image.getBytes();
			Blob imageBlob = new SerialBlob(byteArr);
			return imageBlob;
		}
	}

