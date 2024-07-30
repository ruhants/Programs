package Fruits;

class AttendanceEntry {
	private int empId;
	private String date;
	private String inTime;
	private String outTime;

	public AttendanceEntry(int empId, String date, String inTime, String outTime) {
		this.empId = empId;
		this.date = date;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "AttendanceEntry empId=" + empId + ", date=" + date + ", inTime=" + inTime + ", outTime=" + outTime;
	}

}