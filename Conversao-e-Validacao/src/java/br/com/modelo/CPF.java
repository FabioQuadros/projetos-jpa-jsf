/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

/**
 *
 * @author Fabio Guedes
 * @since 21/02/2019 22:09
 * @version k19-conversao-e-validacao
 */
public class CPF {
    private int numeroDeIdentificacao;
    private int primeiroDigitoVerificador;
    private int segundoDigitoVerificador;

    public int getNumeroDeIdentificacao() {
        return numeroDeIdentificacao;
    }

    public void setNumeroDeIdentificacao(int numeroDeIdentificacao) {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
    }

    public int getPrimeiroDigitoVerificador() {
        return primeiroDigitoVerificador;
    }

    public void setPrimeiroDigitoVerificador(int primeiroDigitoVerificador) {
        this.primeiroDigitoVerificador = primeiroDigitoVerificador;
    }

    public int getSegundoDigitoVerificador() {
        return segundoDigitoVerificador;
    }

    public void setSegundoDigitoVerificador(int segundoDigitoVerificador) {
        this.segundoDigitoVerificador = segundoDigitoVerificador;
    }
    
    
}
