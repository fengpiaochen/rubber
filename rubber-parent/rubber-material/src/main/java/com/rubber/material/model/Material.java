package com.rubber.material.model;

import java.util.Date;

import com.rubber.common.model.BaseModel;

public class Material extends BaseModel{
	
	private static final long serialVersionUID = 1L;

	private String id;
	//物料名称
	private String name;
	//物料规格
	private String specification;
	//单位
	private String unit;
	//生产厂家
	private String supplier;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
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
