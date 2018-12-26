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
public class Utilizador {
    
    private int id;
    private String nome;
    private String morada;
    private String email;
    private String utilizador;
    private String password;
    
    
    public Utilizador (int uid, String unome, String umorada, String uemail, String uutilizador, String upassword){
        
        
        this.id=uid;
        this.nome=unome;
        this.morada=umorada;
        this.email=uemail;
        this.utilizador=uutilizador;
        this.password=upassword;
        
        
        
        
    }

    public Utilizador(int aInt, String string, String string0) {
     }

    public Utilizador() {
      }

    public Utilizador(String string, String string0) {
      }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(String utilizador) {
        this.utilizador = utilizador;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
//    public int adicionaLoja(Loja lj) throws ObjetoDuplicadoException, TamanhoInvalidoException {
//        if(existeLoja(lj)){
//            throw new ObjetoDuplicadoException("Essa loja já existe");
//        }else{
//            if(lj.getTamanho() > getEspacoLivre()){
//                throw new TamanhoInvalidoException("Impossivel adicionar loja. "
//                        + "Tamanho insuficiente. \nTamanho da loja: " + lj.getTamanho() + " Espaço disponivel: " + getEspacoLivre());
//            }else{
//                if (lojas.add(lj)) {
//                    return 1;
//                } else {
//                    return -2;
//                }
//            }
//        }
//    }    
  
    


    private boolean existeProdutos(Produto ps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}