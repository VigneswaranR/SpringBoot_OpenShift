package com.TCSNGA.MS1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TcsNgaMS1Controller {

//	@Autowired
//	public StudentDataConfiguration data;
	
	@RequestMapping(value="/data")
	public String getName() {
		
		return "My first sample open shift application";
	}
}
