package springmvc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import springmvc.model.educational_background;

@Entity
@Table(name = "studentDetails")
public class studentDetails 
{
	@Id
	@GeneratedValue
	private Integer sid;
    private String last_name;
    private String first_name;
    private String CIN;
    private String ph_no;
    private String email;
    private String gender;
    private Date dob;
    private String citizenship;
    @OneToOne
    private userDetails uid;
    

    @OneToMany(mappedBy="sid")
	private List<educational_background> edu  = new ArrayList<>();

    
    @OneToMany(mappedBy="sid")
	private List<application> applications  = new ArrayList<>();

	@OneToMany(mappedBy="sid")
	private List<status> status  = new ArrayList<>();

    
	public studentDetails()
    {
		super();
    }
	

	public studentDetails(Integer sid, String last_name, String first_name, String CIN, String ph_no, String email, String gender, Date dob, String citizenship, userDetails uid) 
	{
		super();
		this.sid = sid;
		this.last_name = last_name;
		this.first_name = first_name;
		this.CIN = CIN;
		this.ph_no = ph_no;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.citizenship = citizenship;
		this.uid = uid;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	
	public List<educational_background> getEdu() {
		return edu;
	}


	public void setEdu(List<educational_background> edu) {
		this.edu = edu;
	}


	public List<status> getStatus() {
		return status;
	}


	public void setStatus(List<status> status) {
		this.status = status;
	}



	
	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String CIN) {
		this.CIN = CIN;
	}

	public String getPh_no() {
		return ph_no;
	}

	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public userDetails getUid() {
		return uid;
	}


	public void setUid(userDetails uid) {
		this.uid = uid;
	}


	public List<application> getApplications() {
		return applications;
	}


	public void setApplications(List<application> applications) {
		this.applications = applications;
	}

	
		
}
