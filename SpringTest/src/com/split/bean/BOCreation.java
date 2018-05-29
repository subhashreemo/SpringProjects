package com.split.bean;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({"BO_ID","BO_FORM","BO_TO"})

public class BOCreation {
	private Integer BO_ID;
	private Date BO_FORM;//validFrom
	private Date BO_TO;//validTo
	private String region;
	private String cluster;//cluster
	private String component;//component
	private Integer quantity;//quantity
	
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
	
	 /////////////////Tesing DB connection
	 private String SCHEMA_NAME;
	 private String SCHEMA_OWNER;
	 private String HAS_PRIVILAGES;
	 
	 public String getSCHEMA_NAME() {
		return SCHEMA_NAME;
	}
	public void setSCHEMA_NAME(String sCHEMA_NAME) {
		SCHEMA_NAME = sCHEMA_NAME;
	}
	public String getSCHEMA_OWNER() {
		return SCHEMA_OWNER;
	}
	public void setSCHEMA_OWNER(String sCHEMA_OWNER) {
		SCHEMA_OWNER = sCHEMA_OWNER;
	}
	public String getHAS_PRIVILAGES() {
		return HAS_PRIVILAGES;
	}
	public void setHAS_PRIVILAGES(String hAS_PRIVILAGES) {
		HAS_PRIVILAGES = hAS_PRIVILAGES;
	}
		 
	 //////////////////// 

}
