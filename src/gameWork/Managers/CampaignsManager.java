package gameWork.Managers;

import gameWork.Entities.Campaigns;
import gameWork.interfaces.functionsCampaigns;

public class CampaignsManager implements functionsCampaigns {

	@Override
	public void save(Campaigns campaign) {
		System.out.println(campaign.getName()+" "+ "Kampanyamýz %"+""+campaign.getDiscount()+" "+"indirimle baþlamýþtýr");
		
	}

	@Override
	public void delete(Campaigns campaign) {
		System.out.println(campaign.getId()+"kayýt nolu"+campaign.getName()+"kampanya kaldýrýlmýþtýr");
		
	}

	@Override
	public void update(Campaigns campaign) {
		System.out.println(campaign.getName()+" "+"kampanyasý indirimi yüzde "+campaign.getDiscount()+" "+"olarak güncellenmiþtir.");
		
	}

}
