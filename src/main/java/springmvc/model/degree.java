package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "degree")
public class degree 
{

	@Id
    @GeneratedValue
	private Integer degree_id;
    private String degree_name;
    @ManyToOne
    private educational_background eid;
    
    public degree()
    {
    	super();
    }
    
    public degree(Integer degree_id, String degree_name)
    {
    	super();
    	this.degree_id = degree_id;
    	this.degree_name = degree_name; 
    	
    }
    
    
	public Integer getDegree_id() {
		return degree_id;
	}

	public void setDegree_id(Integer degree_id) {
		this.degree_id = degree_id;
	}

	public String getDegree_name() {
		return degree_name;
	}

	public void setDegree_name(String degree_name) {
		this.degree_name = degree_name;
	}

}
