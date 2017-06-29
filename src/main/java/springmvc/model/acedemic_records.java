package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "acedemic_records")
public class acedemic_records {


	@Id
    @GeneratedValue
    private Integer ac_id;
    private Integer GPA;
    private Byte Transcripts;
    @ManyToOne
    private userDetails uid;


	public acedemic_records()
    {
		super();
    }

	public acedemic_records(Integer ac_id, Integer GPA, Byte Transcripts, userDetails uid)
    {
		super();
		this.ac_id = ac_id;
		this.GPA = GPA;
		this.Transcripts = Transcripts;
		this.uid = uid;
    }

	

	public Integer getGPA() {
		return GPA;
	}


	public void setGPA(Integer GPA) {
		this.GPA = GPA;
	}


	public Integer getAc_id() {
		return ac_id;
	}



	public void setAc_id(Integer ac_id) {
		this.ac_id = ac_id;
	}


    public Byte getTranscripts() {
		return Transcripts;
	}


	public void setTranscripts(Byte transcripts) {
		Transcripts = transcripts;
	}

	public userDetails getUid() {
		return uid;
	}

	public void setUid(userDetails uid) {
		this.uid = uid;
	}



}
