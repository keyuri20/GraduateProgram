package springmvc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import springmvc.model.additional_info;

	@Entity
	@Table(name = "department")

public class department 
{
	@Id
	@GeneratedValue
	private Integer d_no;
	private String dept_name;
	
	@OneToMany(mappedBy="d_no")
	private List<application> applications = new ArrayList<>();
	
	
	@OneToMany(mappedBy="d_no")
	private List<additional_info> info = new ArrayList<>();
	
	
	@OneToMany(mappedBy="d_no")
	private List<program> programs = new ArrayList<>();
	
    public department()
    {
    	super();
    }
    
    public department(Integer d_no, String dept_name, additional_info ad_id)
    {
    	super();
    	this.d_no = d_no;
    	this.dept_name = dept_name; 
    }
    
	public Integer getD_no() {
		return d_no;
	}

	public void setD_no(Integer d_no) {
		this.d_no = d_no;
	}

	
	
	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public List<application> getApplications() {
		return applications;
	}

	public void setApplications(List<application> applications) {
		this.applications = applications;
	}

	public List<additional_info> getInfo() {
		return info;
	}

	public void setInfo(List<additional_info> info) {
		this.info = info;
	}

	public List<program> getPrograms() {
		return programs;
	}

	public void setPrograms(List<program> programs) {
		this.programs = programs;
	}

	
}
