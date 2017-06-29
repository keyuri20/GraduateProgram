package springmvc.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.department;
import springmvc.model.userDetails;
import springmvc.model.dao.userDetailsDao;


@Controller
public class userDetailsController 
{

	@Autowired
	userDetailsDao userDetailsDao;
	
    @RequestMapping(value="/register.html", method=RequestMethod.GET)
    public String register()
    {
        return "register";
    }
    
    
    @RequestMapping(value="/register.html", method=RequestMethod.POST)
    public String register(@RequestParam String firstname, @RequestParam String lastname, @RequestParam String email, @RequestParam String password )
    {
    	userDetails user = new userDetails();
    	user.setFirst_name(firstname);
    	user.setLast_name(lastname);
    	user.setEmail(email);
    	user.setPassword(password);
    	user.setRid(3);
    	user = userDetailsDao.saveUser(user);
        return "login";
    }

    
    @RequestMapping(value={"/login.html","index.html"},method = RequestMethod.GET)
    public String login(ModelMap models) 
    {
        models.put("info", "Hello User");
        return "login";
    }
    
    
    @RequestMapping(value="/login.html",method = RequestMethod.POST)
    public String submit(@RequestParam String username, @RequestParam String password , ModelMap models) 
    {
    	List<userDetails> userDetails = userDetailsDao.getUserDetails();
        for(userDetails userDetail: userDetails)
        {
        	if (userDetail.getEmail().equalsIgnoreCase(username) && userDetail.getPassword().equals(password)) 
        	{
        		if((userDetail.getRid()).equals(3))
        		{
        			models.put("userInfo", userDetail.getFirst_name());
        			return "gapp-main";
        		}
        		else if((userDetail.getRid()).equals(1))
        		{
        			models.put("userInfo", userDetail.getFirst_name());
        			return "redirect:/list.html";
        		}
        }
        }
            models.put("error", "Invalid UserName / Password");
            return "login";
    
    }
    
    @RequestMapping("/logout.html")
    public String logout(HttpSession session ) 
    {
    
       session.invalidate();
       return "login";
    }
}

