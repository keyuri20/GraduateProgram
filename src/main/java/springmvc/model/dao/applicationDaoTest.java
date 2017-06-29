package springmvc.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;
@Test(groups = "applicationDaoTest")
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class applicationDaoTest extends AbstractTransactionalTestNGSpringContextTests
{
	@Autowired
    applicationDao applicationDao;

	@Test
    public void getApplication()
    {
        assert applicationDao.getApplication().size()==1;
    }

}
