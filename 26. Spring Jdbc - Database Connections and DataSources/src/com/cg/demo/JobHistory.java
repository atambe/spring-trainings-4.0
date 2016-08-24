package com.cg.demo;

import java.util.Date;

public class JobHistory {
	private Date startDate;
	private Date endDate;
	private String jobId;
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	@Override
	public String toString() {
		return "JobHistory [endDate=" + endDate + ", jobId=" + jobId
				+ ", startDate=" + startDate + "]";
	}
}
