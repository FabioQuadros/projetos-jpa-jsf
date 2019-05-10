/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.modelo.Funcionario;
import javax.faces.bean.ManagedBean;


/**
 *
 * @author fFabio Guedes
 * @since 21/02/2019 22:10
 * @version k19-conversao-e-validacao
 */
@ManagedBean
public class FuncionarioBean {
    private Funcionario funcionario = new Funcionario();

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}
