/**
 * Eya.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.rubber.material.model;
import java.util.Date;

import com.rubber.common.model.BaseModel;

/**
 * 检测表
 * @author  自动生成
 * @version $Id: Detection.java, v 0.1 2018-2-22 12:55:15   自动生成 Exp $
 */
public class Detection extends BaseModel implements java.io.Serializable{

	private static final long serialVersionUID = 1L;

	/***/
	private String            id;
	
	/**物料ID*/
	private String            materialId;
	
	/**数量*/
	private Double            amount;
	
	/**检验状态:0.符合要求*/
	private Integer            detectState;
	
	/**使用情况:0.正常*/
	private Integer            useState;
	
	/**送检日期*/
	private Date            detectDate;
	
	/**备注*/
	private String            remark;
	
	/**创建人*/
	private String            creatorId;
	
	/**创建时间*/
	private Date            createTime;
	
	
	
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
     * Setter method for property <tt>materialId</tt>.
     * 
     * @param materialId value to be assigned to property materialId
     */
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}
	
	 /**
     * Getter method for property <tt>materialId</tt>.
     * 
     * @return materialId value of materialId
     */
	public String getMaterialId() {
		return this.materialId;
	}
	
	 /**
     * Setter method for property <tt>amount</tt>.
     * 
     * @param amount value to be assigned to property amount
     */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	 /**
     * Getter method for property <tt>amount</tt>.
     * 
     * @return amount value of amount
     */
	public Double getAmount() {
		return this.amount;
	}
	
	 /**
     * Setter method for property <tt>detectState</tt>.
     * 
     * @param detectState value to be assigned to property detectState
     */
	public void setDetectState(Integer detectState) {
		this.detectState = detectState;
	}
	
	 /**
     * Getter method for property <tt>detectState</tt>.
     * 
     * @return detectState value of detectState
     */
	public Integer getDetectState() {
		return this.detectState;
	}
	
	 /**
     * Setter method for property <tt>useState</tt>.
     * 
     * @param useState value to be assigned to property useState
     */
	public void setUseState(Integer useState) {
		this.useState = useState;
	}
	
	 /**
     * Getter method for property <tt>useState</tt>.
     * 
     * @return useState value of useState
     */
	public Integer getUseState() {
		return this.useState;
	}
	
	 /**
     * Setter method for property <tt>detectdate</tt>.
     * 
     * @param detectdate value to be assigned to property detectdate
     */
	public void setDetectDate(Date detectDate) {
		this.detectDate = detectDate;
	}
	
	 /**
     * Getter method for property <tt>detectdate</tt>.
     * 
     * @return detectdate value of detectdate
     */
	public Date getDetectDate() {
		return this.detectDate;
	}
	
	 /**
     * Setter method for property <tt>remark</tt>.
     * 
     * @param remark value to be assigned to property remark
     */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	 /**
     * Getter method for property <tt>remark</tt>.
     * 
     * @return remark value of remark
     */
	public String getRemark() {
		return this.remark;
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
}