package fi.haagahelia.excercise.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fi.haagahelia.excercise.domain.Friend;

@Controller
public class FriendController {

	ArrayList<Friend> friendList = new ArrayList<Friend>();

	@GetMapping("/index")
	public String friendForm(Model model) {
		model.addAttribute("friendList", friendList);
		model.addAttribute("friend", new Friend());
		return "index";
	}

	@PostMapping("/index")
	public String friendSubmit(@ModelAttribute Friend friend, Model model) {
		model.addAttribute("friend", friendList.add(friend));
		return "redirect:/index";
	}

}