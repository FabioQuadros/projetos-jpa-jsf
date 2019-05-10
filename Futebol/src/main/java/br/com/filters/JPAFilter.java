/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.filters;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author Fabio Guedes
 * @since 16/04/2019 19:30
 * @version 1.2 Futebol JSF
 */
@WebFilter (servletNames = {"Faces Servlet"})
public class JPAFilter implements Filter{

    private EntityManagerFactory factoriy;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.factoriy = Persistence.createEntityManagerFactory("Futebol-PU");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        
        EntityManager manager = this.factoriy.createEntityManager();
        request.setAttribute("EntityManager", manager);
        manager.getTransaction().begin();
        
        chain.doFilter(request, response);
        try {
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        }finally{
            manager.close();
        }
    }

    @Override
    public void destroy() {
        this.factoriy.close();
    }
    
}
