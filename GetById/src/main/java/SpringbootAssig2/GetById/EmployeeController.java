package SpringbootAssig2.GetById;
import java.util.List;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
	@GetMapping("/emp/{id}")
	public Employee FindById(@PathVariable Integer id)
	{
		List<Employee> empList =Arrays.asList(new Employee(1,"Shailesh"),new Employee(2,"Amit"));
		for (Employee emp:empList)
		{
			if(emp.getEmpID()==id)
			{
				return emp;
			}
		}
		return null;
	}
	
}
