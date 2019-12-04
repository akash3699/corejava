package pojo;
import java.sql.Date;

public class issueRecord 
{
	private int Record_Id;
	private int copy_Id;
	private int member_Id;
	private Date dt;
	
	public issueRecord()
	{ 
		
	}
	
	public issueRecord(int record_Id, int copy_Id, int member_Id, Date dt) 
	{
		super();
		Record_Id = record_Id;
		this.copy_Id = copy_Id;
		this.member_Id = member_Id;
		this.dt = dt;
	}
	public int getRecord_Id() {
		return Record_Id;
	}
	public void setRecord_Id(int record_Id) {
		Record_Id = record_Id;
	}
	public int getCopy_Id() {
		return copy_Id;
	}
	public void setCopy_Id(int copy_Id) {
		this.copy_Id = copy_Id;
	}
	public int getMember_Id() {
		return member_Id;
	}
	public void setMember_Id(int member_Id) {
		this.member_Id = member_Id;
	}
	public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) 
	{
		this.dt = dt;
	}
	@Override
	public String toString() {
		return "issueRecord [Record_Id=" + Record_Id + ", copy_Id=" + copy_Id + ", member_Id=" + member_Id + ", dt="
				+ dt + "]";
	}
	
	
	
	
	
	
	
}

