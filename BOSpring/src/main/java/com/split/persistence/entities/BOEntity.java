package com.split.persistence.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.ReadOnly;



@Entity
@ReadOnly
@Table(schema = "\"RB_SCH_TGBL\"", name = "\"tgbl.data.application::TGBL_DDL_APPLICATION.T_TG_BO_HEADER\"")
@NamedQuery(name = BOEntity.FIND_ALL, query = "select s from BOEntity s")
public class BOEntity{
	public static final String FIND_ALL = "BOEntity.findAll";
	@Id
	@Column(name = "BO_ID")
    private Integer BO_ID;
	@Column(name = "BO_FORM")
	private Date BO_FORM;//validFrom
	@Column(name = "BO_TO")
	private Date BO_TO;//validTo
	@Column(name = "region")
	private String region;
	@Column(name = "cluster")
	private String cluster;//cluster
	@Column(name = "component")
	private String component;//component
	@Column(name = "quantity")
	private Integer quantity;//quantity
	public Integer getBO_ID() {
		return BO_ID;
	}
	public void setBO_ID(Integer bO_ID) {
		BO_ID = bO_ID;
	}
	public Date getBO_FORM() {
		return BO_FORM;
	}
	public void setBO_FORM(Date bO_FORM) {
		BO_FORM = bO_FORM;
	}
	public Date getBO_TO() {
		return BO_TO;
	}
	public String getRegion() {
		return region;
	}
	public String getCluster() {
		return cluster;
	}
	public String getComponent() {
		return component;
	}
	public Integer getQuantity() {
		return quantity;
	}
}


/*public class BOEntity implements Serializable {
	private static final long serialVersionUID = 4382376373655477269L;
	@Id
    @GeneratedValue
    private Integer BO_ID;
	private Date BO_FORM;//validFrom
	private Date BO_TO;//validTo
	private String region;
	private String cluster;//cluster
	private String component;//component
	private Integer quantity;//quantity
	
	protected BOEntity()
	{
		
	}
	
	 public BOEntity(Integer BO_ID, String region,String cluster,String component,Integer quantity) {
	        this.BO_ID = BO_ID;
	        this.region = region;
	        this.cluster = cluster;
	        this.component = component;
	        this.quantity = quantity;
	    }
	public Integer getBO_ID() {
		return BO_ID;
	}
	public void setBO_ID(Integer bO_ID) {
		BO_ID = bO_ID;
	}
	public Date getBO_FORM() {
		return BO_FORM;
	}
	public void setBO_FORM(Date bO_FORM) {
		BO_FORM = bO_FORM;
	}
	public Date getBO_TO() {
		return BO_TO;
	}
	public void setBO_TO(Date bO_TO) {
		BO_TO = bO_TO;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCluster() {
		return cluster;
	}
	public void setCluster(String cluster) {
		this.cluster = cluster;
	}
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}*/
