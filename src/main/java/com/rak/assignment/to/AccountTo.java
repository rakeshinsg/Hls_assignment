package com.rak.assignment.to;

import java.time.LocalDateTime;

public class AccountTo {
	private String reruestId;
	private String submittedBy;
	private LocalDateTime submittedDate;
	private String approvedBy;
	private LocalDateTime approvalDate;
	private String status;
	private String accountNumber;
	
	public AccountTo(){}
	
	public AccountTo(String reruestId, String submittedBy, LocalDateTime submittedDate, String approvedBy,
			LocalDateTime approvalDate, String status, String accountNumber) {
		super();
		this.reruestId = reruestId;
		this.submittedBy = submittedBy;
		this.submittedDate = submittedDate;
		this.approvedBy = approvedBy;
		this.approvalDate = approvalDate;
		this.status = status;
		this.accountNumber = accountNumber;
	}
	public String getReruestId() {
		return reruestId;
	}
	public void setReruestId(String reruestId) {
		this.reruestId = reruestId;
	}
	public String getSubmittedBy() {
		return submittedBy;
	}
	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}
	public LocalDateTime getSubmittedDate() {
		return submittedDate;
	}
	public void setSubmittedDate(LocalDateTime submittedDate) {
		this.submittedDate = submittedDate;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public LocalDateTime getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(LocalDateTime approvalDate) {
		this.approvalDate = approvalDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}