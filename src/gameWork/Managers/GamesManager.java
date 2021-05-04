package gameWork.Managers;

import gameWork.Entities.Games;
import gameWork.interfaces.functionsGames;

public class GamesManager implements functionsGames {

				
			@Override
			public void save(Games game) {
				
		
			System.out.println(game.getId()+" "+ game.getGameName()+" "+game.getPrice()+" "+"Fiyatýyla oyun Kayýt edildi");
		
	}

	@Override
	public void delete(Games game) {
		System.out.println(game.getId()+" "+game.getGameName()+" "+"oyunu silinmiþtir" );
		
	}

	@Override
	public void update(Games game) {
		System.out.println(game.getId()+" "+game.getGameName()+" "+game.getPrice()+ "güncellenmiþtir");
		
	}
	

}
