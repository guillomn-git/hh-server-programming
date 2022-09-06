package com.excercise.thyme;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

	@GetMapping("/hello")

	public String welcome(@RequestParam(defaultValue = "name", name = "name", required = false) String name,
			@RequestParam(defaultValue = "0", name = "age", required = false) Integer age, Model model) {

		model.addAttribute("name", name);
		model.addAttribute("age", age);

		return "hello";
	}
}

//@RequestMapping(value = "/hello", method = RequestMethod.GET)
//public String greetingForm(Model model) {
//	model.addAttribute("message", new Message());
//	return "hello";
//}

//@RequestParam(defaultValue = "0", name = "age", required = false) Integer age)
//@RequestParam((