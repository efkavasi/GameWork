package gameWork.Managers;

import gameWork.Entities.Games;
import gameWork.Entities.Users;
import gameWork.interfaces.functionSell;

public class SellManager implements functionSell {

		double point;
	@Override
	public void sell(Games game, Users user) {
		System.out.println(user.getFirstName()+" "+"isimli kullan�c�"+" "+game.getGameName()+" "+"oyunu"+ " "+game.getPrice()+" "+ "sat�n ald�" );
		
	}

	@Override
	public void giftPoint(Games game, Users user) {
		point= (game.getPrice()*15)/1000;
		System.out.println(user.getFirstName()+" "+ "isimli kullan�c�"+" "+ game.getGameName()+" "+"isimli oyunu sat�n alarak"+" "+ point+" "+"puan kazand�");
	}
		
}
