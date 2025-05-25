package docu_controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller_ {
	@GetMapping("/print")
public String m1() {
	return "welcome ";
}
}
