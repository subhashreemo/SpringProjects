package com.split.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.split.entity.WeeklySplitUpdateEntity;;

public class WeeklySplitCreateBean {
	/*
	 *     "id": 10001,
    "cluster": "2Z3B",
    "component": "3B036",
    "region": "NI",
    "Week1_Percent": 25.0,
    "Week1_Quantity": 2500.0,
    "Week2_Percent": 25.0,
    "Week2_Quantity": 2500.0,
    "Week3_Percent": 25.0,
    "Week3_Quantity": 2500.0,
    "Week4_Percent": 25.0,
    "Week4_Quantity": 2500.0,
    "quantity": 7525

	 * */
	@JsonProperty("bo_id")
	private Integer BO_ID;
	
	@JsonProperty("region")
	private String REGION;	
	
	@JsonProperty("cluster")
	private String CLUSTER;//cluster	
	
	@JsonProperty("component")
	private String COMPONENT;
//	
	@JsonProperty( "week")
	private String WEEK;
	
	@JsonProperty("percent")
	private double PERCENT;
	
	@JsonProperty("quantity")
	private double Qunatity;
	
	@JsonProperty("Week1_Percent")
	private Double Week1_Percent;
	
	@JsonProperty("Week1_Quantity")
	private Double Week1_Quantity;

	@JsonProperty("Week2_Percent")
	private Double Week2_Percent;
	
	@JsonProperty("Week2_Quantity")
	private Double Week2_Quantity;
	
	@JsonProperty("Week3_Percent")
	private Double Week3_Percent;
	
	@JsonProperty("Week3_Quantity")
	private Double Week3_Quantity;
	
	@JsonProperty("Week4_Percent")
	private Double Week4_Percent;
	
	@JsonProperty("Week4_Quantity")
	private Double Week4_Quantity;
	
	
	// constructor for setting bean- WeeklySplitCreateBean	
	public WeeklySplitCreateBean(WeeklySplitUpdateEntity entity){
		this.BO_ID = entity.getBO_ID();
		this.COMPONENT = entity.getComponent();
		this.REGION = entity.getRegion();
		this.CLUSTER = entity.getCluster();
		this.COMPONENT = entity.getComponent();
		this.WEEK = entity.getWEEK();
		this.PERCENT = entity.getPERCENT();
		this.Qunatity = entity.getQunatity();
		
	/*	this.Week1_Percent = entity.getWeek1_Percent();
		this.Week1_Quantity = entity.getWeek1_Quantity();
		
		this.Week2_Percent = entity.getWeek2_Percent();
		this.Week2_Quantity = entity.getWeek2_Quantity();
		
		this.Week3_Percent = entity.getWeek3_Percent();
		this.Week3_Quantity = entity.getWeek3_Quantity();
		
		this.Week4_Percent = entity.getWeek4_Percent();
		this.Week4_Quantity = entity.getWeek4_Quantity();*/
	}
	
//	if(entity.)
	
/*	public Double getWeek1_Percent() {
		return Week1_Percent;
	}

	public void setWeek1_Percent(Double week1_Percent) {
		Week1_Percent = week1_Percent;
	}

	public Double getWeek1_Quantity() {
		return Week1_Quantity;
	}

	public void setWeek1_Quantity(Double week1_Quantity) {
		Week1_Quantity = week1_Quantity;
	}

	public Double getWeek2_Percent() {
		return Week2_Percent;
	}

	public void setWeek2_Percent(Double week2_Percent) {
		Week2_Percent = week2_Percent;
	}

	public Double getWeek2_Quantity() {
		return Week2_Quantity;
	}

	public void setWeek2_Quantity(Double week2_Quantity) {
		Week2_Quantity = week2_Quantity;
	}

	public Double getWeek3_Percent() {
		return Week3_Percent;
	}

	public void setWeek3_Percent(Double week3_Percent) {
		Week3_Percent = week3_Percent;
	}

	public Double getWeek3_Quantity() {
		return Week3_Quantity;
	}

	public void setWeek3_Quantity(Double week3_Quantity) {
		Week3_Quantity = week3_Quantity;
	}

	public Double getWeek4_Percent() {
		return Week4_Percent;
	}

	public void setWeek4_Percent(Double week4_Percent) {
		Week4_Percent = week4_Percent;
	}

	public Double getWeek4_Quantity() {
		return Week4_Quantity;
	}

	public void setWeek4_Quantity(Double week4_Quantity) {
		Week4_Quantity = week4_Quantity;
	}
*/
	public Integer getBO_ID() {
		return BO_ID;
	}
	public void setBO_ID(Integer bO_ID) {
		BO_ID = bO_ID;
	}
	public String getREGION() {
		return REGION;
	}
	public void setREGION(String region) {
		this.REGION = region;
	}
	public String getCLUSTER() {
		return CLUSTER;
	}
	public void setCLUSTER(String cluster) {
		this.CLUSTER = cluster;
	}
	public String getCOMPONENT() {
		return COMPONENT;
	}
	public void setCOMPONENT(String component) {
		this.COMPONENT = component;
	}
//	public String getWEEK() {
//		return WEEK;
//	}
//	public void setWEEK(String wEEK) {
//		WEEK = wEEK;
//	}
	public double getPERCENT() {
		return PERCENT;
	}
	public void setPERCENT(double pERCENT) {
		PERCENT = pERCENT;
	}
	public double getQunatity() {
		return Qunatity;
	}
	public void setQunatity(double qunatity) {
		Qunatity = qunatity;
	}

	public Double getWeek1_Percent() {
		return Week1_Percent;
	}

	public void setWeek1_Percent(Double week1_Percent) {
		Week1_Percent = week1_Percent;
	}

	public Double getWeek1_Quantity() {
		return Week1_Quantity;
	}

	public void setWeek1_Quantity(Double week1_Quantity) {
		Week1_Quantity = week1_Quantity;
	}

	public Double getWeek2_Percent() {
		return Week2_Percent;
	}

	public void setWeek2_Percent(Double week2_Percent) {
		Week2_Percent = week2_Percent;
	}

	public Double getWeek2_Quantity() {
		return Week2_Quantity;
	}

	public void setWeek2_Quantity(Double week2_Quantity) {
		Week2_Quantity = week2_Quantity;
	}

	public Double getWeek3_Percent() {
		return Week3_Percent;
	}

	public void setWeek3_Percent(Double week3_Percent) {
		Week3_Percent = week3_Percent;
	}

	public Double getWeek3_Quantity() {
		return Week3_Quantity;
	}

	public void setWeek3_Quantity(Double week3_Quantity) {
		Week3_Quantity = week3_Quantity;
	}

	public Double getWeek4_Percent() {
		return Week4_Percent;
	}

	public void setWeek4_Percent(Double week4_Percent) {
		Week4_Percent = week4_Percent;
	}

	public Double getWeek4_Quantity() {
		return Week4_Quantity;
	}

	public void setWeek4_Quantity(Double week4_Quantity) {
		Week4_Quantity = week4_Quantity;
	}

	@Override
	public String toString() {
		return "WeeklySplitCreateBean [BO_ID=" + BO_ID + ", REGION=" + REGION + ", CLUSTER=" + CLUSTER + ", COMPONENT="
				+ COMPONENT + ", PERCENT=" + PERCENT + ", Qunatity=" + Qunatity + ", Week1_Percent=" + Week1_Percent
				+ ", Week1_Quantity=" + Week1_Quantity + ", Week2_Percent=" + Week2_Percent + ", Week2_Quantity="
				+ Week2_Quantity + ", Week3_Percent=" + Week3_Percent + ", Week3_Quantity=" + Week3_Quantity
				+ ", Week4_Percent=" + Week4_Percent + ", Week4_Quantity=" + Week4_Quantity + "]";
	}



	
	

}
