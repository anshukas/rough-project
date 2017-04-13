/**
 * PedidoWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.netshoes.connect.order.service.impl;

public interface PedidoWebService extends java.rmi.Remote {
    public connect.Result alterarStatusPedido(connect.AlterarStatusPedidoRequest alterarStatusPedidoRequest) throws java.rmi.RemoteException;
    public connect.ListarPedidosResponse listarNovosPedidos(connect.ListarNovosPedidosRequest listarNovosPedidosRequest) throws java.rmi.RemoteException;
    public connect.Result validarBaixa(connect.ValidarBaixaRequest validarBaixaRequest) throws java.rmi.RemoteException;
}
