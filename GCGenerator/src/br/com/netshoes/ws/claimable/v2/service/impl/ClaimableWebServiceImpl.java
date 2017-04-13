package br.com.netshoes.ws.claimable.v2.service.impl;

import java.rmi.RemoteException;

import ws.ActivateGiftCertificateRequest;
import ws.CancelGiftCertificateRequest;
import ws.CreateGCUsingGiftCertificateGeneratorReq;
import ws.CreateGCUsingGiftCertificateGeneratorRes;
import ws.Result;

public class ClaimableWebServiceImpl implements ClaimableWebService {

	@Override
	public CreateGCUsingGiftCertificateGeneratorRes createGCUsingGiftCertificateGenerator(
			CreateGCUsingGiftCertificateGeneratorReq req)
			throws RemoteException {

		System.out.println("In class: ClaimableWebServiceImpl with method: createGCUsingGiftCertificateGenerator");
		System.out.println(req);
		return null;
	}

	@Override
	public Result activateGiftCertificate(
			ActivateGiftCertificateRequest req)
			throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println(req.getGiftCertificateIds());
		return null;
	}

	@Override
	public Result cancelGiftCertificate(
			CancelGiftCertificateRequest cancelGiftCertificateRequest)
			throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println(cancelGiftCertificateRequest.getGcIds());
		return null;
	}

}
