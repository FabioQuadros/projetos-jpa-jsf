/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Fabio Guedes
 * @since 21/02/2019 22:08
 * @version k19-conversao-e-validacao
 */
public class Funcionario {
    @NotNull
    @Min(value = 0)
    private Double salario;
    @NotNull
    @Min(5)
    @Max(19)
    private Integer codigo;
    @NotNull
    private Date aniversario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }
    
    
}
