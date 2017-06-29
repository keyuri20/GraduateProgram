package springmvc.model.dao;

import java.util.List;

import springmvc.model.userDetails;


public interface userDetailsDao 
{
	List<userDetails> getUserDetails();
	
	userDetails saveUser(userDetails user);

}
