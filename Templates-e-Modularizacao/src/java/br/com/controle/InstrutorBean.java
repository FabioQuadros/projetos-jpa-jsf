/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.modelo.Instrutor;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Fabio Guedes
 * @version K19-Templates-Modularizacao
 * @since 16/02/2019 02:01
 */
@ManagedBean
public class InstrutorBean {
    private List<Instrutor> instrutores = new ArrayList<Instrutor>();
    
    public InstrutorBean(){
        Instrutor rafael = new Instrutor();
        rafael.setNome("Rafael Cosentino");
        rafael.setDataNascimento("30/10/1984");
        
        Instrutor marcelo = new Instrutor();
        marcelo.setNome("Marcelo Martins");
        marcelo.setDataNascimento("02/04/1985");
        
        this.instrutores.add(rafael);
        this.instrutores.add(marcelo);
    }
    
    public List<Instrutor> getInstrutores(){
        return instrutores;
    }
    
    public void setInstrutores(List<Instrutor> instrutores){
        this.instrutores = instrutores;
    }
}
