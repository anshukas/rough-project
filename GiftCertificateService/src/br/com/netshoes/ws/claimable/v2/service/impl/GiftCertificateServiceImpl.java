package br.com.netshoes.ws.claimable.v2.service.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ws.ActivateGiftCertificateReq;
import ws.ActivateGiftCertificateRes;
import ws.DeactivateGiftCertificateReq;
import ws.DeactivateGiftCertificateRes;
import ws.GiftCertificate;
import ws.GiftCertificateGeneratorReq;
import ws.GiftCertificateGeneratorRes;
import ws.Result;

public class GiftCertificateServiceImpl implements GiftCertificateService {

	@Override
	public GiftCertificateGeneratorRes giftCertificateGenerator(
			GiftCertificateGeneratorReq giftCertificateGeneratorRequest)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActivateGiftCertificateRes activateGiftCertificate(
			ActivateGiftCertificateReq ativateGiftCertificateRequest)
			throws RemoteException {
		// TODO Auto-generated method stub
		
		ActivateGiftCertificateRes res = new ActivateGiftCertificateRes();
		//res.setGiftCertificates(giftCertificates);

		//Let says
		Map<String, String> mapAfterEx = new HashMap<String, String>();
		mapAfterEx.put("XXX", "OK");
		mapAfterEx.put("YYY", "OK");
		mapAfterEx.put("ZZZ", "NoK");
		
		Set<GiftCertificate> gcSet = new HashSet<GiftCertificate>();
		
		for(Map.Entry m : mapAfterEx.entrySet()) { 
			   //System.out.println(m.getKey()+" "+m.getValue()); 
			GiftCertificate g = new GiftCertificate();
			g.setGiftCertificateId((String)m.getKey());
			g.setGcActivationStatus((String)m.getValue());
			
			gcSet.add(g);
		}
		
		GiftCertificate[] gcAry = gcSet.toArray(new GiftCertificate[gcSet.size()]);
		
		res.setGiftCertificate(gcAry);
		
		//Result
		Result result = new Result();
		result.setMessages("Hope for Good..");
		result.setStatus("Success");
		
		res.setResult(result);
		return res;
	}

	@Override
	public DeactivateGiftCertificateRes deactivateGiftCertificate(
			DeactivateGiftCertificateReq DeactivateGiftCertificateRequest)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}
