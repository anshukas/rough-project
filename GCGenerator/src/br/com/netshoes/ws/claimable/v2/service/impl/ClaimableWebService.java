package br.com.netshoes.ws.claimable.v2.service.impl;


public interface ClaimableWebService extends java.rmi.Remote {

    public ws.CreateGCUsingGiftCertificateGeneratorRes createGCUsingGiftCertificateGenerator(ws.CreateGCUsingGiftCertificateGeneratorReq criarGCUsingGiftCertificateGeneratorRequest) throws java.rmi.RemoteException;
    public ws.Result activateGiftCertificate(ws.ActivateGiftCertificateRequest ativateGiftCertificateRequest) throws java.rmi.RemoteException;
    public ws.Result cancelGiftCertificate(ws.CancelGiftCertificateRequest cancelGiftCertificateRequest) throws java.rmi.RemoteException;
}
