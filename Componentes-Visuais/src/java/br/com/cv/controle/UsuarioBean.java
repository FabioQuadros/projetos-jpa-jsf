/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cv.controle;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Fabio Guedes
 * @since 10/02/2019 02:38
 * @version k19-componentes-visuais
 */
@ManagedBean
public class UsuarioBean {
    private String nome;
    private int idade;

    public UsuarioBean() {
    }
    
    /** 
     * 
     * @param nome recebe o nome do usuario bean
     * @param idade recebe o idade do usuario bean
     */
    public UsuarioBean(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
