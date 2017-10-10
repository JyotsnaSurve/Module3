package com.cg.dao.student;

import java.util.ArrayList;

import com.cg.bean.student.StudentBean;

public interface IStudentDao {

	ArrayList<Integer> getId();

	int addDetails(StudentBean bean);

	ArrayList<StudentBean> getDetails();

}
