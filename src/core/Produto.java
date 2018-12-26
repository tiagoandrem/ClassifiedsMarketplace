/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.File;
import java.sql.Date;
import java.util.Objects;
import javax.accessibility.AccessibleContext;

/**
 *
 * @author Tiago
 */
public class Produto {
    
    private int id;
    private String titulo;
    private String preco;
    private String descricao;
    private String categoria;   
    private String estado;
    private Date dataupload;
    private String fotografia;
    
     
     
    
  
    public Produto(int id, String titulo, String preco, String descricao, String categoria, String estado, Date dataupload, String fotografia) {
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
        this.descricao = descricao;
        this.categoria = categoria;
        this.estado = estado;
        this.dataupload = dataupload;
        this.fotografia = fotografia;
    }

    public Produto(String titulo, String preco, String descricao, String categoria, String estado, Date dataupload, String fotografia) {
        this.titulo = titulo;
        this.preco = preco;
        this.descricao = descricao;
        this.categoria = categoria;
        this.estado = estado;
        this.dataupload = dataupload;
        this.fotografia=fotografia;
    
    }

    public Produto() {
        
    }


    

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getDataupload() {
        return dataupload;
    }

    public void setDataupload(Date dataupload) {
        this.dataupload = dataupload;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", titulo=" + titulo + ", preco=" + preco + ", descricao=" + descricao + ", categoria=" + categoria + ", estado=" + estado + ", dataupload=" + dataupload + ", fotografia=" + fotografia + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.titulo);
        hash = 83 * hash + Objects.hashCode(this.preco);
        hash = 83 * hash + Objects.hashCode(this.descricao);
        hash = 83 * hash + Objects.hashCode(this.categoria);
        hash = 83 * hash + Objects.hashCode(this.estado);
        hash = 83 * hash + Objects.hashCode(this.dataupload);
        hash = 83 * hash + Objects.hashCode(this.fotografia);
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
        final Produto other = (Produto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.preco, other.preco)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.fotografia, other.fotografia)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.dataupload, other.dataupload)) {
            return false;
        }
        return true;
    }
    
    
    
    
}