package gameWork.Managers;

import gameWork.Entities.Users;
import gameWork.interfaces.CheckRealUserService;
import gameWork.interfaces.functionsUsers;

public class UserManager implements functionsUsers{
	
	CheckRealUserService realUserService;
	
	public UserManager(CheckRealUserService realUserService) {
		super();
		this.realUserService = realUserService;
	}

	@Override
	public void update(Users users) {
		System.out.println(users.getId()+" "+ users.getEmail()+" "+ "Bilgileri güncellendi");
		
	}

	@Override
	public void delete(Users users) {
		System.out.println(users.getId()+" "+ "numaralý" + users.getFirstName()+" " +"isimli kullanýcý silindi");
		
	}

	@Override
	public void save(Users users) {
		if(realUserService.RealUser(users)) {
		System.out.println(users.getId() +" numaralý"+" "+ users.getUserName()+" "+"kullanýcý adýyla sisteme kaydoldu");
		}else 
			System.out.println("Gerçek kiþi deðildir. Sisteme kayýt olamazsýnýz!!");
		}		
	}
	
	/*if (customerCheckService.CheckIfRealPerson(customer)) {
	System.out.println("Starbucks müþterisi kaydedildi" +" " + customer.getFirstName());
}*/

