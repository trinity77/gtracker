package psych.server.svc;

import java.util.List;

import psych.server.data.dao.dto.GoalDTO;
import psych.server.svc.model.UserAuth;

public interface GoalSvc {

	public GoalDTO getSingleUserGoal(UserAuth auth, String goalID) throws Exception;
	
	public List<GoalDTO> getUserGoals(UserAuth auth, String userID, List<String> goalStatusList) throws Exception;
	
}

