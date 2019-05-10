/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.entidade;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author fabio
 */
@Entity
public class Jogador implements Serializable {
    @Id@GeneratedValue
    private Long id;
    private String nome, posicao;

    @Temporal(javax.persistence.TemporalType.DATE)
    private  Calendar dataNasc = new GregorianCalendar();
    @ManyToOne
    private Time time;

    public Jogador() {
    }

    public Jogador(long id, String nome, String posicao, Time time) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Calendar getDataNasc() {
        return dataNasc;
    }    
}