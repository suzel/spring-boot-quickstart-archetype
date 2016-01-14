package ${package}.${artifactId}.web.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
	
	private static final String HOME_VIEW_NAME = "index";
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Principal principal) {
		return HOME_VIEW_NAME;
	}

}