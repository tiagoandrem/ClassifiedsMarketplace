/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_interface;

import Graphical.DlgMostraProduto;
import core.Categorias;
import core.Estado;
import core.Login;
import core.MoradaDeEntrega;
import core.MoradaDeRecolha;
import core.MostrarProduto;
import core.Produto;
import core.Registo;
import core.Utilizador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Efa
 */
public class MysqlDBWorker {
    public Connection criaLigacao() throws SQLException {
        
        Connection con = null;

        String baseDados = "teste";
        String servidor = "localhost";
        String user = "root";
        String password1 = "123456";
        
        String url = "jdbc:mysql://" + servidor + ":3306/" + baseDados + "?autoReconnect=true&useSSL=false";
        
        con = DriverManager.getConnection(url, user, password1);
        
        return con;
    }
    
    
    public int insereRegisto(Registo reg) throws SQLException {
        Statement st = criaLigacao().createStatement();
        
        String sc = "INSERT INTO t_utilizadores (nome, email, password)" +
                        " VALUES('"+reg.getNome() + "', '"+reg.getEmail()+"', '"+reg.getPassword()+"')";
        
        return st.executeUpdate(sc);
    }
    
    
    
    public Utilizador buscaLogin(Login log) throws SQLException {
        Statement st = criaLigacao().createStatement();
     
        String sc = "SELECT * From t_utilizadores WHERE email = '"+log.getEmail()+"'  AND password ='"+log.getPassword()+"'";
        ResultSet rs = st.executeQuery(sc);   
        
        Utilizador u = null;
        
        if(rs.next()){
            u = new Utilizador( rs.getString("email"),rs.getString("password"));
        }
        
        return u;
    }
    
//    public int insereProdutos (Produto prod) throws SQLException {
//        Statement st = criaLigacao().createStatement();
//        
//        String sc = "INSERT INTO t_produtos (titulo, preco, descricao)" +
//                        " VALUES('"+prod.getTitulo() + "','"+prod.getPreco() + "','"+prod.getDescricao() + "')";
//        
//        return st.executeUpdate(sc);
        
        
        
    public int insereProdutos (Produto prod) throws SQLException {
        Statement st = criaLigacao().createStatement();
        
        String sc = "INSERT INTO t_produtos (titulo, preco, descricao, categorias, estado, fotografia, dataupload)" +
                        " VALUES('"+prod.getTitulo()+ "','"+prod.getPreco() + "','"+prod.getDescricao() + "','"+prod.getEstado()+ "','"+prod.getCategoria()+"','"+
                            prod.getFotografia()+ "','"+prod.getDataupload()+"')";
        
             System.out.println(sc);
        
        return st.executeUpdate(sc);
                            
       

                        
    }
    
//    public ResultSet dbCategorias(Categorias cat) throws SQLException {
//        Statement st = criaLigacao().createStatement();
//        
//        
//        String sc = "SELECT * From 'categorias' WHERE categoria = '"+cat.getCategoria()+"'";
//        
//              
//        
//        
//        return st.executeQuery(sc);
//    }
//    
//    public Categorias dbEstado(Estado est) throws SQLException {
//        Statement st = criaLigacao().createStatement();
//        
//        
//        String sc = "SELECT * From 'estado' WHERE categoria = '"+est+"'";
//        ResultSet rs = st.executeQuery(sc);
//              
//        if (rs.next()){
//            
//            Categorias ct = new Categorias(rs.getString("categoria"));
//            return ct;
//        }
        
        
        
//        return null;
        
//    }

    public Produto getProduto(int mst) throws SQLException {
        Statement st = criaLigacao().createStatement();
        
        String sc = "SELECT * FROM t_produtos WHERE produtoID = '" + mst + "'"; 
        ResultSet rs = st.executeQuery(sc);
        
        if(rs.next()){
            Produto p = new Produto(rs.getInt("produtoID") , rs.getString("titulo"),rs.getString("preco"),rs.getString("estado"), rs.getString("categorias"), rs.getString("descricao"), rs.getDate("dataupload"), rs.getString("fotografia"));
            return p;
        }
        
        return null;
    }
    
    public ArrayList<Produto> getAllProducts() throws SQLException{
        ArrayList<Produto> products = new ArrayList<>();
        Statement st = criaLigacao().createStatement();
        
        String sc = "SELECT * FROM t_produtos"; 
        ResultSet rs = st.executeQuery(sc);
        
        while(rs.next()){
            Produto p = new Produto(rs.getInt("produtoID") , rs.getString("titulo"),rs.getString("preco"),rs.getString("estado"), rs.getString("categorias"), rs.getString("descricao"), rs.getDate("dataupload"), rs.getString("fotografia"));
            products.add(p);
        }
       
        return products;
    }
    
    public ArrayList<Utilizador> getAllUtilizadores () throws SQLException{
        
        ArrayList <Utilizador> buscaUtilizador = new ArrayList<>();
        
        Statement st = criaLigacao().createStatement();
        
        String sc = "SELECT * FROM t_utilizadores"; 
        ResultSet rs = st.executeQuery(sc);
        
        while(rs.next()){
            
            Utilizador u = new Utilizador(  rs.getString("nome"), rs.getString("email"));
            buscaUtilizador.add (u);   
        
        }
        
        return buscaUtilizador;
    }

    public int insereMoradaDeEntrega (MoradaDeEntrega ment) throws SQLException {
        Statement st = criaLigacao().createStatement();
        
        String sc = "INSERT INTO moradadeentrega (utilizadoresID, nome, rua, localidade, codigoPostal, contacto, infoAdicional)" +
                        " VALUES('"+ment.getUtilizadoresID()+"','"+ment.getNome()+ "','"+ment.getRua()+ "','"+ment.getLocalidade() + "','"+ment.getCodigoPostal()+ "','"+ment.getContacto()+"','"+
                            ment.getInfoAdicional()+"')";
        
             System.out.println(sc);
        
        return st.executeUpdate(sc);
    }
    
    public int insereMoradaDeRecolha (MoradaDeRecolha mor) throws SQLException {
        Statement st = criaLigacao().createStatement();
        
        String sc = "INSERT INTO moradaderecolha (utilizadoresID, nome, rua, localidade, codigoPostal, contacto, infoAdicional)" +
                        " VALUES('" +mor.getUtilizadoresID()+ "','"+mor.getNome()+ "','"+mor.getRua()+ "','"+mor.getLocalidade() + "','"+mor.getCodigoPostal()+ "','"+mor.getContacto()+"','"+
                            mor.getInfoAdicional()+"')";
        
             System.out.println(sc);
        
        return st.executeUpdate(sc);
    }

    public ArrayList<Produto> getProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void buscaLogin() {
        }

    
   
}