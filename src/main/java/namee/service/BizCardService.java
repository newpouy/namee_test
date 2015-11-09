package namee.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import namee.dao.BizCardDao;
import namee.domain.BizCard;

@Service
public class BizCardService {
	@Autowired
	BizCardDao bizCardDao;
	
	public BizCard createBizCard(String name, String company, String phone){
		BizCard bizCard = new BizCard(name, company, phone);
		return bizCardDao.insertBizCard(bizCard);
	}
	
	public ArrayList<BizCard> getBizCardList(){
		return bizCardDao.getBizCardList();
	}
	
	public BizCard getBizCardByPhone(String phone){
		return bizCardDao.getBizCardByPhone(phone);		
	}
	public BizCard getBizCardByName(String name){
		return bizCardDao.getBizCardByName(name);		
	}
	public BizCard getBizCardByCompany(String company){
		return bizCardDao.getBizCardByCompany(company);		
	}
	public BizCard updateBizCard(String name, BizCard newBizCard){
		return bizCardDao.updateBizCard(name, newBizCard);
	}
	public boolean deleteBizCard(String name){
		return bizCardDao.deleteBizCard(name);
	}
	
}
