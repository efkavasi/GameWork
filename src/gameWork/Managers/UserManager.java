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
		System.out.println(users.getId()+" "+ users.getEmail()+" "+ "Bilgileri g�ncellendi");
		
	}

	@Override
	public void delete(Users users) {
		System.out.println(users.getId()+" "+ "numaral�" + users.getFirstName()+" " +"isimli kullan�c� silindi");
		
	}

	@Override
	public void save(Users users) {
		if(realUserService.RealUser(users)) {
		System.out.println(users.getId() +" numaral�"+" "+ users.getUserName()+" "+"kullan�c� ad�yla sisteme kaydoldu");
		}else 
			System.out.println("Ger�ek ki�i de�ildir. Sisteme kay�t olamazs�n�z!!");
		}		
	}
	
	/*if (customerCheckService.CheckIfRealPerson(customer)) {
	System.out.println("Starbucks m��terisi kaydedildi" +" " + customer.getFirstName());
}*/

