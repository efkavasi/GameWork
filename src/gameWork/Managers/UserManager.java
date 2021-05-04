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
					System.out.println(users1.getId() +" numaral�"+" "+ users1.getFirstName()+" "+"kullan�c� ad�yla sisteme kaydoldu");
				}else System.out.println("Ger�ek ki�i olmad���ndan kay�t ger�ekle�medi!!");
			}
			
		}

		@Override
		public void delete(Users users) {
			System.out.println(users.getId()+" "+"kay�t nolu"+ users.getFirstName()+" "+ "isimli kullan�c� silinmi�tir.");
			
		}

		@Override
		public void update(Users users) {
			System.out.println(users.getFirstName()+"isimli kullan�c�"+" "+users.getEmail()+" "+"g�ncellenmi�tir");
			
		}
		}		
		
		
		
		
/*
	@Override
	public void update(Users users) {
		System.out.println(users.getId()+" "+ users.getEmail()+" "+ "Bilgileri g�ncellendi");
		
	}

	@Override
	public void delete(Users users) {
		System.out.println(users.getId()+" "+ "numaral�" + users.getFirstName()+" " +"isimli kullan�c� silindi");
		
	}

	@Override
	public Users save(Users users) {
		for(Users players: users) {
			if(realUserService.RealUser(users))
		{
			System.out.println(users.getId() +" numaral�"+" "+ users.getFirstName()+" "+"kullan�c� ad�yla sisteme kaydoldu");
			return users;
		
		}else { 
			System.out.println("Ger�ek ki�i de�ildir. Sisteme kay�t olamazs�n�z!!");
		return users;
		}
		}*/

		
	
	
