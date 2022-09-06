package fi.haagahelia.excercise.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fi.haagahelia.excercise.domain.Student;

@Controller
public class StudentController {

	@GetMapping("/hello")
	public String studentList(Model model) {

		Student arnold = new Student("Arnold", "Schwarzenegger");
		Student banderas = new Student("Antonio", "Banderas");
		Student pacino = new Student("Al", "Pacino");
		Student streep = new Student("Meryl", "Streep");
		Student sigourney = new Student("Sigourney", "Weaver");
		Student susan = new Student("Susan", "Sarandon");

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(arnold);
		students.add(banderas);
		students.add(pacino);
		students.add(streep);
		students.add(sigourney);
		students.add(susan);

		model.addAttribute("students", students);

		return "hello";
	}
}