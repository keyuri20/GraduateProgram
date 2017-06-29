package springmvc.model.dao;

import java.util.List;

import springmvc.model.department;
import springmvc.model.program;
import springmvc.model.userDetails;

public interface departmentDao 
{
	List<department> getDepartment();
 
	department dept(Integer id);

	department saveDepartment(department dept);
	
	void delete(department department);
}
