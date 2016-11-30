package kr.ac.hansung.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.dao.Course;
import kr.ac.hansung.service.CourseService;
@Controller
public class CourseController {
	private CourseService courseService;

	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	@RequestMapping(value = "/course")
	public String showHome(Model model, @RequestParam int year, @RequestParam int semester) {
		List<Course> details = courseService.getDetails(year, semester);
		model.addAttribute("details", details);
	

		return "course";
	}
}
