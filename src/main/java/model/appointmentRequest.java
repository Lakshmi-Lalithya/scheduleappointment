package model;

public class appointmentRequest {
	int requestNo;
	String bookingTime;
	int duration;
	String bookingStatus;
	String scheduler;
	int schedulerId;
	public int getRequestNo() {
		return requestNo;
	}
	public void setRequestNo(int requestNo) {
		this.requestNo = requestNo;
	}
	public String getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public int getSchedulerId() {
		return schedulerId;
	}
	public void setSchedulerId(int schedulerId) {
		this.schedulerId = schedulerId;
	}
	public String getScheduler() {
		return scheduler;
	}
	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
	}
	
	
	
}
