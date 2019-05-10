/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.modelo.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Fabio Guedes
 * @since 19/02/2019 23:54
 * @version K19-Escopos
 */
@ManagedBean
@SessionScoped
public class CarroBean {
    private final List<Carro> carros = new ArrayList<Carro>();
    
    private Carro carro = new Carro();
    
    public void adicionarCarro(){
        this.carros.add(this.carro);
        this.carro = new Carro();
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        return carros;
    }

   
}
