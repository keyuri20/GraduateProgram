package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "role")

public class role 
{
	@Id
	@GeneratedValue
	private Integer rid;
    private String role_name;
    
    //@OneToMany(mappedBy="rid")
	//private List<userDetails> user = new ArrayList<>();
	
    
    public role()
    {
    	super();
    }

    
    public role(Integer rid, String role_name)
    {
    	super();
    	this.rid = rid;
    	this.role_name = role_name;
    }

    
	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	
	
	/*public List<userDetails> getUser() {
		return user;
	}


	public void setUser(List<userDetails> user) {
		this.user = user;
	}
*/

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

    
	
}
