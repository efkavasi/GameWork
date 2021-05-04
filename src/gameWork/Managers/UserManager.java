package gameWork.Managers;

import gameWork.Entities.Users;
import gameWork.interfaces.CheckRealUserService;
import gameWork.interfaces.functionsUsers;

public class UserManager implements functionsUsers{
	
		CheckRealUserService realUserService;
		
		Users[] players;
		
		public UserManager(Users[] players) {
			super();
			this.players = players;
		}

		public UserManager(CheckRealUserService realUserService) {
		super();
		this.realUserService = realUserService;
	}
		
		@Override
		public void saveAll(Users[] users) {
			for(Users users1 :users) {
				if(realUserService.RealUser(users1)) {
					System.out.println(users1.getId() +" numaralý"+" "+ users1.getFirstName()+" "+"kullanýcý adýyla sisteme kaydoldu");
				}else System.out.println("Gerçek kiþi olmadýðýndan kayýt gerçekleþmedi!!");
			}
			
		}

		@Override
		public void delete(Users users) {
			System.out.println(users.getId()+" "+"kayýt nolu"+ users.getFirstName()+" "+ "isimli kullanýcý silinmiþtir.");
			
		}

		@Override
		public void update(Users users) {
			System.out.println(users.getFirstName()+"isimli kullanýcý"+" "+users.getEmail()+" "+"güncellenmiþtir");
			
		}
		}		
		
		
		
		
/*
	@Override
	public void update(Users users) {
		System.out.println(users.getId()+" "+ users.getEmail()+" "+ "Bilgileri güncellendi");
		
	}

	@Override
	public void delete(Users users) {
		System.out.println(users.getId()+" "+ "numaralý" + users.getFirstName()+" " +"isimli kullanýcý silindi");
		
	}

	@Override
	public Users save(Users users) {
		for(Users players: users) {
			if(realUserService.RealUser(users))
		{
			System.out.println(users.getId() +" numaralý"+" "+ users.getFirstName()+" "+"kullanýcý adýyla sisteme kaydoldu");
			return users;
		
		}else { 
			System.out.println("Gerçek kiþi deðildir. Sisteme kayýt olamazsýnýz!!");
		return users;
		}
		}*/

		
	
	
