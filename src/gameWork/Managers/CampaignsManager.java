package gameWork.Managers;

import gameWork.Entities.Campaigns;
import gameWork.interfaces.functionsCampaigns;

public class CampaignsManager implements functionsCampaigns {

	@Override
	public void save(Campaigns campaign) {
		System.out.println(campaign.getName()+" "+ "Kampanyam�z %"+""+campaign.getDiscount()+" "+"indirimle ba�lam��t�r");
		
	}

	@Override
	public void delete(Campaigns campaign) {
		System.out.println(campaign.getId()+"kay�t nolu"+campaign.getName()+"kampanya kald�r�lm��t�r");
		
	}

	@Override
	public void update(Campaigns campaign) {
		System.out.println(campaign.getName()+" "+"kampanyas� indirimi y�zde "+campaign.getDiscount()+" "+"olarak g�ncellenmi�tir.");
		
	}

}
