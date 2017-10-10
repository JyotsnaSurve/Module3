package com.cg.bean.student;

public class StudentBean {

	private int id;
	private String subject;
	private int theo;
	private int mcq;
	private int lab;
	private int total;
	private String grade;
	
	public StudentBean(){
		
	}
	
	public StudentBean(int id, String subject, int theo, int mcq, int lab,
			int total, String grade) {
		super();
		this.id = id;
		this.subject = subject;
		this.theo = theo;
		this.mcq = mcq;
		this.lab = lab;
		this.total = total;
		this.grade = grade;
	}
	

	public StudentBean(int id, String subject, int total, String grade) {
		super();
		this.id = id;
		this.subject = subject;
		this.total = total;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getTheo() {
		return theo;
	}
	public void setTheo(int theo) {
		this.theo = theo;
	}
	public int getMcq() {
		return mcq;
	}
	public void setMcq(int mcq) {
		this.mcq = mcq;
	}
	public int getLab() {
		return lab;
	}
	public void setLab(int lab) {
		this.lab = lab;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	
	
}

