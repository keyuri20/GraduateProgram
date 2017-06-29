package springmvc.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import springmvc.model.additional_info;
import springmvc.model.department;
import springmvc.model.program;
import springmvc.model.dao.additional_infoDao;
import springmvc.model.dao.departmentDao;
import springmvc.model.dao.programDao;


@Controller
@SessionAttributes({"department","program", "additional_info"})
public class departmentController 
{
	
	
	@Autowired
	private departmentDao departmentDao;
	
	@Autowired
	private programDao programDao;
	
	@Autowired
	private additional_infoDao additional_infoDao;
	
	
	@RequestMapping("list.html")
	public String list(ModelMap models)
	{
		List<department> department = departmentDao.getDepartment();
		List<Integer> sizes = new ArrayList<Integer>();
		for(department dept : department)
		{
			List<program> program= programDao.getProgram(dept.getD_no());
			sizes.add(program.size());
		}
		models.put("sizes", sizes);
		models.put("department", department);
		return "list";
	}

	@RequestMapping("details.html")
	public String details(@RequestParam Integer d_no, ModelMap models)
	{
		department dept= departmentDao.dept(d_no);
		models.put("department", dept);
		models.put("program",programDao.getProgram(d_no) );
		models.put("additional_info",additional_infoDao.getAdditional_info(d_no));
		return "details";
	}
	
	@RequestMapping(value="addDept.html" , method=RequestMethod.GET)
	public String addDept()
    {
        return "addDept";
    }
    
    
    @RequestMapping(value="addDept.html", method=RequestMethod.POST)
    public String addDept(@RequestParam String dept_name )
    {
    	department dept = new department();
    	dept.setDept_name(dept_name);
    	dept = departmentDao.saveDepartment(dept);
        return "redirect:/list.html";
    }

	@RequestMapping(value="editDept.html" , method=RequestMethod.GET)
	public String editDept(@RequestParam Integer d_no, ModelMap models)
	{
		models.put("department", departmentDao.dept(d_no) );
		return "editDept";
	}
	
	@RequestMapping(value="editDept.html" , method=RequestMethod.POST)
	public String editDept(@ModelAttribute department department)
	{
		department= departmentDao.saveDepartment(department);
		return "redirect:/list.html";
	}

	@RequestMapping(value="deleteDept.html", method=RequestMethod.GET)
	public String deleteDept(@RequestParam Integer d_no, @ModelAttribute department department)
	{
		department department1 =departmentDao.dept(d_no);
		List<program> programs = department1.getPrograms();
		for(int i = 0 ; i < programs.size() ; i++){
			programDao.delete(programs.get(i));
		}
		List<additional_info> details = department1.getInfo();
		for(int i = 0 ; i < details.size() ; i++){
			details.remove(i);
		}
		departmentDao.delete(department1); 
		return "redirect:/list.html";
	}

    
    @RequestMapping(value="addProg.html" , method=RequestMethod.GET)
	public String addProg(@RequestParam Integer d_no, ModelMap models)
    {
    	models.put("d_no",d_no);
        return "addProg";
    }
    
    
    @RequestMapping(value="addProg.html", method=RequestMethod.POST)
    public String addProg(@ModelAttribute department department,@RequestParam String prog_name, ModelMap models)
    {
    	program prog = new program();
    	prog.setProgram_name(prog_name);
    	prog.setD_no(department);
    	prog = programDao.saveProgram(prog);
    	
        return "redirect:/details.html?d_no="+department.getD_no();
    }
	
	@RequestMapping(value="editProg.html" , method=RequestMethod.GET)
	public String editProg(@RequestParam Integer p_no, ModelMap models,@RequestParam Integer d_no)
	{
		/*program program = new program();
		models.put("program", program);*/
		System.out.println("HERE : "+ p_no);
		models.put("p_no", p_no);
		models.put("d_no", d_no);
		models.put("program", programDao.getprog(p_no));
		return "editProg";
	}
	
	@RequestMapping(value="editProg.html" , method=RequestMethod.POST)
	public String editProg(@ModelAttribute program program, @ModelAttribute department department,@RequestParam String program_name, @RequestParam Integer p_no)
	{
		System.out.println("HERE : "+program.getProgram_name());
		program prog = programDao.getprog(p_no);
		prog.setProgram_name(program_name);
		program = programDao.saveProgram(prog);
		return "redirect:/details.html?d_no="+department.getD_no();
	}
	
	@RequestMapping(value="deleteProg.html", method=RequestMethod.GET)
	public String deleteProg(@RequestParam Integer p_no, @ModelAttribute department department)
	{
		program program=programDao.getprog(p_no);
		programDao.delete(program);
		return "redirect:/details.html?d_no="+department.getD_no(); 
	}

    @RequestMapping(value="addReq.html" , method=RequestMethod.GET)
	public String addReq(@RequestParam Integer d_no,ModelMap models)
    {	
    	models.put("d_no",d_no);
        return "addReq";
    }
    
    
    @RequestMapping(value="addReq.html", method=RequestMethod.POST)
    public String addReq(@RequestParam String name, @RequestParam String type, @ModelAttribute department department )
    {
    	additional_info additional_info = new additional_info();
    	additional_info.setName(name);
    	additional_info.setType(type);
    	additional_info.setRequired(true);
    	additional_info.setD_no(department);
    	additional_info = additional_infoDao.saveAdditional(additional_info);
        return "redirect:/details.html?d_no="+department.getD_no();
    }
	
	@RequestMapping(value="editReq.html" , method=RequestMethod.GET)
	public String editReq(@RequestParam Integer ad_id, ModelMap models,@RequestParam Integer d_no)
	{
		models.put("d_no", d_no);
		models.put("additional_info", additional_infoDao.getadditional(ad_id));
		return "editReq";
	}
	
	@RequestMapping(value="editReq.html" , method=RequestMethod.POST)
	public String editReq(@RequestParam  String name,@RequestParam String type,@RequestParam Integer ad_id, @RequestParam Integer d_no)
	{
		additional_info additional = additional_infoDao.getadditional(ad_id);
		additional.setName(name);
		additional.setType(type);
		additional= additional_infoDao.saveAdditional(additional);
		return "redirect:/details.html?d_no="+d_no;
	}
	
	@RequestMapping(value="deleteReq.html", method=RequestMethod.GET)
	public String deleteReq(@RequestParam Integer ad_id, @ModelAttribute department department)
	{
		additional_info additional_info=additional_infoDao.getadditional(ad_id);
		additional_infoDao.delete(additional_info);
		return "redirect:/details.html?d_no="+department.getD_no(); 
	}

	
}
