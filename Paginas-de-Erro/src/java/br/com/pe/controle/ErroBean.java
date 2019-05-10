/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pe.controle;

import javax.faces.bean.ManagedBean;

/**
 *
 */
@ManagedBean
 public class ErroBean { 
    public void geraErro(){ 
        System.out.println(10/0); 
    } 
}
