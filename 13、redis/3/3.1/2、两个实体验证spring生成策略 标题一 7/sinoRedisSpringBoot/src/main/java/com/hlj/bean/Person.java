package com.hlj.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 测试实体类，这个随便;
 */
@Entity
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private long id;
	private String name;
	private String pwd;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
}
