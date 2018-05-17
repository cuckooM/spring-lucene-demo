package com.mengbin.user.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 * @author mengbin
 */
@Entity
@Table(name = "tbl_user")
public class User implements Serializable {
	
	/** 序列化id */
	private static final long serialVersionUID = -10473136701215099L;

	/** 主键 */
	@Id
	@GeneratedValue
    private Long id;
	
    /** 登录名 */
	@Column(name = "login_name")
    private String loginName;
	
	/** 用户名 */
	@Column(name = "user_name")
	private String userName;
	
	/** 性别。1：男；2：女 */
    private Integer sex;
    
    /** 状态。1：正常 */
    private Integer state;
    
    /** 创建时间 */
	@Column(name = "create_time")
	@Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

	/** 最近更新时间 */
	@Column(name = "update_time")
	@Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
