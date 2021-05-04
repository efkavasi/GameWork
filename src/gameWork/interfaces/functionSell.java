package gameWork.interfaces;

import gameWork.Entities.Games;
import gameWork.Entities.Users;

public interface functionSell {
	void sell(Games game, Users user);
	void giftPoint(Games game, Users user);
}
