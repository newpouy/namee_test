package namee.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import namee.domain.BizCard;

@Repository
public class BizCardDao {
	ArrayList<BizCard> list = new ArrayList<BizCard>();
	
	public BizCard insertBizCard(BizCard bc){
		list.add(bc);
		return bc;
	}
	
	public ArrayList<BizCard> getBizCardList(){
		if(list.size()==0){
			list.add(new BizCard("a","aa","111-1111"));
			list.add(new BizCard("b","bb","222-2222"));
			list.add(new BizCard("c","cc","333-3333"));
		}
		return list;
	}
	
	public BizCard getBizCardByPhone(String phone) {
		for(BizCard bc : list){
			if(bc.getPhone().equals(phone)){
				return bc;
			}
		}
		return null;
	}
	
	public BizCard getBizCardByName(String name) {
		for(BizCard bc : list){
			if(bc.getName().equals(name)){
				return bc;
			}
		}
		return null;
	}
	
	public BizCard getBizCardByCompany(String company) {
		for(BizCard bc : list){
			if(bc.getCompany().equals(company)){
				return bc;
			}
		}
		return null;
	}	
	
	public BizCard updateBizCard(String name, BizCard newBizCard){
		BizCard bizCard=null;
		for(BizCard bc : list){
			if(bc.getName().equals(name)){
				bc.setName(newBizCard.getName());
				bc.setCompany(newBizCard.getCompany());
				bc.setPhone(newBizCard.getPhone());
				bizCard = bc;
			} 
		}
		if(bizCard==null){
			bizCard = new BizCard("there's no BizCard to update", "", "");
		}
		return bizCard;
	}
	
	public boolean deleteBizCard(String name){
		for(BizCard bc : list){
			if(bc.getName().equals(name)){
				list.remove(list.indexOf(bc));
				return true;
			}
		}
		return false;
	}
}
