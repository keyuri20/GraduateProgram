package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import springmvc.model.studentDetails;
import springmvc.model.dao.studentDetailsDao;

@Repository
public class studentDetailsDaoImpl implements studentDetailsDao
{
	 @PersistenceContext
	 private EntityManager entityManager;

	 @Override
	    public List<studentDetails> getStudentDetails()
	    {
	    	return entityManager.createQuery("select s from studentDetails s join s.applications a where s.sid=a.sid and s.email='student1@localhost.localdomain'").getResultList();
	    }

}
