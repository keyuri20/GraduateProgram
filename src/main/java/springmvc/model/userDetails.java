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
	@Table(name = "userDetails")
	public class userDetails {

	    @Id
	    @GeneratedValue
	    private Integer uid;
	    private String last_name;
	    private String first_name;
	    private String email;
	    private String password;
	    private Integer rid;
	    
	    @OneToMany(mappedBy="uid")
		private List<acedemic_records> records  = new ArrayList<>();
		

	    public userDetails()
	    {
	    	super();
	    }


	    public userDetails(Integer uid,String last_name,String first_name, String email, String password, Integer rid )
	    {
	    	super();
	    	this.uid=uid;
	    	this.last_name = last_name;
	    	this.first_name = first_name;
	    	this.email = email;
	    	this.password = password;
	    	this.rid = rid;
	    }

		public Integer getUid() {
			return uid;
		}

		public void setUid(Integer uid) {
			this.uid = uid;
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

		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public List<acedemic_records> getRecords() {
			return records;
		}


		public void setRecords(List<acedemic_records> records) {
			this.records = records;
		}


		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Integer getRid() {
			return rid;
		}

		public void setRid(Integer rid) {
			this.rid = rid;
		}

}
