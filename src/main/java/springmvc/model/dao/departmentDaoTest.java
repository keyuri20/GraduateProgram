package springmvc.model.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;
import springmvc.model.dao.departmentDao;
@Test(groups = "departmentDaoTest")
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class departmentDaoTest extends AbstractTransactionalTestNGSpringContextTests
{
	@Autowired
    departmentDao departmentDao;

	@Test
    public void getDepartment()
    {
        assert departmentDao.getDepartment().size()==2;
    }
}
