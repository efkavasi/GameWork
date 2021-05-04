package gameWork.Managers;

import gameWork.Entities.Campaigns;
import gameWork.interfaces.functionsCampaigns;

public class CampaignsManager implements functionsCampaigns {

	@Override
	public void save(Campaigns campaign) {
		System.out.println(campaign.getName()+" "+ "Kampanyamız %"+""+campaign.getDiscount()+" "+"indirimle başlamıştır");
		
	}

	@Override
	public void delete(Campaigns campaign) {
		System.out.println(campaign.getId()+"kayıt nolu"+campaign.getName()+"kampanya kaldırılmıştır");
		
	}

	@Override
	public void update(Campaigns campaign) {
		System.out.println(campaign.getName()+" "+"kampanyası indirimi yüzde "+campaign.getDiscount()+" "+"olarak güncellenmiştir.");
		
	}

}
