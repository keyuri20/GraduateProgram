package springmvc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import springmvc.model.department;

	@Entity
	@Table(name = "program")
	public class program {

	    @Id
	    @GeneratedValue
	    private Integer p_no;
	    private String program_name;
	    @ManyToOne
	    private department d_no;
	    

	    @OneToMany(mappedBy="p_no")
		private List<application> app = new ArrayList<>();
		
	    
		public program()
	    {
			super();
			
	    }

		public program(Integer p_no, String program_name, department d_no)
	    {
			super();
			this.p_no = p_no;
			this.program_name = program_name;
			this.d_no = d_no;
			
	    }

		
	    public Integer getP_no() {
			return p_no;
		}

		public void setP_no(Integer p_no) {
			this.p_no = p_no;
		}

		
		
		public List<application> getApp() {
			return app;
		}

		public void setApp(List<application> app) {
			this.app = app;
		}

		public String getProgram_name() {
			return program_name;
		}

		public void setProgram_name(String program_name) {
			this.program_name = program_name;
		}


		public department getD_no() {
			return d_no;
		}


		public void setD_no(department d_no) {
			this.d_no = d_no;
		}
		

}
