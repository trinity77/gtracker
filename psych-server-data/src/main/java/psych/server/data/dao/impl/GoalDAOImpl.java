package psych.server.data.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import psych.server.data.dao.dto.GoalDTO;

/**
 * Code for accessing Goal related data
 * 
 * @author tobyboyd
 * 
 */
public class GoalDAOImpl {

	private Session session;

	private static final Logger log = LoggerFactory
			.getLogger(GoalDAOImpl.class);

	/**
	 * Initialize the DAO
	 * 
	 * @param session
	 *            Hibernate session to be used by methods below
	 */
	public GoalDAOImpl(Session session) {
		log.trace("GoalDAO");
		this.session = session;
	}

	/**
	 * Query user goals, userID is required
	 * 
	 * @param userID
	 *            UserID required for query
	 * @param goalStatusList
	 *            List of goal types, Active, Deleted, Archived, etc. If passed
	 *            as null, all goals are returned
	 * @return List of goals, if none found empty list is returned
	 */
	public List<GoalDTO> queryUserGoals(String userID,
			List<String> goalStatusList) {
		log.trace("queryGoals");

		// Create criteria for the search
		Criteria crit = session.createCriteria(GoalDTO.class);
		crit.add(Restrictions.eq("userDTO", userID));

		if (goalStatusList != null && goalStatusList.size() > 0) {
			crit.add(Restrictions.in("goalStatus", goalStatusList));
		}
		crit.addOrder(Order.asc("defaultOrder"));
		@SuppressWarnings("unchecked")
		List<GoalDTO> goalList = crit.list();
		return goalList;
	}

	/**
	 * 
	 * @param goalID
	 * @return
	 */
	public GoalDTO getGoal(String goalID) {
		log.trace("getGoal");

		return (GoalDTO) session.get(GoalDTO.class, goalID);

	}

	/**
	 * 
	 * @param goalDTO
	 * @return
	 */
	public GoalDTO saveUpdateGoal(GoalDTO goalDTO) {
		log.trace("saveUpdateGoal");

		if (goalDTO.getGoalID() != null) {
			goalDTO.setLastUpdateDt(new Date());
			session.update(goalDTO);
		} else {
			Date currentDate = new Date();
			goalDTO.setAddDt(currentDate);
			goalDTO.setLastUpdateDt(currentDate);
			session.save(goalDTO);
		}
		return goalDTO;
	}

}
