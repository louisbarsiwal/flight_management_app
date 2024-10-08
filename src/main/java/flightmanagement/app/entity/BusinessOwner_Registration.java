package flightmanagement.app.entity;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class BusinessOwner_Registration {
		
	private int boId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNo;
	private Date dateOfBirth;
	private String username;
	private String password;
	private String passwordSalt;
	private String passwordHash;
	private MultipartFile profileImage;
	
	
	public BusinessOwner_Registration() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BusinessOwner_Registration(String firstName, String lastName, String emailId, String mobileNo,
			Date dateOfBirth, String username, String password, String passwordSalt, String passwordHash,
			MultipartFile profileImage) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.dateOfBirth = dateOfBirth;
		this.username = username;
		this.password = password;
		this.passwordSalt = passwordSalt;
		this.passwordHash = passwordHash;
		this.profileImage = profileImage;
	}


	public BusinessOwner_Registration(int boId, String firstName, String lastName, String emailId, String mobileNo,
			Date dateOfBirth, String username, String password, String passwordSalt, String passwordHash,
			MultipartFile profileImage) {
		super();
		this.boId = boId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.dateOfBirth = dateOfBirth;
		this.username = username;
		this.password = password;
		this.passwordSalt = passwordSalt;
		this.passwordHash = passwordHash;
		this.profileImage = profileImage;
	}


	public int getBoId() {
		return boId;
	}


	public void setBoId(int boId) {
		this.boId = boId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPasswordSalt() {
		return passwordSalt;
	}


	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}


	public String getPasswordHash() {
		return passwordHash;
	}


	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}


	public MultipartFile getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(MultipartFile profileImage) {
		this.profileImage = profileImage;
	}


	@Override
	public String toString() {
		return "\n BusinessOwner_Registration [boId=" + boId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", mobileNo=" + mobileNo + ", dateOfBirth=" + dateOfBirth + ", username="
				+ username + ", password=" + password + ", passwordSalt=" + passwordSalt + ", passwordHash="
				+ passwordHash + ", profileImage=" + profileImage + "]";
	}
	
	
	
	
}
