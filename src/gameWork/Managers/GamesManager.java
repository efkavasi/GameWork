package gameWork.Managers;

import gameWork.Entities.Games;
import gameWork.interfaces.functionsGames;

public class GamesManager implements functionsGames {

				
			@Override
			public void save(Games game) {
				
		
			System.out.println(game.getId()+" "+ game.getGameName()+" "+game.getPrice()+" "+"Fiyatıyla oyun Kayıt edildi");
		
	}

	@Override
	public void delete(Games game) {
		System.out.println(game.getId()+" "+game.getGameName()+" "+"oyunu silinmiştir" );
		
	}

	@Override
	public void update(Games game) {
		System.out.println(game.getId()+" "+game.getGameName()+" "+game.getPrice()+ "güncellenmiştir");
		
	}
	

}
