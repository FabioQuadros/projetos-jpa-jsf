/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Fabio Guedes
 * @version eventos 1.0
 * @since 09/03/2019
 */
@ManagedBean
public class BotaoBean {
    public void sorteiaBotao(ActionEvent event){
        UIComponent formulario = event.getComponent().getParent();
        
        UIComponent botaoJonas = formulario.findComponent("botao-jonas");
        UIComponent botaoMarcelo = formulario.findComponent("botao-marcelo");
        UIComponent botaoFabio = formulario.findComponent("botao-fabio");
        
        botaoJonas.getAttributes().put("disabled", true);
        botaoMarcelo.getAttributes().put("disabled", true);
        botaoFabio.getAttributes().put("disabled", true);
        
        double numero = Math.random();
        
        if(numero < 1.0/3.0){
            botaoJonas.getAttributes().put("disabled", false);
        }else if(numero < 2.0/3.0){
            botaoMarcelo.getAttributes().put("disabled", false);
        } else{
            botaoFabio.getAttributes().put("disabled", false);
        }
    }
}
