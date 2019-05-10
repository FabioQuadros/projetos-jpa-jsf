/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Fabio Guedes
 * @since 19/02/2019 17:27
 * @version k19-Navegacao
 */
@ManagedBean
public class CaraOuCoroaBean {
    public String proxima(){
        if (Math.random()<0.5) {
            return "cara";
        } else{
            return "coroa";
        }
    }
}
