package exammicroservice.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import exammicroservice.demo.pojo.Exam;

@RestController
public class ExamController 
{
	@GetMapping("/get-marks")
	public Exam getMarks()
	{
		return new Exam(10,100);
	}
}
