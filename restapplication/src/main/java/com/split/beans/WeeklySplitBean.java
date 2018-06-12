package com.split.beans;

import com.split.entity.WeeklySplitEntity;

public class WeeklySplitBean {
	private Integer BO_ID;
	//private String WEEK;
	//private String WEEK_YEAR;
	private String REGION;
	private String CLUSTER;
	private String COMPONENT;
		
	private double W1_PERCENT;
	private double W1_QUANTITY;
	private double W2_PERCENT;
	private double W2_QUANTITY;
	private double W3_PERCENT;
	private double W3_QUANTITY;
	private double W4_PERCENT;
	private double W4_QUANTITY;
	
	// constructor for setting bean- WeeklySplitBean	
	public WeeklySplitBean(WeeklySplitEntity entity){
		this.BO_ID = entity.getBO_ID();
		//this.WEEK = entity.getWEEK();
		//this.WEEK_YEAR = entity.getWEEK_YEAR();
		this.CLUSTER= entity.getCLUSTER();
		this.COMPONENT = entity.getCOMPONENT();
		this.REGION = entity.getREGION();
		this.W1_PERCENT = entity.getW1_PERCENT();
		this.W1_QUANTITY = entity.getW1_QUANTITY();
		this.W2_PERCENT = entity.getW2_PERCENT();
		this.W2_QUANTITY = entity.getW2_QUANTITY();
		this.W3_PERCENT = entity.getW3_PERCENT();
		this.W3_QUANTITY = entity.getW3_QUANTITY();
		System.out.println("W3 Quantity " +entity.getW3_QUANTITY());
		
		if(entity.getW4_QUANTITY()!=null)
			{
			this.W4_QUANTITY = entity.getW4_QUANTITY();
			System.out.println("IF W4 Quantity " +entity.getW4_QUANTITY());
			}
		else
		{
			this.W4_QUANTITY=0.0;
			System.out.println("ELSE*********W4 Quantity " +entity.getW4_QUANTITY());
		}
		//this.W4_PERCENT = entity.getW4_PERCENT();
		if(entity.getW4_PERCENT()!=null)
		{
			this.W4_PERCENT = entity.getW4_PERCENT();
			System.out.println("IF W4 % is " +entity.getW4_PERCENT());
			}
		else
		{
			this.W4_PERCENT=0.0;
			System.out.println("ELSE*********W4 % is  " +entity.getW4_PERCENT());
		}
	}
	
	public Integer getBO_ID() {
		return BO_ID;
	}
	public void setBO_ID(Integer bO_ID) {
		BO_ID = bO_ID;
	}
	
	public String getCLUSTER() {
		return CLUSTER;
	}
	public void setCLUSTER(String cLUSTER) {
		CLUSTER = cLUSTER;
	}
	public String getCOMPONENT() {
		return COMPONENT;
	}
	public void setCOMPONENT(String cOMPONENT) {
		COMPONENT = cOMPONENT;
	}
	public String getREGION() {
		return REGION;
	}
	public void setREGION(String rEGION) {
		REGION = rEGION;
	}
	public double getW1_PERCENT() {
		return W1_PERCENT;
	}
	public void setW1_PERCENT(double w1_PERCENT) {
		W1_PERCENT = w1_PERCENT;
	}
	
	public double getW2_PERCENT() {
		return W2_PERCENT;
	}
	public void setW2_PERCENT(double w2_PERCENT) {
		W2_PERCENT = w2_PERCENT;
	}
	
	public double getW3_PERCENT() {
		return W3_PERCENT;
	}
	public void setW3_PERCENT(double w3_PERCENT) {
		W3_PERCENT = w3_PERCENT;
	}
	
	public double getW4_PERCENT() {
		return W4_PERCENT;
	}
	public void setW4_PERCENT(double w4_PERCENT) {
		W4_PERCENT = w4_PERCENT;
	}

	public double getW1_QUANTITY() {
		return W1_QUANTITY;
	}

	public void setW1_QUANTITY(double w1_QUANTITY) {
		W1_QUANTITY = w1_QUANTITY;
	}

	public double getW2_QUANTITY() {
		return W2_QUANTITY;
	}

	public void setW2_QUANTITY(double w2_QUANTITY) {
		W2_QUANTITY = w2_QUANTITY;
	}

	public double getW3_QUANTITY() {
		return W3_QUANTITY;
	}

	public void setW3_QUANTITY(double w3_QUANTITY) {
		W3_QUANTITY = w3_QUANTITY;
	}

	public double getW4_QUANTITY() {
		return W4_QUANTITY;
	}

	public void setW4_QUANTITY(double w4_QUANTITY) {
		W4_QUANTITY = w4_QUANTITY;
	}
	

	
	
}