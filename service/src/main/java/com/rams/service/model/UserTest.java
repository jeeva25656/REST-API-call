package com.rams.service.model;

public class UserTest {
  private Long id;
  public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
private String name;
  private String email;
public UserTest(Long id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
}
