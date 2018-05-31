package com.split.rest.resources;

import java.util.Date;

import com.split.persistence.entities.BOEntity;

public class BOResource {
	 private Integer BO_ID;

		private Date BO_FORM;//validFrom
		private Date BO_TO;//validTo
		private String region;
		private String cluster;//cluster
		private String component;//component
		private Integer quantity;//quantity
		public BOResource() {
	    }
	    
	    public BOResource(BOEntity entity) {
	        this.BO_ID = entity.getBO_ID();
	        this.BO_FORM = entity.getBO_FORM();
	        this.BO_TO = entity.getBO_TO();
	        this.region=entity.getRegion();
	        this.cluster=entity.getCluster();
	        this.component=entity.getComponent();
	        this.quantity=entity.getQuantity();
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


    @Override
	    public String toString() {
	        return "BOResource [region=" + region + ", cluster=" + cluster + ", component=" + component + "]";
	    }
}
