package springmvc.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "additional_info")
public class additional_info {

	@Id
    @GeneratedValue
    private Integer ad_id;
	private String name;
	private String type;
	private Boolean required;
	
	@ManyToOne
	private department d_no;
	    
	
	public additional_info()
    {
		super();
    }
	
	public additional_info(Integer ad_id, String name, String type, Boolean required, department d_no)
    {
		super();
		this.ad_id = ad_id;
		this.name = name;
		this.type = type;
		this.required = required;
		this.d_no = d_no;
    }

	
	public Integer getAd_id() {
		return ad_id;
	}

	public void setAd_id(Integer ad_id) {
		this.ad_id = ad_id;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}


	public department getD_no() {
		return d_no;
	}

	public void setD_no(department d_no) {
		this.d_no = d_no;
	}
	

}
