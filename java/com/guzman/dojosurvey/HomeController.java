package com.guzman.dojosurvey;
import org.springframework.stereotype.Controller;
import com.guzman.dojosurvey.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@Controller
public class HomeController {
		
		
    @RequestMapping( value = "/survey", method = RequestMethod.GET)
    public String index () {
    	
            return "survey.jsp";
    }
    @RequestMapping( value = "/submitInfo", method = RequestMethod.POST )
	public String submitInfo( @RequestParam( value = "name" ) String name, 
							@RequestParam( value = "dojoLocation" ) String dojoLocation, 
							@RequestParam( value = "favoriteLanguage" ) String favoriteLanguage,
							@RequestParam( value = "comment" ) String comment,
							Model model) {
    	model.addAttribute("result", new Users (name, dojoLocation, favoriteLanguage, comment));
    	if (favoriteLanguage.contentEquals("Java")   ) {
    		return "javaPage.jsp";
    	}
    	else {
    		return "results.jsp";
    	}
    	
	}

        @RequestMapping( value = "/toResults", method = RequestMethod.GET)
        public String toResults() {
                return "results.jsp";
     }
    

}
