package springmvc.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "status")
	public class status {

	@Id
	@GeneratedValue
	private Integer status_id;
	private String status_name;
	private Date LastUpdated;
	private String comments;
	@ManyToOne
	private studentDetails sid;
	
	
	public status()
    {
    	super();
    }
	
	public status(Integer status_id, String status_name, Date LastUpdated, String comments, studentDetails sid)
    {
    	super();
    	this.status_id = status_id;
    	this.status_name = status_name;
    	this.LastUpdated = LastUpdated;
    	this.comments = comments;
    }
	
    public Integer getStatus_id() {
		return status_id;
	}

	public void setStatus_id(Integer status_id) {
		this.status_id = status_id;
	}

	public String getStatus_name() {
		return status_name;
	}

	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}
	
	
	public Date getLastUpdated() {
		return LastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		LastUpdated = lastUpdated;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public studentDetails getSid() {
		return sid;
	}

	public void setSid(studentDetails sid) {
		this.sid = sid;
	}



}
