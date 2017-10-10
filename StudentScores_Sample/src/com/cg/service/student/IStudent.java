package com.cg.service.student;

import java.util.ArrayList;

import com.cg.bean.student.StudentBean;

public interface IStudent {

	ArrayList<Integer> getId();

	int addDetails(StudentBean bean);

	ArrayList<StudentBean> getDetails();

	int getTotal(int theo, int mcq, int lab);

	String getGrade(int total);



}
