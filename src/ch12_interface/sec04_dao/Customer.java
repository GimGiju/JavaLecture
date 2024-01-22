package ch12_interface.sec04_dao;

//DTO(Data Transfer Object), VO,(Value Object) - DB를 액세스할 때 사용되는 데이터 구조
public class Customer {
	private int cid;
	private String cname;
	private String eamil;
	
	public Customer() {}
	
	public Customer(int cid, String cname, String eamil) {
		this.cid = cid;
		this.cname = cname;
		this.eamil = eamil;
	}
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", eamil=" + eamil + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	
}
