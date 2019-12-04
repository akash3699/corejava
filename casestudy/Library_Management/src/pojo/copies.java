package pojo;
public class copies
{
private int copiesid;
private int bookid;
private int rack;
private String status;
    public copies()
    {
	
    }
	public int getCopiesid() {
		return copiesid;
	}
	public void setCopiesid(int copiesid) {
		this.copiesid = copiesid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getRack() {
		return rack;
	}
	public void setRack(int rack) {
		this.rack = rack;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public copies(int copiesid, int bookid, int rack, String status) {
		super();
		this.copiesid = copiesid;
		this.bookid = bookid;
		this.rack = rack;
		this.status = status;
	}
	public String toString() 
	{
		return String.format("id : %-5d bookid : %-5d Rack : %-5d Stautus : %-50s", this.copiesid, this.bookid, this.rack,this.status);
	}
	
    
    
    
}