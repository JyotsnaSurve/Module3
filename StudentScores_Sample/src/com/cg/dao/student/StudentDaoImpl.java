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

	Connection conn=null;
	@Override
	public ArrayList<Integer> getId() {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		try {
		conn=DBUtil.getConnection();
		String str="select stuid from students";
		PreparedStatement ps=conn.prepareStatement(str);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			int ids=rs.getInt(1);
			list.add(ids);
		}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	@Override
	public int addDetails(StudentBean bean) {
		conn=DBUtil.getConnection();
		int row=0;
		try {
			PreparedStatement ps=conn.prepareStatement("insert into student_scores values(?,?,?,?,?,?,?)");
			ps.setInt(1, bean.getId());
			ps.setString(2,bean.getSubject());
			ps.setInt(3, bean.getTheo());
			ps.setInt(4, bean.getMcq());
			ps.setInt(5, bean.getLab());
			ps.setInt(6, bean.getTotal());
			ps.setString(7, bean.getGrade());
			
			row=ps.executeUpdate();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
	@Override
	public ArrayList<StudentBean> getDetails() {
		Connection con=DBUtil.getConnection();
		ArrayList<StudentBean> list=new ArrayList<StudentBean>();

		try {
			String sql="select * from student_scores";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String subjName=rs.getString(2);
				int total=rs.getInt(3);
				String grade=rs.getString(4);
				list.add(new StudentBean(id,subjName,total,grade));
			
			}
			for(StudentBean s:list){
				System.out.println(s.getSubject());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
