package com.cg.dao.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.bean.customer.CustomerBean;
import com.cg.dbutil.customer.DBUtil;

public class CustomerDaoImpl implements ICustomerDao{

	@Override
	public int addDetails(CustomerBean bean) {
		Connection conn=null;
		int row=0;
		int value=0;
		try{
			conn=DBUtil.getConnection();
			
			System.out.println(bean);
			
			PreparedStatement ps=conn.prepareStatement("insert into newcustomer values(cid_seq.nextval,?,?,?,?)");
			ps.setString(1,bean.getCustomerName());
			ps.setString(2,bean.getPhoneNo());
			ps.setString(3,bean.getPassword());
			ps.setString(4,bean.getRepassword());

			row = ps.executeUpdate();
			
			PreparedStatement ps1=conn.prepareStatement("Select cid_seq.currval from dual");
			ResultSet rs =ps1.executeQuery();
			while(rs.next())
			{
				value=rs.getInt(1);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}

	public ArrayList<CustomerBean> getDetails() {
		Connection con=DBUtil.getConnection();
		ArrayList<CustomerBean> li=new ArrayList<CustomerBean>();
		
		try {
			
			String sql="select * from newcustomer";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				int Id=rs.getInt(1);
				String name=rs.getString(2);
				String mobile=rs.getString(3);
				li.add(new CustomerBean(Id,name,mobile));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return li;
	}

}
