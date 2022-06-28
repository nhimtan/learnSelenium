package danhBa;

import java.io.Serializable;

public class DanhBa implements Serializable{
	private String ten;
	private String soDT;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public DanhBa(String ten, String soDT) {
		super();
		this.ten = ten;
		this.soDT = soDT;
	}
	@Override
	public String toString() {
		return "DanhBa [ten=" + ten + ", soDT=" + soDT + "]";
	}
	
	
	

}
