/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabio Guedes
 * @version eventos 1.0
 * @since 09/03/2019
 */
public class Estado {
    private String nome;
    private String sigla;
    private List<String> cidades = new ArrayList<String>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<String> getCidades() {
        return cidades;
    }

    public void setCidades(List<String> cidades) {
        this.cidades = cidades;
    }
    
    
}
