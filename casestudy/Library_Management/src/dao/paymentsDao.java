package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Utils.DBUtils;
import pojo.payments;

public class paymentsDao 
{
	private Connection connection;
	private CallableStatement stmtInsert ;
	private CallableStatement stmtSelect ;
	public paymentsDao()
	{
		try {
			this.connection = DBUtils.getConnection();
			this.stmtInsert = this.connection.prepareCall("{call sp_insert_payments(?,?,?,?,?,?)}");
			this.stmtSelect = this.connection.prepareCall("{call sp_select_payments()}");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insertpayment(payments payment) throws Exception
	{
		this.stmtInsert.setInt(1, payment.getId());
		this.stmtInsert.setInt(2, payment.getUserid());
		this.stmtInsert.setFloat(3, payment.getAmount());
		this.stmtInsert.setString(4, payment.getType());
		this.stmtInsert.setString(5, payment.getTx_time().toString());
		this.stmtInsert.setDate(6, payment.getDatetime());
		
		this.stmtInsert.execute();
		
		return this.stmtInsert.getUpdateCount();
	}
	
	public List<payments> getpayments() throws Exception
	{
		List<payments> paymentList = new ArrayList<>();
		if(this.stmtSelect.execute())
		{
			try(ResultSet rs = this.stmtSelect.getResultSet())
			{
				while(rs.next())
				{
					payments b1 = new payments();
					b1.setId(rs.getInt("id"));
					b1.setUserid(rs.getInt("userid"));
					b1.setAmount(rs.getFloat("amount"));
					b1.setType(rs.getString("type"));
					b1.setTx_time(rs.getTime("transaction_time"));
					b1.setDatetime(rs.getDate("nextpayment_duedate")); 
					paymentList.add(b1);
				}
			}
			
		}
		return paymentList;
	}
	
	
	
	
	

}