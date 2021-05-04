package gameWork;

import gameWork.Adapter.MernisAdapter;
import gameWork.Entities.Campaigns;
import gameWork.Entities.Games;
import gameWork.Entities.Users;
import gameWork.Managers.CampaignsManager;
import gameWork.Managers.GamesManager;
import gameWork.Managers.SellManager;
import gameWork.Managers.UserManager;



public class Main {

	public static void main(String[] args) {
		
		UserManager userManager1 = new UserManager(new MernisAdapter()); 
		userManager1.save(new Users(007, 1981, "efka", "Engin", "Þen", "engin@engin.com", "35560092448"));
		
		Games game1 = new Games(010, "FAR CRY", 750);	
		Games game2 = new Games(003, "Half Life 2", 500);
		
		GamesManager gamesManager = new GamesManager();
	
		gamesManager.save(game1);	
		gamesManager.delete(game2);
	
		Campaigns campaign = new Campaigns(003, "Tatil", 10);
		CampaignsManager campaignsManager= new CampaignsManager();
		campaignsManager.save(campaign);
	
		//SellManager sellManager = new SellManager();
		//sellManager.sell(game2, user1);
		//sellManager.giftPoint(game2,user1);
	}

}
