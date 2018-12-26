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
public class Categorias {
    
    private int id;
    private String categoria;

    public Categorias(int id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public Categorias(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Categorias{" + "id=" + id + ", categoria=" + categoria + '}';
    }
    
    
    
    
}
