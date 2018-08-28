package cn.springcloud.book.common.exception;

public class BaseException extends RuntimeException {

	private static final long serialVersionUID = 1796731834836398434L;
	private Long businessId;
	private Integer code;
	private String codeEN;
	private String businessMessage;

	public Long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getCodeEN() {
		return codeEN;
	}

	public void setCodeEN(String codeEN) {
		this.codeEN = codeEN;
	}

	public String getBusinessMessage() {
		return businessMessage;
	}

	public void setBusinessMessage(String businessMessage) {
		this.businessMessage = businessMessage;
	}

	/**
	 * 基础异常
	 * 
	 * @param code 异常编码：数字
	 * @param codeEN 异常编码：英文短语
	 * @param message 异常信息
	 * @param businessId 相关业务ID
	 */
	public BaseException(Integer code, String codeEN, String message, Long businessId) {
		this(code, codeEN, message, businessId, null);
	}

	public BaseException(Integer code, String codeEN, String message, Long businessId, Throwable t) {
		super(message, t);
		this.businessId = businessId;
		this.code = code;
		this.codeEN = codeEN;
		this.businessMessage = message;
	}


}
