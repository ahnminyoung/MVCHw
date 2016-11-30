package kr.ac.hansung.dao;

public class Course {
	private int year;
	private int semester;
	private String code;
	private String subject;
	private String division;
	private int marks;


	public Course() {

	}

	public Course(int year, int semester, String code, String subject, String division, int marks) {
		this.year=year;
		this.semester=semester;
		this.code=code;
		this.subject=subject;
		this.division=division;
		this.marks=marks;

	}
	
	public String toString() {
		return "Offer [year=" + year + ", semester=" + semester + ", code=" + code + ", subject=" + subject + ", division=" + division+", marks=" + marks+"]";
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getSemester() {
		return semester;
	}


	public void setSemester(int semester) {
		this.semester = semester;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getDivision() {
		return division;
	}


	public void setDivision(String division) {
		this.division = division;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}

}
