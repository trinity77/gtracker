package psych.server.data.dao.dto;

// Generated Sep 14, 2014 9:06:33 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import psych.server.data.dao.UserStatusType;

/**
 * UserDTO generated by hbm2java
 */
public class UserDTO implements java.io.Serializable {

	private String userID;
	private String userName;
	private String nickName;
	private String firstName;
	private String lastName;
	private String emailAddr;
	private UserStatusType status;
	private String userPasswd;
	private Date addDt;
	private Date lastUpdateDt;
	private Date passwdRestDt;
	private boolean credentialsNonExpired;
	private boolean accountNonLocked;
	private Date lastLoginDt;
	private String passwdRestCode;
	private boolean deleteFlag;
	private Integer lockoutCnt;
	private SystemProfileDTO systemProfileDTO;
	private UserDTO doctorDTO;

	public UserDTO() {
	}

	public UserDTO(String userName, String emailAddr, UserStatusType status,
			String userPasswd, boolean credentialsNonExpired,
			boolean accountNonLocked, boolean deleteFlag,
			SystemProfileDTO systemProfileDTO) {
		this.userName = userName;
		this.emailAddr = emailAddr;
		this.status = status;
		this.userPasswd = userPasswd;
		this.credentialsNonExpired = credentialsNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.deleteFlag = deleteFlag;
		this.systemProfileDTO = systemProfileDTO;
	}

	public UserDTO(String userName, String nickName, String firstName,
			String lastName, String emailAddr, UserStatusType status,
			String userPasswd, Date addDt, Date lastUpdateDt,
			Date passwdRestDt, boolean credentialsNonExpired,
			boolean accountNonLocked, Date lastLoginDt, String passwdRestCode,
			boolean deleteFlag, Integer lockoutCnt,
			SystemProfileDTO systemProfileDTO, UserDTO doctorDTO) {
		this.userName = userName;
		this.nickName = nickName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddr = emailAddr;
		this.status = status;
		this.userPasswd = userPasswd;
		this.addDt = addDt;
		this.lastUpdateDt = lastUpdateDt;
		this.passwdRestDt = passwdRestDt;
		this.credentialsNonExpired = credentialsNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.lastLoginDt = lastLoginDt;
		this.passwdRestCode = passwdRestCode;
		this.deleteFlag = deleteFlag;
		this.lockoutCnt = lockoutCnt;
		this.systemProfileDTO = systemProfileDTO;
		this.doctorDTO = doctorDTO;
	}

	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddr() {
		return this.emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public UserStatusType getStatus() {
		return this.status;
	}

	public void setStatus(UserStatusType status) {
		this.status = status;
	}

	public String getUserPasswd() {
		return this.userPasswd;
	}

	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
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

	public Date getPasswdRestDt() {
		return this.passwdRestDt;
	}

	public void setPasswdRestDt(Date passwdRestDt) {
		this.passwdRestDt = passwdRestDt;
	}

	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public Date getLastLoginDt() {
		return this.lastLoginDt;
	}

	public void setLastLoginDt(Date lastLoginDt) {
		this.lastLoginDt = lastLoginDt;
	}

	public String getPasswdRestCode() {
		return this.passwdRestCode;
	}

	public void setPasswdRestCode(String passwdRestCode) {
		this.passwdRestCode = passwdRestCode;
	}

	public boolean isDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Integer getLockoutCnt() {
		return this.lockoutCnt;
	}

	public void setLockoutCnt(Integer lockoutCnt) {
		this.lockoutCnt = lockoutCnt;
	}

	public SystemProfileDTO getSystemProfileDTO() {
		return this.systemProfileDTO;
	}

	public void setSystemProfileDTO(SystemProfileDTO systemProfileDTO) {
		this.systemProfileDTO = systemProfileDTO;
	}

	public UserDTO getDoctorDTO() {
		return this.doctorDTO;
	}

	public void setDoctorDTO(UserDTO doctorDTO) {
		this.doctorDTO = doctorDTO;
	}

}
