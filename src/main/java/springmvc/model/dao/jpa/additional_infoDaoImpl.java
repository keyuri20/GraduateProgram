package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.additional_info;
import springmvc.model.dao.additional_infoDao;


@Repository
public class additional_infoDaoImpl implements additional_infoDao
{
	@PersistenceContext
	 private EntityManager entityManager;

	public List<additional_info> getAdditional_info(Integer id)
   {
		return entityManager.createQuery("from additional_info where d_no= " +id ).getResultList();
		 
   }
	
	@Override
	@Transactional
	public additional_info saveAdditional(additional_info additional_info) 
	{
		return entityManager.merge(additional_info);
	}

	@Override
	public additional_info getadditional(Integer id)
	{
		return entityManager.find(additional_info.class, id);
	}
	
	@Override
	@Transactional
	public void delete(additional_info additional_info)
	{
		entityManager.remove(additional_info);
	}

}
