package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.userDetails;
import springmvc.model.dao.userDetailsDao;

@Repository
public class userDetailsDaoImpl implements userDetailsDao
{
	@PersistenceContext
	 private EntityManager entityManager;

	 @Override
	    public List<userDetails> getUserDetails()
	    {
	        return entityManager.createQuery("from userDetails ").getResultList();
	    }

	@Override
	@Transactional
	public userDetails saveUser(userDetails user) 
	{
	return entityManager.merge(user);
	}

}
