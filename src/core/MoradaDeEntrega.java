/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Tiago
 */
public class MoradaDeEntrega {
    
    
         private int moradaID;
         private int utilizadoresID;
    private String nome;
    private String rua;
    private String localidade;
    private String codigoPostal;
    private String contacto;
    private String infoAdicional;

    public MoradaDeEntrega(int moradaID, int utilizadoresID, String nome, String rua, String localidade, String codigoPostal, String contacto, String infoAdicional) {
        this.moradaID = moradaID;
        this.utilizadoresID = utilizadoresID;
        this.nome = nome;
        this.rua = rua;
        this.localidade = localidade;
        this.codigoPostal = codigoPostal;
        this.contacto = contacto;
        this.infoAdicional = infoAdicional;
    }

    public MoradaDeEntrega( String nome, String rua, String localidade, String codigoPostal, String contacto, String infoAdicional) {
        
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
        return "MoradaDeEntrega{" + "moradaID=" + moradaID + ", utilizadoresID=" + utilizadoresID+ ", nome=" + nome + ", rua=" + rua + ", localidade=" + localidade + ", codigoPostal=" + codigoPostal + ", contacto=" + contacto + ", infoAdicional=" + infoAdicional + '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
