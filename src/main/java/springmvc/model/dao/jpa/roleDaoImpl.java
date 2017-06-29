package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import springmvc.model.role;
import springmvc.model.dao.roleDao;

@Repository
public class roleDaoImpl 
{
	@PersistenceContext
	 private EntityManager entityManager;

	public Object getRole(String rolename)
	    {
	        return entityManager.createQuery("select * from role where role_name=" + rolename).getSingleResult();
	    }

}
