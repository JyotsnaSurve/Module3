package com.cg.service.student;

import java.util.ArrayList;

import com.cg.bean.student.StudentBean;
import com.cg.dao.student.IStudentDao;
import com.cg.dao.student.StudentDaoImpl;

public class StudentImpl implements IStudent {

	IStudentDao dao=new StudentDaoImpl();
	@Override
	public ArrayList<Integer> getId() {
		return dao.getId();

	}
	@Override
	public int addDetails(StudentBean bean) {
			
		return dao.addDetails(bean);
		
	}
	@Override
	public ArrayList<StudentBean> getDetails() {
		return dao.getDetails();
	}
	@Override
	public int getTotal(int theo, int mcq, int lab) {
		int total=(theo+mcq+lab);
		return total;
	}
	@Override
	public String getGrade(int total) {
		
		String grade=null;

		if(total>90 && total<=100)
			grade="S";
		else if(total>80 && total<=90)
			grade="A";
		else if(total>70 && total<=80)
			grade="B";
		else if(total>60 && total<=70)
			grade="C";
		else if(total>50 && total<=60)
			grade="D";
		else
			grade="U";
		
		return grade;
	}

}
