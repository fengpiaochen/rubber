/**
 * Eya.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.rubber.material.model;
import java.util.Date;

import com.rubber.common.model.BaseModel;

/**
 * 物料表
 * @author  自动生成
 * @version $Id: Material.java, v 0.1 2018-2-22 12:55:15   自动生成 Exp $
 */
public class Material extends BaseModel implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	/***/
	private String            id;
	
	/**物料名称*/
	private String            name;
	
	/**规格*/
	private String            specification;
	
	/**单位*/
	private String            unit;
	
	/**供应商ID*/
	private String            supplierId;
	
	/**创建人ID*/
	private String            creatorId;
	
	/**创建时间*/
	private Date            createTime;
	
	/**修改时间*/
	private Date            modifyTime;
	
	
	
	 /**
     * Setter method for property <tt>id</tt>.
     * 
     * @param id value to be assigned to property id
     */
	public void setId(String id) {
		this.id = id;
	}
	
	 /**
     * Getter method for property <tt>id</tt>.
     * 
     * @return id value of id
     */
	public String getId() {
		return this.id;
	}
	
	 /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
	public void setName(String name) {
		this.name = name;
	}
	
	 /**
     * Getter method for property <tt>name</tt>.
     * 
     * @return name value of name
     */
	public String getName() {
		return this.name;
	}
	
	 /**
     * Setter method for property <tt>specification</tt>.
     * 
     * @param specification value to be assigned to property specification
     */
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	
	 /**
     * Getter method for property <tt>specification</tt>.
     * 
     * @return specification value of specification
     */
	public String getSpecification() {
		return this.specification;
	}
	
	 /**
     * Setter method for property <tt>unit</tt>.
     * 
     * @param unit value to be assigned to property unit
     */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	 /**
     * Getter method for property <tt>unit</tt>.
     * 
     * @return unit value of unit
     */
	public String getUnit() {
		return this.unit;
	}
	
	 /**
     * Setter method for property <tt>supplierId</tt>.
     * 
     * @param supplierId value to be assigned to property supplierId
     */
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	
	 /**
     * Getter method for property <tt>supplierId</tt>.
     * 
     * @return supplierId value of supplierId
     */
	public String getSupplierId() {
		return this.supplierId;
	}
	
	 /**
     * Setter method for property <tt>creatorId</tt>.
     * 
     * @param creatorId value to be assigned to property creatorId
     */
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	
	 /**
     * Getter method for property <tt>creatorId</tt>.
     * 
     * @return creatorId value of creatorId
     */
	public String getCreatorId() {
		return this.creatorId;
	}
	
	 /**
     * Setter method for property <tt>createTime</tt>.
     * 
     * @param createTime value to be assigned to property createTime
     */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	 /**
     * Getter method for property <tt>createTime</tt>.
     * 
     * @return createTime value of createTime
     */
	public Date getCreateTime() {
		return this.createTime;
	}
	
	 /**
     * Setter method for property <tt>modifyTime</tt>.
     * 
     * @param modifyTime value to be assigned to property modifyTime
     */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	
	 /**
     * Getter method for property <tt>modifyTime</tt>.
     * 
     * @return modifyTime value of modifyTime
     */
	public Date getModifyTime() {
		return this.modifyTime;
	}
}