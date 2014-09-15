package psych.server.svc.impl;

import java.util.List;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import psych.server.data.dao.dto.GoalDTO;
import psych.server.data.dao.impl.GoalDAOImpl;
import psych.server.data.svc.impl.BaseSvc;
import psych.server.svc.GoalSvc;
import psych.server.svc.model.UserAuth;

/**
 * Service for interacting with Goals
 * 
 * @author tobyboyd
 * 
 */
public class GoalSvcImpl extends BaseSvc implements GoalSvc {

	private static final Logger log = LoggerFactory.getLogger(GoalSvcImpl.class);
	
	public GoalDTO getSingleUserGoal(UserAuth auth, String goalID) throws Exception{
		log.trace("getSingleUserGoal");
		Session session = null;
		try {
			session = getSessionFactory().getCurrentSession();
			GoalDAOImpl goalDAO = new GoalDAOImpl(session);
			session.beginTransaction();
			GoalDTO goal = goalDAO.getGoal(goalID);
			session.getTransaction().commit();
			return goal;
		} catch (Exception ex) {
			log.error("Unable to get goal by ID:", ex);
			throw ex;
		} finally {
			closeSession(session);
		}
		
	}
	
	public List<GoalDTO> getUserGoals(UserAuth auth, String userID, List<String> goalStatusList) throws Exception {
		log.trace("getUserGoals");
		Session session = null;

		try {
			session = getSessionFactory().getCurrentSession();
			GoalDAOImpl goalDAO = new GoalDAOImpl(session);
			session.beginTransaction();
			List<GoalDTO> goalList = goalDAO.queryUserGoals(userID, goalStatusList);
			session.getTransaction().commit();
			return goalList;
		} catch (Exception ex) {
			log.error("Unable to execute query for users goals:", ex);
			throw ex;
		} finally {
			closeSession(session);
		}
		
	}
	

}
