package com.split.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.split.entity.BOItemEntity;

public class BOItemBean {
	@JsonProperty("region")
	private String region;
	
	@JsonProperty("cluster")
	private String cluster;// cluster
	
	@JsonProperty("component")
	private String component;// component
	
	@JsonProperty("quantity")
	private Integer quantity;// quantity
	public BOItemBean() {
	}
	public BOItemBean(BOItemEntity entity) {
		this.region = entity.getRegion();
		this.cluster = entity.getCluster();
		this.component = entity.getComponent();
		this.quantity = entity.getQuantity();
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
		return "BOBean [region=" + region + ", cluster=" + cluster + ", component=" + component + "]";
	}
}
