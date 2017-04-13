package br.com.netshoes.ws.claimable.v2.service.impl;


public interface GiftCertificateService extends java.rmi.Remote {

    public ws.GiftCertificateGeneratorRes giftCertificateGenerator(ws.GiftCertificateGeneratorReq giftCertificateGeneratorReq) throws java.rmi.RemoteException;
    public ws.ActivateGiftCertificateRes activateGiftCertificate(ws.ActivateGiftCertificateReq ativateGiftCertificateReq) throws java.rmi.RemoteException;
    public ws.DeactivateGiftCertificateRes deactivateGiftCertificate(ws.DeactivateGiftCertificateReq deactivateGiftCertificateReq) throws java.rmi.RemoteException;
}
