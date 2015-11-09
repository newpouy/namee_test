package namee.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import namee.domain.BizCard;
import namee.service.BizCardService;

@Controller
@RequestMapping("/bizcard")
public class BizCardController {
	
	@Autowired
	BizCardService bizCardService;
	
	
	
	//create new bizCard
	@RequestMapping(value="insert/{name}/{company}/{phone}", method=RequestMethod.POST)
	public @ResponseBody BizCard createBizCard(@PathVariable String name, @PathVariable String company, @PathVariable String phone){
		return bizCardService.createBizCard(name, company, phone);
	}
	
	//select all bizCard
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody ArrayList<BizCard> getBizCardList(){
		//System.out.println("hihi");
		return bizCardService.getBizCardList();
	}
	
	//select a bizCard by phone
	@RequestMapping(value="phone/{phone}", method=RequestMethod.GET)
	public @ResponseBody BizCard getBizCardByPhone(@PathVariable String phone){
		BizCard bc = bizCardService.getBizCardByPhone(phone);
		if(bc==null){
			bc = new BizCard("there's nobody hanving that phone", "", "");
		}
		return bc;
	}
	
	//select a bizCard by name
	@RequestMapping(value="name/{name}", method=RequestMethod.GET)
	public @ResponseBody BizCard getBizCardByName(@PathVariable String name){
		BizCard bc = bizCardService.getBizCardByName(name);
		if(bc==null){
			bc = new BizCard("there's nobody hanving that phone", "", "");
		}
		return bc;
	}
	
	//select a bizCard by company
	@RequestMapping(value="company/{company}", method=RequestMethod.GET)
	public @ResponseBody BizCard getBizCardByCompany(@PathVariable String company){
		BizCard bc = bizCardService.getBizCardByCompany(company);
		if(bc==null){
			bc = new BizCard("there's nobody hanving that phone", "", "");
		}
		return bc;
	}
	
	//update a bizCard with name
	@RequestMapping(value="update/{name}", method=RequestMethod.PUT)
	public @ResponseBody BizCard updateBizCard(@PathVariable String name, BizCard newBizCard){
		System.out.println("update a bizCard");
		return bizCardService.updateBizCard(name, newBizCard);
	}
	
	//delete a bizCard with name
	@RequestMapping(value="delete/{name}", method=RequestMethod.DELETE)
	public @ResponseBody String deleteBizCard(@PathVariable String name){
		if(bizCardService.deleteBizCard(name)){
			return "success in delete";
		}else{
			return "failure in delete";
		}
	}
	
	
}
