package com.cg.service.student;

import java.util.ArrayList;

import com.cg.bean.student.StudentBean;

public interface IStudent {

	int addDetails(StudentBean bean);

	ArrayList<StudentBean> getDetails();

}
