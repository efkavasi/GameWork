package gameWork.Managers;

import gameWork.Entities.Games;
import gameWork.interfaces.functionsGames;

public class GamesManager implements functionsGames {

				
			@Override
			public void save(Games game) {
				
		
			System.out.println(game.getId()+" "+ game.getGameName()+" "+game.getPrice()+" "+"Fiyat�yla oyun Kay�t edildi");
		
	}

	@Override
	public void delete(Games game) {
		System.out.println(game.getId()+" "+game.getGameName()+" "+"oyunu silinmi�tir" );
		
	}

	@Override
	public void update(Games game) {
		System.out.println(game.getId()+" "+game.getGameName()+" "+game.getPrice()+ "g�ncellenmi�tir");
		
	}
	

}
