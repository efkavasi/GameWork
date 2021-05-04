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

		Users user1 = new Users(1, 1999, "gelecekzaman", "ahmet", "yýlmaz", "ahmet@ahmet.com", "123123123123");
		Users user2 = new Users(2, 2000, "efka", "hakan", "düþmez", "hakan@hakan.com", "6575675433");	
		Users[] users ={user1,user2};
		userManager1.saveAll(users);
		
		System.out.println("--------------------------------------------------");

		GamesManager gamesManager = new GamesManager();
		Games game1 = new Games(010, "FAR CRY", 750);	
		Games game2 = new Games(003, "Half Life 2", 500);
		Games[] games = {game1,game2};
		gamesManager.saveAll(games);
		gamesManager.update(game2);
		
		System.out.println("--------------------------------------------------");
		CampaignsManager campaignsManager= new CampaignsManager();
		
		Campaigns campaign1 = new Campaigns(003, "Tatil", 10);
		Campaigns campaign2 = new Campaigns(004, "Kýþ", 30);
		Campaigns[] campaign = {campaign1,campaign2};
		
		campaignsManager.saveAll(campaign);

		SellManager sellManager = new SellManager();
		sellManager.sell(game1, user1);
		sellManager.giftPoint(game2,user2);
	}

}
