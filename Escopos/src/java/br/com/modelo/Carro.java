/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

/**
 *
 * @author Fabio Guedes
 * @since 19/02/2019 23:52
 * @version K19-Escopos
 */
public class Carro {
    private String marca;
    private String modelo;

    public Carro() {
    }
    /**
     * 
     * @param marca recebe a marca do veiculo
     * @param modelo recebe o modelo do veiculo
     */
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
        
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
