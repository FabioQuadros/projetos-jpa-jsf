/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.repositorio;

import br.com.modelo.entidade.Jogador;
import br.com.modelo.entidade.Time;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


/**
 *
 * @author fabio
 */
public class TimeRepository {
 
    private EntityManager manager;

    public TimeRepository(EntityManager manager) {
        this.manager = manager;
    }
    
    public void adiciona(Time time){
        this.manager.persist(time);
    }
    
    public void remove(Long id){
        Time time = this.procura(id);
         Query query = this.manager.createQuery("select x from Jogador x where x.time = x.time");
        query.setParameter("time", time);
        List<Jogador> jogadores = query.getResultList();
        jogadores.forEach((jogador) -> {
            jogador.setTime(null);
        });
        this.manager.remove(time);
    }
    
    public Time atualiza(Time time){
        return this.manager.merge(time);
    }

    public Time procura(Long id) {
        return this.manager.find(Time.class, id); 
    }
    
    
}
