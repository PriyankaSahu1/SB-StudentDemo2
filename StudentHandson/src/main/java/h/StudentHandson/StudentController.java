package h.StudentHandson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@Autowired
	StudentDao dao;
	
	@RequestMapping("/home")
	public String home() {
		return "Home.jsp";
	}
	@RequestMapping("/index")
	public String home1() {
		return "index.jsp";
	}
	@RequestMapping("/view")
	public String home2() {
		return "View.jsp";
	}
	
	@RequestMapping("/AddStudent")
	public String addStudent(Student std) {
		/*ModelAndView mv= new ModelAndView();
		dao.save(std);
		mv.addObject("std", "Record Inserted");
		mv.setViewName("Home.jsp");
		return mv;*/
		
		dao.save(std);
		return "Home.jsp";
	}

	@RequestMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam int roll) {
	    ModelAndView mv=new ModelAndView("showStudent.jsp");
		Student s=dao.findById(roll).orElse(new Student());
		mv.addObject(s);
		return mv;
	}
}
