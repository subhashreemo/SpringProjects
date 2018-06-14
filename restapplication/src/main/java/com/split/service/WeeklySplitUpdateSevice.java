package com.split.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.split.beans.WeeklySplitCreateBean;
import com.split.entity.WeeklySplitUpdateEntity;
import com.split.repositories.WeeklySplitUpdateRepository;

@Service
@Transactional(value="transactionManager")
public class WeeklySplitUpdateSevice {


	@Autowired
	WeeklySplitUpdateRepository boweeksplitRepo;
	public void saveWeeklySplitBean(WeeklySplitCreateBean bean) {

		/*WeeklySplitEntity weeklysplitentity = new WeeklySplitEntity ();
		/*List<WeeklySplitUpdateEntity> itemListw1 = new ArrayList<WeeklySplitUpdateEntity>();
		List<WeeklySplitUpdateEntity> itemListw2 = new ArrayList<WeeklySplitUpdateEntity>();
		List<WeeklySplitUpdateEntity> itemListw3 = new ArrayList<WeeklySplitUpdateEntity>();
		List<WeeklySplitUpdateEntity> itemListw4 = new ArrayList<WeeklySplitUpdateEntity>();*/

		/*System.out.println("in WeekplySplitUpdateService");
		System.out.println("in WeekplySplitUpdateService" +bean.getBO_ID()+"-----------"+bean.getREGION()+"!!!!!!!!!!!!!" +bean.getCLUSTER()+"w1 percent");
		System.out.println("W1 Percent"+bean.getW1_PERCENT()+"W1 Quantity"+bean.getW1_QUANTITY());
		System.out.println("W2 Percent"+bean.getW2_PERCENT()+"W2 Quantity"+bean.getW2_QUANTITY());
		System.out.println("W3 Percent"+bean.getW3_PERCENT()+"W3 Quantity"+bean.getW3_QUANTITY());
		System.out.println("W4 Percent"+bean.getW4_PERCENT()+"W4 Quantity"+bean.getW4_QUANTITY());*/
		/*WeeklySplitUpdateEntity itemEntity = new WeeklySplitUpdateEntity();
		try{
			if(bean.getW1_PERCENT()!=0){
				itemEntity.setBO_ID(bean.getBO_ID());
				itemEntity.setRegion(bean.getREGION());
				itemEntity.setCluster(bean.getCLUSTER());
				itemEntity.setComponent(bean.getCOMPONENT());
				itemEntity.setQunatity(bean.getW1_QUANTITY());
				itemEntity.setPERCENT(bean.getW1_PERCENT());
				itemEntity.setWEEK("W1");
			}
			


		}
		catch(Exception e){
			e.printStackTrace();
		}*/
	}

}
