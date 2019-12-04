package pojo;

import java.sql.Date;
import java.sql.Time;


public class payments {
	private int id;
	private int userid;
	private float amount;
	private String type;
	private Time tx_time;
	private Date datetime;
	public payments() {}
	public payments(int id, int userid, float amount, String type, Time tx_time, Date datetime) {
		super();
		this.id = id;
		this.userid = userid;
		this.amount = amount;
		this.type = type;
		this.setTx_time(tx_time);
		this.datetime = datetime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "payments [id=" + id + ", userid=" + userid + ", amount=" + amount + ", type=" + type + ", datetime="
				+ datetime + "]";
	}
	public Time getTx_time() {
		return tx_time;
	}
	public void setTx_time(Time tx_time) {
		this.tx_time = tx_time;
	}
	

}
