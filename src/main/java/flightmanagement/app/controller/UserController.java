package flightmanagement.app.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import flightmanagement.app.dao.UserDaoImpl;
import flightmanagement.app.entity.BusinessOwner_Registration;
import flightmanagement.app.utilities.Passwords;


@Controller
@RequestMapping("/businessOwner_Registration")

public class UserController 
{
	private BusinessOwner_Registration businessOwner_Registration;

	@Autowired
	UserDaoImpl userDaoImpl;
	
	
	@GetMapping("/openLoginPage")
	public String openLoginPage() {
		return "user_login";
	}
	
	@GetMapping("/openRegistrationPage")
	public ModelAndView openRegistrationPage(ModelAndView modelAndView) {

		System.out.println("\n openUserRegistrationPage is called");
		modelAndView.setViewName("user_registration");
		return modelAndView;
	}
<<<<<<< HEAD
	
	
//	@PostMapping("/login")
//	public String login(@RequestParam String username, 
//			@RequestParam String password, 
//			Model model, RedirectAttributes attributes) {
//
//		System.out.println("\n login request data: " + username + ", " + password);
//
//		try {
//			businessOwner_Registration = userDaoImpl.fetchUser(username);
//			
//
//			String pwdSalt = businessOwner_Registration .getPasswordSalt();
//			String oldPwdHash = businessOwner_Registration .getPasswordHash();
//
//			String newPassword = password + pwdSalt;
//			String newPasswordHash = Passwords.generatePwdHash(newPassword);
//
//			if (newPasswordHash.equals(oldPwdHash)) {
//
//				model.addAttribute("businessOwner_Registration ", businessOwner_Registration );
//			}
//
//			 catch (EmptyResultDataAccessException e) {
//			attributes.addFlashAttribute("message", "Incorrect Username");
//		}
//
//		return "redirect:/user/openLoginPage";
//	}

	
	@PostMapping("/register")
	public String register(@ModelAttribute BusinessOwner_Registration businessOwner_Registration, RedirectAttributes attributes)
			throws IOException, SerialException, SQLException {


		// Password Encryption starts
		String passwordSalt = Passwords.generatePwdSalt(10);
		businessOwner_Registration.setPasswordSalt(passwordSalt);

		// temporary data => password+salt
		String newPassword = businessOwner_Registration.getPassword() + passwordSalt; // 1234rdvyjtftyf

		String passwordHash = Passwords.generatePwdHash(newPassword);
		businessOwner_Registration.setPasswordHash(passwordHash);
		// Password Encryption completes

		int result = userDaoImpl.insertBusinessOwner(businessOwner_Registration);

		if (result > 0) {
			attributes.addFlashAttribute("message", "Registration Successful");
			return "redirect:/businessOwner_Registration/openLoginPage";
		} else {
			attributes.addFlashAttribute("message", "Registration Failed");
			return "redirect:/businessOwner_Registration/openRegistrationPage";
		}

	}

	
	
=======
	@GetMapping("/openFlightPage")
	public String openFlightPage()
	{
		return "Flight";
	}
>>>>>>> 873f393a1167b0522abd0a11102780737a321b26

}
