package com.cg.dao.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.bean.student.StudentBean;
import com.cg.dbutil.student.DBUtil;

public class StudentDaoImpl implements IStudentDao {

	@Override
	public int addDetails(StudentBean bean) {
		Connection conn=null;
		int row=0;
		
		try {
			conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into Student_score1 values(studid_seq.nextval,?,?,?,?,?,?,?)");
			ps.setString(1, bean.getName());
			ps.setInt(2,bean.getAge());
			ps.setString(3, bean.getState());
			ps.setString(4, bean.getGender());
			ps.setInt(5, bean.getNoOfSubj());
			ps.setInt(6, bean.getNoOfAttmpt());
			ps.setInt(7, bean.getTotalScores());

			row=ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return row;
	}

	@Override
	public ArrayList<StudentBean> getDetails() {
		Connection con=DBUtil.getConnection();
		ArrayList<StudentBean> li=new ArrayList<StudentBean>();
		String sql="select * from Student_score1";
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int age=rs.getInt(3);
				String state=rs.getString(4);
				String gender=rs.getString(5);
				int noOfSubj=rs.getInt(6);
				int noOfAttempts=rs.getInt(7);
				int total=rs.getInt(8);

				li.add(new StudentBean(id,name,age,state,gender,noOfSubj,noOfAttempts,total));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return li;
	}

}
