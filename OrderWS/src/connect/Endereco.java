/**
 * Endereco.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class Endereco  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String sobrenome;

    private java.lang.String pais;

    private java.lang.String estado;

    private java.lang.String cidade;

    private java.lang.String rua;

    private java.lang.String numeroRua;

    private java.lang.String complemento;

    private java.lang.String bairro;

    private java.lang.String cep;

    private java.lang.String pontoReferencia;

    private java.lang.String descricao;

    private boolean enderecoComercial;

    public Endereco() {
    }

    public Endereco(
           java.lang.String nome,
           java.lang.String sobrenome,
           java.lang.String pais,
           java.lang.String estado,
           java.lang.String cidade,
           java.lang.String rua,
           java.lang.String numeroRua,
           java.lang.String complemento,
           java.lang.String bairro,
           java.lang.String cep,
           java.lang.String pontoReferencia,
           java.lang.String descricao,
           boolean enderecoComercial) {
           this.nome = nome;
           this.sobrenome = sobrenome;
           this.pais = pais;
           this.estado = estado;
           this.cidade = cidade;
           this.rua = rua;
           this.numeroRua = numeroRua;
           this.complemento = complemento;
           this.bairro = bairro;
           this.cep = cep;
           this.pontoReferencia = pontoReferencia;
           this.descricao = descricao;
           this.enderecoComercial = enderecoComercial;
    }


    /**
     * Gets the nome value for this Endereco.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Endereco.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the sobrenome value for this Endereco.
     * 
     * @return sobrenome
     */
    public java.lang.String getSobrenome() {
        return sobrenome;
    }


    /**
     * Sets the sobrenome value for this Endereco.
     * 
     * @param sobrenome
     */
    public void setSobrenome(java.lang.String sobrenome) {
        this.sobrenome = sobrenome;
    }


    /**
     * Gets the pais value for this Endereco.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this Endereco.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the estado value for this Endereco.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Endereco.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the cidade value for this Endereco.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this Endereco.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the rua value for this Endereco.
     * 
     * @return rua
     */
    public java.lang.String getRua() {
        return rua;
    }


    /**
     * Sets the rua value for this Endereco.
     * 
     * @param rua
     */
    public void setRua(java.lang.String rua) {
        this.rua = rua;
    }


    /**
     * Gets the numeroRua value for this Endereco.
     * 
     * @return numeroRua
     */
    public java.lang.String getNumeroRua() {
        return numeroRua;
    }


    /**
     * Sets the numeroRua value for this Endereco.
     * 
     * @param numeroRua
     */
    public void setNumeroRua(java.lang.String numeroRua) {
        this.numeroRua = numeroRua;
    }


    /**
     * Gets the complemento value for this Endereco.
     * 
     * @return complemento
     */
    public java.lang.String getComplemento() {
        return complemento;
    }


    /**
     * Sets the complemento value for this Endereco.
     * 
     * @param complemento
     */
    public void setComplemento(java.lang.String complemento) {
        this.complemento = complemento;
    }


    /**
     * Gets the bairro value for this Endereco.
     * 
     * @return bairro
     */
    public java.lang.String getBairro() {
        return bairro;
    }


    /**
     * Sets the bairro value for this Endereco.
     * 
     * @param bairro
     */
    public void setBairro(java.lang.String bairro) {
        this.bairro = bairro;
    }


    /**
     * Gets the cep value for this Endereco.
     * 
     * @return cep
     */
    public java.lang.String getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this Endereco.
     * 
     * @param cep
     */
    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }


    /**
     * Gets the pontoReferencia value for this Endereco.
     * 
     * @return pontoReferencia
     */
    public java.lang.String getPontoReferencia() {
        return pontoReferencia;
    }


    /**
     * Sets the pontoReferencia value for this Endereco.
     * 
     * @param pontoReferencia
     */
    public void setPontoReferencia(java.lang.String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }


    /**
     * Gets the descricao value for this Endereco.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Endereco.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the enderecoComercial value for this Endereco.
     * 
     * @return enderecoComercial
     */
    public boolean isEnderecoComercial() {
        return enderecoComercial;
    }


    /**
     * Sets the enderecoComercial value for this Endereco.
     * 
     * @param enderecoComercial
     */
    public void setEnderecoComercial(boolean enderecoComercial) {
        this.enderecoComercial = enderecoComercial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Endereco)) return false;
        Endereco other = (Endereco) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.sobrenome==null && other.getSobrenome()==null) || 
             (this.sobrenome!=null &&
              this.sobrenome.equals(other.getSobrenome()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.rua==null && other.getRua()==null) || 
             (this.rua!=null &&
              this.rua.equals(other.getRua()))) &&
            ((this.numeroRua==null && other.getNumeroRua()==null) || 
             (this.numeroRua!=null &&
              this.numeroRua.equals(other.getNumeroRua()))) &&
            ((this.complemento==null && other.getComplemento()==null) || 
             (this.complemento!=null &&
              this.complemento.equals(other.getComplemento()))) &&
            ((this.bairro==null && other.getBairro()==null) || 
             (this.bairro!=null &&
              this.bairro.equals(other.getBairro()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep()))) &&
            ((this.pontoReferencia==null && other.getPontoReferencia()==null) || 
             (this.pontoReferencia!=null &&
              this.pontoReferencia.equals(other.getPontoReferencia()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            this.enderecoComercial == other.isEnderecoComercial();
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getSobrenome() != null) {
            _hashCode += getSobrenome().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getRua() != null) {
            _hashCode += getRua().hashCode();
        }
        if (getNumeroRua() != null) {
            _hashCode += getNumeroRua().hashCode();
        }
        if (getComplemento() != null) {
            _hashCode += getComplemento().hashCode();
        }
        if (getBairro() != null) {
            _hashCode += getBairro().hashCode();
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        if (getPontoReferencia() != null) {
            _hashCode += getPontoReferencia().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        _hashCode += (isEnderecoComercial() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Endereco.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Endereco"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sobrenome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sobrenome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rua");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rua"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRua");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumeroRua"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complemento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Complemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Bairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pontoReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PontoReferencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enderecoComercial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EnderecoComercial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
