package com.split.beans;

import com.split.entity.BuyingCenterEntity;

public class BuyingOrderSplitBean {
	

	private Integer BO_ID;
	private String CLUSTER;
	private String COMPONENT;
	private String REGION;
	private double W1_PERCENT;
	private double W1_QUANTITY;
	private double W2_PERCENT;
	private double W2_QUANTITY;
	private double W3_PERCENT;
	private double W3_QUANTITY;
	private double W4_PERCENT;
	private double W4_QUANTITY;
	
	public BuyingOrderSplitBean(){
		
	}
	
	// constructor for setting bean BuyingOrderSplitBean
	public BuyingOrderSplitBean(BuyingCenterEntity entity){
		this.BO_ID = entity.getBO_ID();
		this.CLUSTER= entity.getCLUSTER();
		this.COMPONENT = entity.getCOMPONENT();
		this.REGION = entity.getREGION();
		this.W1_PERCENT = entity.getW1_PERCENT();
		this.W2_PERCENT = entity.getW2_PERCENT();
		this.W3_PERCENT = entity.getW3_PERCENT();
		this.W4_PERCENT = entity.getW4_PERCENT();
		this.W1_QUANTITY =entity.getW1_QUANTITY();
		this.W2_QUANTITY =entity.getW2_QUANTITY();
		this.W3_QUANTITY =entity.getW3_QUANTITY();
		this.W4_QUANTITY =entity.getW4_QUANTITY();
		
	}

	public Integer getBO_ID() {
		return BO_ID;
	}

	public void setBO_ID(Integer bO_ID) {
		BO_ID = bO_ID;
	}

	public double getW1_QUANTITY() {
		return W1_QUANTITY;
	}

	public void setW1_QUANTITY(double w1_QUANTITY) {
		W1_QUANTITY = w1_QUANTITY;
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

	

	@Override
	public String toString() {
		return "BuyingOrderSplitBean [BO_ID=" + BO_ID + ", CLUSTER=" + CLUSTER + ", COMPONENT=" + COMPONENT
				+ ", REGION=" + REGION + ", W1_PERCENT=" + W1_PERCENT + ", W1_Quantity=" + W1_QUANTITY + ", W2_PERCENT="
				+ W2_PERCENT + ", W2_Quantity=" + W2_QUANTITY + ", W3_PERCENT=" + W3_PERCENT + ", W3_Quantity="
				+ W3_QUANTITY + ", W4_PERCENT=" + W4_PERCENT + ", W4_Quantity=" + W4_QUANTITY + "]";
	}

	
}
