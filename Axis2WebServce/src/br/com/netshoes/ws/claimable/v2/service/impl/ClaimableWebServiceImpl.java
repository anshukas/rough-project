/**
 * ClaimableWebServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.netshoes.ws.claimable.v2.service.impl;

import java.rmi.RemoteException;

import javax.jws.WebService;

import ws.CreateSingleGiftCertificateRequest;
import ws.CreateSingleGiftCertificateResponse;

@WebService
public class ClaimableWebServiceImpl implements ClaimableWebService {

	@Override
	public CreateSingleGiftCertificateResponse createSingleGiftCertificate(
			CreateSingleGiftCertificateRequest criarSingleGiftCertificateRequest)
			throws RemoteException {
		System.out.println("In class: ClaimableWebServiceImpl with method: createSingleGiftCertificate");
		
		return null;
	}

	/*@Override
	public CreateGCUsingGiftCertificateGeneratorResponse createGCUsingGiftCertificateGenerator(
			CreateGCUsingGiftCertificateGeneratorRequest criarGCUsingGiftCertificateGeneratorRequest)
			throws RemoteException {
		System.out.println("In class: ClaimableWebServiceImpl with method: createGCUsingGiftCertificateGenerator");
		return null;
	}

	@Override
	public Result activateGiftCertificate(
			ActivateGiftCertificateRequest ativateGiftCertificateRequest)
			throws RemoteException {
		System.out.println("In class: ClaimableWebServiceImpl with method: ActivateGiftCertificateRequest");
		return null;
	}

	@Override
	public Result cancelGiftCertificate(
			CancelGiftCertificateRequest cancelGiftCertificateRequest)
			throws RemoteException {
		System.out.println("In class: ClaimableWebServiceImpl with method: CancelGiftCertificateRequest");
		return null;
	}*/

}
