package com.rubber.material.model;

import java.util.Date;

import com.rubber.common.model.BaseModel;

public class Batch extends BaseModel{
	
	private static final long serialVersionUID = 1L;

	private String id;
	//物料ID
	private String material_id;
	//数量
	private Double amount;
	//检验情况
	private String check_state;
	//使用情况
	private String use_state;
	//验证人
	private String user_id;
	//送检日期
	private Date check_date;
	//备注
	private String remark;
	//创建人
	private String creator_id;
	//创建时间
	private Date create_time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMaterial_id() {
		return material_id;
	}

	public void setMaterial_id(String material_id) {
		this.material_id = material_id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCheck_state() {
		return check_state;
	}

	public void setCheck_state(String check_state) {
		this.check_state = check_state;
	}

	public String getUse_state() {
		return use_state;
	}

	public void setUse_state(String use_state) {
		this.use_state = use_state;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Date getCheck_date() {
		return check_date;
	}

	public void setCheck_date(Date check_date) {
		this.check_date = check_date;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreator_id() {
		return creator_id;
	}

	public void setCreator_id(String creator_id) {
		this.creator_id = creator_id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	
	
	

}
