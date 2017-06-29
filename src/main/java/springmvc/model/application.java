package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


	@Entity
	@Table(name = "application")
	public class application {

	    @Id
	    @GeneratedValue
	    private Integer aid;
	    @ManyToOne
		private studentDetails sid;
		@ManyToOne
		private department d_no;
		@ManyToOne
		private program p_no;		
		private String term;
		@OneToOne
		private status status_id;
		
		

	    public application()
	    {
	    	super();
	    }

	    public application(Integer aid, studentDetails sid, department d_no, program p_no, String term, status status_id)
	    {
	    	super();
	    	this.aid = aid;
	    	this.sid = sid;
	    	this.d_no = d_no;
	    	this.p_no = p_no;
	    	this.term = term; 
	    	this.status_id = status_id;
	    }	    
	    
		public Integer getAid() {
			return aid;
		}

		public void setAid(Integer aid) {
			this.aid = aid;
		}


		public studentDetails getSid() {
			return sid;
		}

		public void setSid(studentDetails sid) {
			this.sid = sid;
		}

		public department getD_no() {
			return d_no;
		}

		public void setD_no(department d_no) {
			this.d_no = d_no;
		}

		
		
		public program getP_no() {
			return p_no;
		}

		public void setP_no(program p_no) {
			this.p_no = p_no;
		}

		public String getTerm() {
			return term;
		}

		public void setTerm(String term) {
			this.term = term;
		}

		public status getStatus_id() {
			return status_id;
		}

		public void setStatus_id(status status_id) {
			this.status_id = status_id;
		}



}
