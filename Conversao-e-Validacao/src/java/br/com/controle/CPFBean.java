/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.modelo.CPF;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Fabio Guedes
 * @since 21/02/2019 22:30
 * @version k19-conversao-e-validacao
 */
@ManagedBean
public class CPFBean {
    private CPF cpf;

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }
    
}
