/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.dao;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import projeto.model.Produto;
/**
 *
 * @author CarllosK
 */
public class ProdutoDAO {
    
private ArrayList<Produto> ListaProd = new ArrayList<Produto>();


    public void addProduto(Produto p) {
        ListaProd.add(p);
    }

    public Produto removeProduto(int index) {
        return ListaProd.remove(index);
    }

    public Produto editarProduto(int index) {
        return ListaProd.get(index);
    }

    public int getTotal() {
        return ListaProd.size();
    }

    public ArrayList<Produto> listaGeral() {
        return ListaProd;
    }
   
    public Produto pequisaProduto(String nome, List<Produto> listaProduto) {
        for (int i = 0; i < listaProduto.size(); i++) {
            if(listaProduto.get(i).getNome().equals(nome)) {
                return listaProduto.get(i);               
            }
        }
        return null;
    }

}
