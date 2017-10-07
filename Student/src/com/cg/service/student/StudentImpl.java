package com.cg.service.student;

import java.util.ArrayList;

import com.cg.bean.student.StudentBean;
import com.cg.dao.student.IStudentDao;
import com.cg.dao.student.StudentDaoImpl;

public class StudentImpl implements IStudent {

	IStudentDao dao=new StudentDaoImpl();
	public int addDetails(StudentBean bean) {

		IStudentDao dao=new StudentDaoImpl();
		return dao.addDetails(bean);
	}
	@Override
	public ArrayList<StudentBean> getDetails() {
		
		return dao.getDetails();
	}

}
