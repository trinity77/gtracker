package psych.server.data.dao.impl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import psych.server.data.util.BaseTestCase;
import psych.server.data.util.HibernateUtil;

public class GoalDaoTest extends BaseTestCase{

	private static final Logger log = LoggerFactory.getLogger(GoalDaoTest.class);
	
	@Test
	public void testGetGoal() {
		log.trace("testGetGoal");
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		GoalDAOImpl goalDAO = new GoalDAOImpl(session);
		
		goalDAO.queryUserGoals("", new ArrayList<String>());
		
		
	}

}
