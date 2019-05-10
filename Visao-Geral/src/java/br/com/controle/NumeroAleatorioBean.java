/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Fábio Guedes
 * @since 06/02/2019
 * @version K19 V.Geral
 */
@ManagedBean
public class NumeroAleatorioBean {
    private int maximo;
    private int numeroAleatorio;
    
    /**
     *@return retornaum numero aleatorio entre zero e o numero enviado
     * pelo usuario
     */
    public String geraNumeroAleatorio() {  
        this.numeroAleatorio = (int) (Math.random() * this.maximo);
        return "resposta";
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }
    
    
}
