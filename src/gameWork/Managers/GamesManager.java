package gameWork.Managers;

import gameWork.Entities.Games;
import gameWork.interfaces.functionsGames;

public class GamesManager implements functionsGames {


	@Override
	public void saveAll(Games[] game) {
		for(Games game1 : game) {
		System.out.println(game1.getId()+" "+ game1.getGameName()+" "+game1.getPrice()+" "+"Fiyat�yla oyun Kay�t edildi");
		}
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
