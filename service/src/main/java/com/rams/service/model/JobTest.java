package com.rams.service.model;

public class JobTest {
  private Long id;
  private String startdate;
  private String enddate;
  private String cusid;
  private String name;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getStartdate() {
	return startdate;
}
public void setStartdate(String startdate) {
	this.startdate = startdate;
}
public String getEnddate() {
	return enddate;
}
public void setEnddate(String enddate) {
	this.enddate = enddate;
}
public String getCusid() {
	return cusid;
}
public void setCusid(String cusid) {
	this.cusid = cusid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public JobTest(Long id, String startdate, String enddate, String cusid, String name) {
	super();
	this.id = id;
	this.startdate = startdate;
	this.enddate = enddate;
	this.cusid = cusid;
	this.name = name;
}
public JobTest() {
	super();
}
  
}
