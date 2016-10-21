package com.frankman.base.menu;

/**
 * 
 */
/**
 * 任务状态
 * 
 * @author gengmaozhang01
 * @since 2013-6-2 上午3:02:05
 * 
 */
public enum JobStatus {

	UNKNOWN(0, "未知"),
	//
	WAITING(11, "待运行"), WAITING_FOR_RETRYING(21, "待重试"),
	//
	RUNNING(3, "运行中"), SUCCEEDED(4, "已完成"), FAILED(5, "已失败"), CANCELLED(6, "已取消"), AUTOCLEANED(7,"已被自动清理"),
	// pretreat
	PRETREAT_RUNNING(71, "预计算中"), PRETREAT_SUCCEEDED(72, "预计算完成"), PRETREAT_FAILED(73, "预计算失败"),
	//
	PRETREAT_WAITING_FOR_RETRYING(74, "待重新预计算");

	private int code;
	private String title;

	private JobStatus(int code, String title) {
		this.code = code;
		this.title = title;
	}

	public int getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	/**
	 * 解析任务状态，默认等待中
	 * 
	 * @author gengmaozhang01
	 * @since 2013-6-4 下午1:05:45
	 */
	public static JobStatus parseStatus(String code) {
		if (code == null || code.isEmpty()) {
			return WAITING;
		}
		for (JobStatus status : JobStatus.values()) {
			if (code.equals(String.valueOf(status.getCode()))) {
				return status;
			}
		}
		return WAITING;
	}

}
