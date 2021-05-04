package gameWork.Managers;

import gameWork.Entities.Campaigns;
import gameWork.interfaces.functionsCampaigns;

public class CampaignsManager implements functionsCampaigns {

	@Override
	public void saveAll(Campaigns[] campaign) {
		for(Campaigns campaign1 : campaign) {
		System.out.println(campaign1.getName()+" "+ "Kampanyamýz %"+""+campaign1.getDiscount()+" "+"indirimle baþlamýþtýr");
		}
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
