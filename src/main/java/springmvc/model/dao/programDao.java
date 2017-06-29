package springmvc.model.dao;

import java.util.List;

import springmvc.model.program;

public interface programDao 
{
	List<program> getProgram(Integer id);
	
	program saveProgram(program prog);
	
	program getprog(Integer id); 

	void delete(program program);
}
