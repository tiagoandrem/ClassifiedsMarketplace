/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.Objects;

/**
 *
 * @author Tiago
 */
public class MoradaDeRecolha {
    
    private int moradaID;
    private int utilizadoresID;
    private String nome;
    private String rua;
    private String localidade;
    private String codigoPostal;
    private String contacto;
    private String infoAdicional;

    public MoradaDeRecolha(int moradaID, int utilizadoresID,  String nome, String rua, String localidade, String codigoPostal, String contacto, String infoAdicional) {
        this.moradaID = moradaID;
        this.utilizadoresID = utilizadoresID;
        this.nome = nome;
        this.rua = rua;
        this.localidade = localidade;
        this.codigoPostal = codigoPostal;
        this.contacto = contacto;
        this.infoAdicional = infoAdicional;
    }

    public MoradaDeRecolha( String nome, String rua, String localidade, String codigoPostal, String contacto, String infoAdicional) {
        
        this.nome = nome;
        this.rua = rua;
        this.localidade = localidade;
        this.codigoPostal = codigoPostal;
        this.contacto = contacto;
        this.infoAdicional = infoAdicional;
    }

  
    

    public int getMoradaID() {
        return moradaID;
    }

    public void setMoradaID(int moradaID) {
        this.moradaID = moradaID;
    }
    
    public int getUtilizadoresID() {
        return utilizadoresID;
    }

    public void setUtilizadoresID(int utilizadoresID) {
        this.utilizadoresID = utilizadoresID;
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    @Override
    public String toString() {
        return "MoradaDeRecolha{" + "moradaID=" + moradaID + ", nome=" + nome + ", rua=" + rua + ", localidade=" + localidade + ", codigoPostal=" + codigoPostal + ", contacto=" + contacto + ", infoAdicional=" + infoAdicional + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.moradaID;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.rua);
        hash = 59 * hash + Objects.hashCode(this.localidade);
        hash = 59 * hash + Objects.hashCode(this.codigoPostal);
        hash = 59 * hash + Objects.hashCode(this.contacto);
        hash = 59 * hash + Objects.hashCode(this.infoAdicional);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MoradaDeRecolha other = (MoradaDeRecolha) obj;
        if (this.moradaID != other.moradaID) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.localidade, other.localidade)) {
            return false;
        }
        if (!Objects.equals(this.codigoPostal, other.codigoPostal)) {
            return false;
        }
        if (!Objects.equals(this.contacto, other.contacto)) {
            return false;
        }
        if (!Objects.equals(this.infoAdicional, other.infoAdicional)) {
            return false;
        }
        return true;
    }


    
    
    
    
}
