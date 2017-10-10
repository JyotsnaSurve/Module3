package com.cg.account.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.jboss.logging.Logger;

import com.cg.account.bean.AccountBean;
import com.cg.account.dbutil.DBUtil;

public class AccountDaoImpl implements IAccountDao {
	
	Logger log=Logger.getLogger(AccountDaoImpl.class);
	Connection conn=null;
	ArrayList<Integer>list=new ArrayList<Integer>();
	@Override
	public ArrayList<Integer> getId() {
		try {
			conn=DBUtil.getConnection();
			String str="select cus_id from account_details";
			PreparedStatement ps=conn.prepareStatement(str);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt(1);
				list.add(id);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public int addDetails(AccountBean bean) {
		
		int row=0;
		conn=DBUtil.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement("insert into user_data values(?,?,?,tran_id.nextval)");
			ps.setInt(1, bean.getAcc_no());
			ps.setInt(2,bean.getAmount());
			ps.setInt(3,bean.getBalance());
			
			row=ps.executeUpdate();
			if(row==1)
			{
				log.info("Details are successfully inserted");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return row;
	}

	public int getTranId() {
		
		
		int id=0;
		try {
			conn=DBUtil.getConnection();
			String str="select tran_id.nextval from dual";
			Statement ps = conn.createStatement();
			ResultSet rs=ps.executeQuery(str);
			
			while(rs.next())
			{
				id=rs.getInt(1);
			
			} 
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

}
