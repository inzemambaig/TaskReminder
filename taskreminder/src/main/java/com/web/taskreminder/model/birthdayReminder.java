package com.web.taskreminder.model;

public class birthdayReminder {
	
	
	private String date;
	private String emailId;
	private String daysBeforeReminder;
	private String msgSubject;
	private String msgBody;
	
	
	public String getMsgSubject() {
		return msgSubject;
	}
	public void setMsgSubject(String msgSubject) {
		this.msgSubject = msgSubject;
	}
	public String getMsgBody() {
		return msgBody;
	}
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDaysBeforeReminder() {
		return daysBeforeReminder;
	}
	public void setDaysBeforeReminder(String daysBeforeReminder) {
		this.daysBeforeReminder = daysBeforeReminder;
	}
	
	

}
