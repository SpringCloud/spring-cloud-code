package cn.springcloud.book.common.exception;

import cn.springcloud.book.common.util.ExceptionUtil;

/**
 * 通用异常信息
 */
public enum CommonError {

	/**
	 * 1001, "用户信息为空"
	 */
	AUTH_EMPTY_ERROR(10001, "the user is null, please check");

	private Integer code;
	private String message;

	CommonError(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCodeEn() {
		return ExceptionUtil.errorToCodeEN(this);
	}

}
