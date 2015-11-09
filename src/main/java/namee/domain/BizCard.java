package namee.domain;

public class BizCard {
	String name;
	String company;
	String phone;
	
	public BizCard(){
		
	}
	public BizCard(String name, String company, String phone) {
		super();
		this.name = name;
		this.company = company;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
