/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.converters;

import br.com.modelo.CPF;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Fabio Guedes
 * @since 21/02/2019 22:09
 * @version k19-conversao-e-validacao
 */
@FacesConverter (forClass = CPF.class )
public class ConversorDeCPF implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
            String value){
        
        value = value.trim();
        
        if(!Pattern.matches("[0-9]{9}-[0-9]{2}",value)){
            FacesMessage mensagem = new FacesMessage("Numero de CPF INVALIDO!");
            mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(mensagem);
        }
        
        String partesDoCPF[] = value.split("-");
        int  numeroDeIdentificacao = Integer.parseInt(partesDoCPF[0]);
        int primeiroDigitoVerificador = Integer.parseInt(partesDoCPF[1].substring(0, 1));
        int segundoDigitoVerificador = Integer.parseInt(partesDoCPF[1].substring(1, 2));
        
        CPF cpf = new CPF();
        cpf.setNumeroDeIdentificacao(numeroDeIdentificacao);
        cpf.setPrimeiroDigitoVerificador(primeiroDigitoVerificador);
        cpf.setSegundoDigitoVerificador(segundoDigitoVerificador);
        
        return cpf;
    }
    
    @Override
    public String getAsString(FacesContext context, UIComponent component,
            Object value){
        CPF cpf = (CPF) value;
        return cpf.getNumeroDeIdentificacao()+"-"+cpf.getPrimeiroDigitoVerificador()
                +cpf.getSegundoDigitoVerificador();
    }
}
