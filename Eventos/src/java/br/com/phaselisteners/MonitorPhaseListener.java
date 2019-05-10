/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.phaselisteners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author Fabio Guedes
 * @version eventos 1.0
 * @since 09/03/2019
 */
public class MonitorPhaseListener implements PhaseListener{

    @Override
    public void afterPhase(PhaseEvent event) {
        System.out.println("MonitorPhaseListener.afterPhase() - "+event.getPhaseId());
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        System.out.println("MonitorPhaseListener.beforePhase() - "+event.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}
