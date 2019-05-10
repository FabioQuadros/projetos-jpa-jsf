/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import java.util.HashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 * 
 */
@ManagedBean
public class AutenticadorBean {
    private static final Map<String, String> mapa = new HashMap<String, String>();
    
    private String usuario, senha;
    
    static {
        AutenticadorBean.mapa.put("k19", "k19");
        AutenticadorBean.mapa.put("jonas.hirata", "jonas.hirata");
        AutenticadorBean.mapa.put("macelo.martins", "marcelo.martins");
        AutenticadorBean.mapa.put("fabio", "fabio.guedes");
    }
    
    public String autentica(){
        FacesContext fc = FacesContext.getCurrentInstance();
        
        if(AutenticadorBean.mapa.containsKey(this.usuario) &&
                AutenticadorBean.mapa.get(this.usuario).equals(this.senha)){
            
            ExternalContext ec = fc.getExternalContext();
            HttpSession session = (HttpSession)ec.getSession(false);
            session.setAttribute("usuario", this.usuario);
        return "/home";
        }else{
            FacesMessage fm = new FacesMessage("usuario e/ou senha invalidos");
            fm.setSeverity(FacesMessage.SEVERITY_ERROR);
            fc.addMessage(null, fm);
            return "/login";
        }
    }
    
    public String registraSaida(){
        FacesContext fc = FacesContext.getCurrentInstance();
        ExternalContext ec = fc.getExternalContext();
        HttpSession session = (HttpSession)ec.getSession(false);
        session.removeAttribute("usuario");
         return "/login";
    }

    public String getUsuario(){
        return usuario;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
}
