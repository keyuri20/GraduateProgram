package springmvc.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.program;
import springmvc.model.dao.programDao;


@Repository
public class programDaoImpl implements programDao
{
	@PersistenceContext
	 private EntityManager entityManager;

	public List<program> getProgram(Integer id)
    {
		return entityManager.createQuery("from program where d_no= " +id ).getResultList();
		 
    }
	
	@Override
	@Transactional
	public program saveProgram(program prog) 
	{
	return entityManager.merge(prog);
	}

	@Override
	public program getprog(Integer id)
	{
		return entityManager.find(program.class, id);
	}
	
	@Override
	@Transactional
	public void delete(program program)
	{
		entityManager.remove(program);
	}
}
