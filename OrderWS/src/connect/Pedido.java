/**
 * Pedido.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class Pedido  implements java.io.Serializable {
    private java.lang.String numeroPedido;

    private java.lang.String codigoCatalogo;

    private java.util.Calendar dataPedido;

    private connect.StatusPedido status;

    private java.lang.String cupomDesconto;

    private java.lang.String campaignCode;

    private java.lang.String UTMCampaignCode;

    private java.lang.String codigoCliente;

    private java.lang.String emailCliente;

    private java.lang.String cpfCnpjCliente;

    private java.lang.String IPCliente;

    private java.lang.String DDDTelefone;

    private java.lang.String telefone;

    private java.math.BigDecimal subTotal;

    private java.math.BigDecimal valorDesconto;

    private java.math.BigDecimal valorDescontoBoleto;

    private java.math.BigDecimal valorDescontoOutros;

    private java.math.BigDecimal valorTotalPedido;

    private connect.PedidoSku[] listaSkus;

    private connect.Pagamento[] listaPagamentos;

    private connect.Entrega[] listaEntrega;

    public Pedido() {
    }

    public Pedido(
           java.lang.String numeroPedido,
           java.lang.String codigoCatalogo,
           java.util.Calendar dataPedido,
           connect.StatusPedido status,
           java.lang.String cupomDesconto,
           java.lang.String campaignCode,
           java.lang.String UTMCampaignCode,
           java.lang.String codigoCliente,
           java.lang.String emailCliente,
           java.lang.String cpfCnpjCliente,
           java.lang.String IPCliente,
           java.lang.String DDDTelefone,
           java.lang.String telefone,
           java.math.BigDecimal subTotal,
           java.math.BigDecimal valorDesconto,
           java.math.BigDecimal valorDescontoBoleto,
           java.math.BigDecimal valorDescontoOutros,
           java.math.BigDecimal valorTotalPedido,
           connect.PedidoSku[] listaSkus,
           connect.Pagamento[] listaPagamentos,
           connect.Entrega[] listaEntrega) {
           this.numeroPedido = numeroPedido;
           this.codigoCatalogo = codigoCatalogo;
           this.dataPedido = dataPedido;
           this.status = status;
           this.cupomDesconto = cupomDesconto;
           this.campaignCode = campaignCode;
           this.UTMCampaignCode = UTMCampaignCode;
           this.codigoCliente = codigoCliente;
           this.emailCliente = emailCliente;
           this.cpfCnpjCliente = cpfCnpjCliente;
           this.IPCliente = IPCliente;
           this.DDDTelefone = DDDTelefone;
           this.telefone = telefone;
           this.subTotal = subTotal;
           this.valorDesconto = valorDesconto;
           this.valorDescontoBoleto = valorDescontoBoleto;
           this.valorDescontoOutros = valorDescontoOutros;
           this.valorTotalPedido = valorTotalPedido;
           this.listaSkus = listaSkus;
           this.listaPagamentos = listaPagamentos;
           this.listaEntrega = listaEntrega;
    }


    /**
     * Gets the numeroPedido value for this Pedido.
     * 
     * @return numeroPedido
     */
    public java.lang.String getNumeroPedido() {
        return numeroPedido;
    }


    /**
     * Sets the numeroPedido value for this Pedido.
     * 
     * @param numeroPedido
     */
    public void setNumeroPedido(java.lang.String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }


    /**
     * Gets the codigoCatalogo value for this Pedido.
     * 
     * @return codigoCatalogo
     */
    public java.lang.String getCodigoCatalogo() {
        return codigoCatalogo;
    }


    /**
     * Sets the codigoCatalogo value for this Pedido.
     * 
     * @param codigoCatalogo
     */
    public void setCodigoCatalogo(java.lang.String codigoCatalogo) {
        this.codigoCatalogo = codigoCatalogo;
    }


    /**
     * Gets the dataPedido value for this Pedido.
     * 
     * @return dataPedido
     */
    public java.util.Calendar getDataPedido() {
        return dataPedido;
    }


    /**
     * Sets the dataPedido value for this Pedido.
     * 
     * @param dataPedido
     */
    public void setDataPedido(java.util.Calendar dataPedido) {
        this.dataPedido = dataPedido;
    }


    /**
     * Gets the status value for this Pedido.
     * 
     * @return status
     */
    public connect.StatusPedido getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Pedido.
     * 
     * @param status
     */
    public void setStatus(connect.StatusPedido status) {
        this.status = status;
    }


    /**
     * Gets the cupomDesconto value for this Pedido.
     * 
     * @return cupomDesconto
     */
    public java.lang.String getCupomDesconto() {
        return cupomDesconto;
    }


    /**
     * Sets the cupomDesconto value for this Pedido.
     * 
     * @param cupomDesconto
     */
    public void setCupomDesconto(java.lang.String cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
    }


    /**
     * Gets the campaignCode value for this Pedido.
     * 
     * @return campaignCode
     */
    public java.lang.String getCampaignCode() {
        return campaignCode;
    }


    /**
     * Sets the campaignCode value for this Pedido.
     * 
     * @param campaignCode
     */
    public void setCampaignCode(java.lang.String campaignCode) {
        this.campaignCode = campaignCode;
    }


    /**
     * Gets the UTMCampaignCode value for this Pedido.
     * 
     * @return UTMCampaignCode
     */
    public java.lang.String getUTMCampaignCode() {
        return UTMCampaignCode;
    }


    /**
     * Sets the UTMCampaignCode value for this Pedido.
     * 
     * @param UTMCampaignCode
     */
    public void setUTMCampaignCode(java.lang.String UTMCampaignCode) {
        this.UTMCampaignCode = UTMCampaignCode;
    }


    /**
     * Gets the codigoCliente value for this Pedido.
     * 
     * @return codigoCliente
     */
    public java.lang.String getCodigoCliente() {
        return codigoCliente;
    }


    /**
     * Sets the codigoCliente value for this Pedido.
     * 
     * @param codigoCliente
     */
    public void setCodigoCliente(java.lang.String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }


    /**
     * Gets the emailCliente value for this Pedido.
     * 
     * @return emailCliente
     */
    public java.lang.String getEmailCliente() {
        return emailCliente;
    }


    /**
     * Sets the emailCliente value for this Pedido.
     * 
     * @param emailCliente
     */
    public void setEmailCliente(java.lang.String emailCliente) {
        this.emailCliente = emailCliente;
    }


    /**
     * Gets the cpfCnpjCliente value for this Pedido.
     * 
     * @return cpfCnpjCliente
     */
    public java.lang.String getCpfCnpjCliente() {
        return cpfCnpjCliente;
    }


    /**
     * Sets the cpfCnpjCliente value for this Pedido.
     * 
     * @param cpfCnpjCliente
     */
    public void setCpfCnpjCliente(java.lang.String cpfCnpjCliente) {
        this.cpfCnpjCliente = cpfCnpjCliente;
    }


    /**
     * Gets the IPCliente value for this Pedido.
     * 
     * @return IPCliente
     */
    public java.lang.String getIPCliente() {
        return IPCliente;
    }


    /**
     * Sets the IPCliente value for this Pedido.
     * 
     * @param IPCliente
     */
    public void setIPCliente(java.lang.String IPCliente) {
        this.IPCliente = IPCliente;
    }


    /**
     * Gets the DDDTelefone value for this Pedido.
     * 
     * @return DDDTelefone
     */
    public java.lang.String getDDDTelefone() {
        return DDDTelefone;
    }


    /**
     * Sets the DDDTelefone value for this Pedido.
     * 
     * @param DDDTelefone
     */
    public void setDDDTelefone(java.lang.String DDDTelefone) {
        this.DDDTelefone = DDDTelefone;
    }


    /**
     * Gets the telefone value for this Pedido.
     * 
     * @return telefone
     */
    public java.lang.String getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this Pedido.
     * 
     * @param telefone
     */
    public void setTelefone(java.lang.String telefone) {
        this.telefone = telefone;
    }


    /**
     * Gets the subTotal value for this Pedido.
     * 
     * @return subTotal
     */
    public java.math.BigDecimal getSubTotal() {
        return subTotal;
    }


    /**
     * Sets the subTotal value for this Pedido.
     * 
     * @param subTotal
     */
    public void setSubTotal(java.math.BigDecimal subTotal) {
        this.subTotal = subTotal;
    }


    /**
     * Gets the valorDesconto value for this Pedido.
     * 
     * @return valorDesconto
     */
    public java.math.BigDecimal getValorDesconto() {
        return valorDesconto;
    }


    /**
     * Sets the valorDesconto value for this Pedido.
     * 
     * @param valorDesconto
     */
    public void setValorDesconto(java.math.BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }


    /**
     * Gets the valorDescontoBoleto value for this Pedido.
     * 
     * @return valorDescontoBoleto
     */
    public java.math.BigDecimal getValorDescontoBoleto() {
        return valorDescontoBoleto;
    }


    /**
     * Sets the valorDescontoBoleto value for this Pedido.
     * 
     * @param valorDescontoBoleto
     */
    public void setValorDescontoBoleto(java.math.BigDecimal valorDescontoBoleto) {
        this.valorDescontoBoleto = valorDescontoBoleto;
    }


    /**
     * Gets the valorDescontoOutros value for this Pedido.
     * 
     * @return valorDescontoOutros
     */
    public java.math.BigDecimal getValorDescontoOutros() {
        return valorDescontoOutros;
    }


    /**
     * Sets the valorDescontoOutros value for this Pedido.
     * 
     * @param valorDescontoOutros
     */
    public void setValorDescontoOutros(java.math.BigDecimal valorDescontoOutros) {
        this.valorDescontoOutros = valorDescontoOutros;
    }


    /**
     * Gets the valorTotalPedido value for this Pedido.
     * 
     * @return valorTotalPedido
     */
    public java.math.BigDecimal getValorTotalPedido() {
        return valorTotalPedido;
    }


    /**
     * Sets the valorTotalPedido value for this Pedido.
     * 
     * @param valorTotalPedido
     */
    public void setValorTotalPedido(java.math.BigDecimal valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }


    /**
     * Gets the listaSkus value for this Pedido.
     * 
     * @return listaSkus
     */
    public connect.PedidoSku[] getListaSkus() {
        return listaSkus;
    }


    /**
     * Sets the listaSkus value for this Pedido.
     * 
     * @param listaSkus
     */
    public void setListaSkus(connect.PedidoSku[] listaSkus) {
        this.listaSkus = listaSkus;
    }


    /**
     * Gets the listaPagamentos value for this Pedido.
     * 
     * @return listaPagamentos
     */
    public connect.Pagamento[] getListaPagamentos() {
        return listaPagamentos;
    }


    /**
     * Sets the listaPagamentos value for this Pedido.
     * 
     * @param listaPagamentos
     */
    public void setListaPagamentos(connect.Pagamento[] listaPagamentos) {
        this.listaPagamentos = listaPagamentos;
    }


    /**
     * Gets the listaEntrega value for this Pedido.
     * 
     * @return listaEntrega
     */
    public connect.Entrega[] getListaEntrega() {
        return listaEntrega;
    }


    /**
     * Sets the listaEntrega value for this Pedido.
     * 
     * @param listaEntrega
     */
    public void setListaEntrega(connect.Entrega[] listaEntrega) {
        this.listaEntrega = listaEntrega;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pedido)) return false;
        Pedido other = (Pedido) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroPedido==null && other.getNumeroPedido()==null) || 
             (this.numeroPedido!=null &&
              this.numeroPedido.equals(other.getNumeroPedido()))) &&
            ((this.codigoCatalogo==null && other.getCodigoCatalogo()==null) || 
             (this.codigoCatalogo!=null &&
              this.codigoCatalogo.equals(other.getCodigoCatalogo()))) &&
            ((this.dataPedido==null && other.getDataPedido()==null) || 
             (this.dataPedido!=null &&
              this.dataPedido.equals(other.getDataPedido()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.cupomDesconto==null && other.getCupomDesconto()==null) || 
             (this.cupomDesconto!=null &&
              this.cupomDesconto.equals(other.getCupomDesconto()))) &&
            ((this.campaignCode==null && other.getCampaignCode()==null) || 
             (this.campaignCode!=null &&
              this.campaignCode.equals(other.getCampaignCode()))) &&
            ((this.UTMCampaignCode==null && other.getUTMCampaignCode()==null) || 
             (this.UTMCampaignCode!=null &&
              this.UTMCampaignCode.equals(other.getUTMCampaignCode()))) &&
            ((this.codigoCliente==null && other.getCodigoCliente()==null) || 
             (this.codigoCliente!=null &&
              this.codigoCliente.equals(other.getCodigoCliente()))) &&
            ((this.emailCliente==null && other.getEmailCliente()==null) || 
             (this.emailCliente!=null &&
              this.emailCliente.equals(other.getEmailCliente()))) &&
            ((this.cpfCnpjCliente==null && other.getCpfCnpjCliente()==null) || 
             (this.cpfCnpjCliente!=null &&
              this.cpfCnpjCliente.equals(other.getCpfCnpjCliente()))) &&
            ((this.IPCliente==null && other.getIPCliente()==null) || 
             (this.IPCliente!=null &&
              this.IPCliente.equals(other.getIPCliente()))) &&
            ((this.DDDTelefone==null && other.getDDDTelefone()==null) || 
             (this.DDDTelefone!=null &&
              this.DDDTelefone.equals(other.getDDDTelefone()))) &&
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              this.telefone.equals(other.getTelefone()))) &&
            ((this.subTotal==null && other.getSubTotal()==null) || 
             (this.subTotal!=null &&
              this.subTotal.equals(other.getSubTotal()))) &&
            ((this.valorDesconto==null && other.getValorDesconto()==null) || 
             (this.valorDesconto!=null &&
              this.valorDesconto.equals(other.getValorDesconto()))) &&
            ((this.valorDescontoBoleto==null && other.getValorDescontoBoleto()==null) || 
             (this.valorDescontoBoleto!=null &&
              this.valorDescontoBoleto.equals(other.getValorDescontoBoleto()))) &&
            ((this.valorDescontoOutros==null && other.getValorDescontoOutros()==null) || 
             (this.valorDescontoOutros!=null &&
              this.valorDescontoOutros.equals(other.getValorDescontoOutros()))) &&
            ((this.valorTotalPedido==null && other.getValorTotalPedido()==null) || 
             (this.valorTotalPedido!=null &&
              this.valorTotalPedido.equals(other.getValorTotalPedido()))) &&
            ((this.listaSkus==null && other.getListaSkus()==null) || 
             (this.listaSkus!=null &&
              java.util.Arrays.equals(this.listaSkus, other.getListaSkus()))) &&
            ((this.listaPagamentos==null && other.getListaPagamentos()==null) || 
             (this.listaPagamentos!=null &&
              java.util.Arrays.equals(this.listaPagamentos, other.getListaPagamentos()))) &&
            ((this.listaEntrega==null && other.getListaEntrega()==null) || 
             (this.listaEntrega!=null &&
              java.util.Arrays.equals(this.listaEntrega, other.getListaEntrega())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNumeroPedido() != null) {
            _hashCode += getNumeroPedido().hashCode();
        }
        if (getCodigoCatalogo() != null) {
            _hashCode += getCodigoCatalogo().hashCode();
        }
        if (getDataPedido() != null) {
            _hashCode += getDataPedido().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCupomDesconto() != null) {
            _hashCode += getCupomDesconto().hashCode();
        }
        if (getCampaignCode() != null) {
            _hashCode += getCampaignCode().hashCode();
        }
        if (getUTMCampaignCode() != null) {
            _hashCode += getUTMCampaignCode().hashCode();
        }
        if (getCodigoCliente() != null) {
            _hashCode += getCodigoCliente().hashCode();
        }
        if (getEmailCliente() != null) {
            _hashCode += getEmailCliente().hashCode();
        }
        if (getCpfCnpjCliente() != null) {
            _hashCode += getCpfCnpjCliente().hashCode();
        }
        if (getIPCliente() != null) {
            _hashCode += getIPCliente().hashCode();
        }
        if (getDDDTelefone() != null) {
            _hashCode += getDDDTelefone().hashCode();
        }
        if (getTelefone() != null) {
            _hashCode += getTelefone().hashCode();
        }
        if (getSubTotal() != null) {
            _hashCode += getSubTotal().hashCode();
        }
        if (getValorDesconto() != null) {
            _hashCode += getValorDesconto().hashCode();
        }
        if (getValorDescontoBoleto() != null) {
            _hashCode += getValorDescontoBoleto().hashCode();
        }
        if (getValorDescontoOutros() != null) {
            _hashCode += getValorDescontoOutros().hashCode();
        }
        if (getValorTotalPedido() != null) {
            _hashCode += getValorTotalPedido().hashCode();
        }
        if (getListaSkus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaSkus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaSkus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaPagamentos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaPagamentos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaPagamentos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaEntrega() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaEntrega());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaEntrega(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pedido.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Pedido"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroPedido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumeroPedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCatalogo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodigoCatalogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPedido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataPedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "statusPedido"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cupomDesconto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CupomDesconto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CampaignCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UTMCampaignCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UTMCampaignCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodigoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmailCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpjCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CpfCnpjCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IPCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DDDTelefone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DDDTelefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Telefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDesconto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValorDesconto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDescontoBoleto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValorDescontoBoleto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDescontoOutros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValorDescontoOutros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorTotalPedido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValorTotalPedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaSkus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ListaSkus"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "PedidoSku"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaPagamentos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ListaPagamentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Pagamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ListaEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Entrega"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
