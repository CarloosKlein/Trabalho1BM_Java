/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.model;

import java.util.ArrayList;

/**
 *
 * @author CarllosK
 */
public class Produto {
    
    private int Codigo;
    private String Nome;
    private String Cat;
    ArrayList<Produto> ListaProd;

    public Produto() {
    }
   

    public Produto(int Codigo, String Nome, String Categoria) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Cat = Categoria;
        ListaProd = new ArrayList();
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCat() {
        return Cat;
    }

    public void setCat(String Cat) {
        this.Cat = Cat;
    }

    public ArrayList<Produto> getListaProd() {
        return ListaProd;
    }

    public void setListaProd(ArrayList<Produto> ListaProd) {
        this.ListaProd = ListaProd;
    }    
    
}
