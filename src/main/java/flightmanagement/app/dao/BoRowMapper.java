package flightmanagement.app.dao;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.multipart.MultipartFile;

import flightmanagement.app.entity.BusinessOwner_Registration;
import flightmanagement.app.utilities.ByteArrayMultiPartFile;



public class BoRowMapper implements RowMapper<BusinessOwner_Registration> {

	@Override
	public BusinessOwner_Registration mapRow(ResultSet rs, int rowNum) throws SQLException {
		BusinessOwner_Registration businessOwnerRegistration = new BusinessOwner_Registration();

		businessOwnerRegistration.setBoId(rs.getInt("businessOwner_id"));
		businessOwnerRegistration.setFirstName(rs.getString("first_name"));
		businessOwnerRegistration.setLastName(rs.getString("last_name"));
		businessOwnerRegistration.setEmailId(rs.getString("email_id"));
		businessOwnerRegistration.setMobileNo(rs.getString("mobile_no"));
		businessOwnerRegistration.setDateOfBirth(rs.getDate("date_of_birth"));
		businessOwnerRegistration.setUsername(rs.getString("username"));
		businessOwnerRegistration.setPasswordSalt(rs.getString("password_salt"));
		businessOwnerRegistration.setPasswordHash(rs.getString("password_hash"));
		
		Blob profileImageBlob = rs.getBlob("profile_image");
		
		// Convert blob to MultipartFile
		byte[] imageBytes = profileImageBlob.getBytes(1, (int) profileImageBlob.length());
		MultipartFile profileImage = new ByteArrayMultiPartFile(imageBytes, "profileImage.jpg", "image/jpeg");
		
		businessOwnerRegistration.setProfileImage(profileImage);
		
		return businessOwnerRegistration;
	}

}

