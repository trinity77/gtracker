package psych.server.data.util;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @version 2.0
 * 
 * @author tboyd
 */
public abstract class BaseTestCase  {

	private static final Logger log = LoggerFactory.getLogger(BaseTestCase.class);

    @Before
    public void setUp() throws Exception {
    	log.trace("setUp");
        HibernateUtil.buildSessionFactory();
    }
}