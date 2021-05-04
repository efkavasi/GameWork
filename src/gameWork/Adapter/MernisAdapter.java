package gameWork.Adapter;

import java.rmi.RemoteException;

import gameWork.Entities.Users;
import gameWork.interfaces.CheckRealUserService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements CheckRealUserService{
	
	@Override
	public boolean RealUser(Users users) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(users.getNationalId()) , users.getFirstName().toUpperCase(), users.getLastName().toUpperCase(), users.getBirthYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
