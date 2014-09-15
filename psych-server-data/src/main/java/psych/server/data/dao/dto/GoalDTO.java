package psych.server.data.dao.dto;

// Generated Sep 14, 2014 9:06:33 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import psych.server.data.dao.GoalStatusType;

/**
 * GoalDTO generated by hbm2java
 */
public class GoalDTO implements java.io.Serializable {

	private String goalID;
	private String goalName;
	private String goalDescr;
	private String scoreType;
	private GoalStatusType goalStatus;
	private Integer defaultOrder;
	private Date addDt;
	private Date lastUpdateDt;
	private GoalIconDTO goalIconDTO;
	private UserDTO userDTO;

	public GoalDTO() {
	}

	public GoalDTO(String goalName, String scoreType, Integer defaultOrder,
			UserDTO userDTO) {
		this.goalName = goalName;
		this.scoreType = scoreType;
		this.defaultOrder = defaultOrder;
		this.userDTO = userDTO;
	}

	public GoalDTO(String goalName, String goalDescr, String scoreType,
			GoalStatusType goalStatus, Integer defaultOrder, Date addDt,
			Date lastUpdateDt, GoalIconDTO goalIconDTO, UserDTO userDTO) {
		this.goalName = goalName;
		this.goalDescr = goalDescr;
		this.scoreType = scoreType;
		this.goalStatus = goalStatus;
		this.defaultOrder = defaultOrder;
		this.addDt = addDt;
		this.lastUpdateDt = lastUpdateDt;
		this.goalIconDTO = goalIconDTO;
		this.userDTO = userDTO;
	}

	public String getGoalID() {
		return this.goalID;
	}

	public void setGoalID(String goalID) {
		this.goalID = goalID;
	}

	public String getGoalName() {
		return this.goalName;
	}

	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}

	public String getGoalDescr() {
		return this.goalDescr;
	}

	public void setGoalDescr(String goalDescr) {
		this.goalDescr = goalDescr;
	}

	public String getScoreType() {
		return this.scoreType;
	}

	public void setScoreType(String scoreType) {
		this.scoreType = scoreType;
	}

	public GoalStatusType getGoalStatus() {
		return this.goalStatus;
	}

	public void setGoalStatus(GoalStatusType goalStatus) {
		this.goalStatus = goalStatus;
	}

	public Integer getDefaultOrder() {
		return this.defaultOrder;
	}

	public void setDefaultOrder(Integer defaultOrder) {
		this.defaultOrder = defaultOrder;
	}

	public Date getAddDt() {
		return this.addDt;
	}

	public void setAddDt(Date addDt) {
		this.addDt = addDt;
	}

	public Date getLastUpdateDt() {
		return this.lastUpdateDt;
	}

	public void setLastUpdateDt(Date lastUpdateDt) {
		this.lastUpdateDt = lastUpdateDt;
	}

	public GoalIconDTO getGoalIconDTO() {
		return this.goalIconDTO;
	}

	public void setGoalIconDTO(GoalIconDTO goalIconDTO) {
		this.goalIconDTO = goalIconDTO;
	}

	public UserDTO getUserDTO() {
		return this.userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

}
