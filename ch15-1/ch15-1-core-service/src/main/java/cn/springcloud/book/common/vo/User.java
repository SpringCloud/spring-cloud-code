package cn.springcloud.book.common.vo;


import java.io.Serializable;
import java.util.List;


/**
 */
public class User implements Serializable {

	private static final long serialVersionUID = -4083327605430665846L;

	public final static String CONTEXT_KEY_USERID = "x-user-id";

	private String userId;
	
	private String userName;
	
	private List<String> allowPermissionService;


	public List<String> getAllowPermissionService() {
		return allowPermissionService;
	}

	public void setAllowPermissionService(List<String> allowPermissionService) {
		this.allowPermissionService = allowPermissionService;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public User() {
	}

}
