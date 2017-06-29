package springmvc.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;
@Test(groups = "studentDetailsDaoTest")
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class studentDetailsDaoTest extends AbstractTransactionalTestNGSpringContextTests
{
	@Autowired
	studentDetailsDao studentDetailsDao;

	@Test
    public void getStudentDetails()
    {
        assert studentDetailsDao.getStudentDetails().size()==1;
    }

}
