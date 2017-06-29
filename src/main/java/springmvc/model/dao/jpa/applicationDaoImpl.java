package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import springmvc.model.application;
import springmvc.model.dao.applicationDao;

@Repository
public class applicationDaoImpl implements applicationDao
{
	 @PersistenceContext
	 private EntityManager entityManager;
	 
	 @Override
	    public List<application> getApplication()
	    {
	        return entityManager.createQuery("select a from application a join a.d_no d where d.dept_name='Accounting' and a.term='Fall 2016'").getResultList();
	    }

}
