package com.biometric.controller;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.biometric.forms.UserDetails;

@Controller
public class HomepPageController {

	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(Model model) {
 
		String message = "Welcome to Biometric";
		model.addAttribute("userDetail", new UserDetails());
		
		return new ModelAndView("welcome", "message", message);
	}
	
	
	@RequestMapping(value="/addUser", method = RequestMethod.POST)
	public ModelAndView addNewUser(@ModelAttribute("userDetail") UserDetails userDetails) {
		
		addEntryintheDatabase(userDetails);
		String message = "New User has been added to the database";
		return new ModelAndView("welcome", "newUSer", message);
	}


	private void addEntryintheDatabase(UserDetails userDetails) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/biometric";
		String username = "root";
		String password = "admin";
		
		
		System.out.println("Connecting database...");

		try{
			Class.forName("com.mysql.jdbc.Driver"); 
			
			java.sql.Connection connection = DriverManager.getConnection(url, username, password);
			 System.out.println("Database connected!");
			String query = " insert into userdetails (User_Id, User_name, FingerPrint, phonenumber)"
				        + " values (?, ?, ?, ?)";

				      // create the mysql insert preparedstatement
				      PreparedStatement preparedStmt = connection.prepareStatement(query);
				      preparedStmt.setInt(1, userDetails.getUser_id());
				      preparedStmt.setString(2, userDetails.getFirstName());
				      preparedStmt.setString(3, userDetails.getFingerPrint());
				      preparedStmt.setInt(4, userDetails.getPhonenumber());

				      // execute the preparedstatement
				      preparedStmt.execute();
				      System.out.println("One row created successfully");
				      connection.close();
		   
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
