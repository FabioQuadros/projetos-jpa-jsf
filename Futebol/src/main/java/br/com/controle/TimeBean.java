/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.modelo.entidade.Time;
import br.com.modelo.repositorio.TimeRepository;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author fabio
 */
@ManagedBean
public class TimeBean {
    
    private Time time;
    private List<Time> times;

    public List<Time> getTimes() {
        return times;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }
    
    
    
    public void adiciona(){
        EntityManager manager = this.getManager();
        TimeRepository repository = new TimeRepository(manager);
        if(this.time.getId() == null){
            repository.adiciona(this.time);
        } else{
            repository.atualiza(this.time);
        }
        this.time = new Time();
        this.times = null;
    }
    
    public void preparaAlteracao(){
        Map<String, String> params =
                FacesContext.getCurrentInstance().getExternalContext().
                getRequestParameterMap();
        Long id = Long.parseLong(params.get("id"));
        EntityManager manager = this.getManager();
        TimeRepository repository = new TimeRepository(manager);
        this.time = repository.procura(id);
    }
    
    public void remove(){
        Map<String, String> params = 
                FacesContext.getCurrentInstance().getExternalContext().
                getRequestParameterMap();
        Long id = Long.parseLong(params.get("id"));
        EntityManager manager = this.getManager();
        TimeRepository repository = new TimeRepository(manager);
        repository.remove(id);
        this.times = null;
    }
    
    

    private EntityManager getManager() {
        FacesContext fc = FacesContext.getCurrentInstance();
        ExternalContext ec = fc.getExternalContext();
        HttpServletRequest request = (HttpServletRequest) ec.getRequest();
        return (EntityManager) request.getAttribute("EntityManager");
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }    
}