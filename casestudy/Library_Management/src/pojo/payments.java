package pojo;

import Utils.datetime;

public class payments {
	private int id;
	private int userid;
	private float amount;
	private String type;
	private datetime datetime;
	public payments(int id, int userid, float amount, String type, Utils.datetime datetime) {
		super();
		this.id = id;
		this.userid = userid;
		this.amount = amount;
		this.type = type;
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
	public datetime getDatetime() {
		return datetime;
	}
	public void setDatetime(datetime datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "payments [id=" + id + ", userid=" + userid + ", amount=" + amount + ", type=" + type + ", datetime="
				+ datetime + "]";
	}
	

}
