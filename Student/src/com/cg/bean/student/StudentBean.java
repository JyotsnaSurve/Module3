package com.cg.bean.student;

public class StudentBean {
	private int studId;
	private String name;
	private int age;
	private String state;
	private String gender;
	private int noOfSubj;
	private int noOfAttmpt;
	private int totalScores;
	

	@Override
	public String toString() {
		return "StudentBean [studId=" + studId + ", name=" + name + ", age="
				+ age + ", state=" + state + ", gender=" + gender
				+ ", noOfSubj=" + noOfSubj + ", noOfAttmpt=" + noOfAttmpt
				+ ", totalScores=" + totalScores + "]";
	}


	public StudentBean(int studId, String name, int age, String state,
			String gender, int noOfSubj, int noOfAttmpt, int totalScores) {
		super();
		this.studId = studId;
		this.name = name;
		this.age = age;
		this.state = state;
		this.gender = gender;
		this.noOfSubj = noOfSubj;
		this.noOfAttmpt = noOfAttmpt;
		this.totalScores = totalScores;
	}






	public StudentBean() {
	}




	public int getStudId() {
		return studId;
	}




	public void setStudId(int studId) {
		this.studId = studId;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getState() {
		return state;
	}




	public void setState(String state) {
		this.state = state;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public int getNoOfSubj() {
		return noOfSubj;
	}




	public void setNoOfSubj(int noOfSubj) {
		this.noOfSubj = noOfSubj;
	}




	public int getNoOfAttmpt() {
		return noOfAttmpt;
	}




	public void setNoOfAttmpt(int noOfAttmpt) {
		this.noOfAttmpt = noOfAttmpt;
	}




	public int getTotalScores() {
		return totalScores;
	}




	public void setTotalScores(int totalScores) {
		this.totalScores = totalScores;
	}


	
}
