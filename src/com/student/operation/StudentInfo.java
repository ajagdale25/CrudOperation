package com.student.operation;



public class StudentInfo {
	
/**
 * 
 * @author amol
 */
	private int studId; //getStudId()
	private String studName;
	private int marks;
	private Address studAddress;
	
	public StudentInfo(int studId, String studName, int marks, Address studAddress)
	{
		super();
		this.studId = studId;
		this.studName = studName;
		this.marks = marks;
		this.studAddress = studAddress;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Address getStudAddress() {
		return studAddress;
	}

	public void setStudAddress(Address studAddress) {
		this.studAddress = studAddress;
	}

	@Override
	public String toString() {
		return "\nStudentInfo [studId=" + studId + ", studName=" + studName + ", marks=" + marks + ", studAddress="
				+ studAddress + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Address
{
	private String city;
	private int pinCode;
	
	public Address(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	
}