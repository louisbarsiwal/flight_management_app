package flightmanagement.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController 
{
	
	
	@GetMapping("/openLoginPage")
	public String openLoginPage() {
		return "user_login";
	}
	
	@GetMapping("/openRegistrationPage")
	public String openRegistrationPage() {
		return "user_registration";
	}
	@GetMapping("/openUserProfilePage")
	public String userprofile() {
		return "userprofile";
	}
	@GetMapping("/openUserEditProfilePage")
	public String usereditprofile() {
		return "user_editprofile";
	}
	@GetMapping("/openFM_loginPage")
	public String FMloginpage() {
		return "FM_login";
	}
	@GetMapping("/openFM_registrationPage")
	public String FMregistrationpage() {
		return "FM_registration";
	}

}
