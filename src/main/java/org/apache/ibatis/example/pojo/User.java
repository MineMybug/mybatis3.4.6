package org.apache.ibatis.example.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: ruanhang
 * @data: 2018年9月19日
 */
public class User implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	private Integer id;

    private String name;

    private String password;
    
    private Integer status;
    
    private Date ct;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCt() {
		return ct;
	}

	public void setCt(Date ct) {
		this.ct = ct;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", status=" + status + ", ct=" + ct
				+ "]";
	}
    
}
