/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cv.controle;

import br.com.cv.modelo.Curso;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Fabio Guedes
 * @since 11/02/2019 03:27
 * @version k19-componentes-visuais
 */
@ManagedBean
@SessionScoped
public class CursosBean {
    private List<Curso> cursos = new ArrayList<>();
    private Curso curso = new Curso();
    
    public void adicionarCurso(){
        this.cursos.add(this.curso);
        this.curso = new Curso();
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
