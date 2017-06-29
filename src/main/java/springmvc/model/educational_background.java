package springmvc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "educational_background")
public class educational_background 
{

	@Id
    @GeneratedValue
	private Integer eid;
    private String clg_name;
    private Integer duration;
    private String major;    
    
    @ManyToOne
    private studentDetails sid;
    
    @OneToMany(mappedBy="eid")
	private List<degree> degrees = new ArrayList<>();
	
    
    
    public educational_background()
    {
    	super();
    }
    
    public educational_background(Integer eid, String clg_name, Integer duration, String major)
    {
    	super();
    	this.eid = eid;
    	this.clg_name = clg_name;
    	this.duration = duration;
    	this.major = major;
    }

	
	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}


	public String getClg_name() {
		return clg_name;
	}

	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	
	
	public studentDetails getSid() {
		return sid;
	}

	public void setSid(studentDetails sid) {
		this.sid = sid;
	}

	public List<degree> getDegrees() {
		return degrees;
	}

	public void setDegrees(List<degree> degrees) {
		this.degrees = degrees;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
}


