package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.department;
import springmvc.model.userDetails;
import springmvc.model.dao.departmentDao;

@Repository
public class departmentDaoImpl implements departmentDao 
{
	 @PersistenceContext
	 private EntityManager entityManager;

	 @Override
	    public List<department> getDepartment()
	    {
	        return entityManager.createQuery("from department ").getResultList();
	    }

	@Override
	public department dept(Integer id) 
	{
		
		return entityManager.find(department.class, id);
	}
	
	@Override
	@Transactional
	public department saveDepartment(department dept) 
	{
	return entityManager.merge(dept);
	}

	@Override
	@Transactional
	
	public void delete(department department) 
	{
		entityManager.remove(department);	
	}

}
