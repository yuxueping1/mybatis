package com.yxp.bean;

public class Tuser1 {
	private int tid;
	private String tname;
	private String password;
	
	public Tuser1() {
		// TODO Auto-generated constructor stub
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Tuser1 [tid=" + tid + ", tname=" + tname + ", password=" + password + "]";
	}

}
