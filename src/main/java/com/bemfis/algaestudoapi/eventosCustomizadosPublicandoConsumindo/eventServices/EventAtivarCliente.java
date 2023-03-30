package com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices;

import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventModels.EventCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventAtivarCliente {
    @Autowired
    private ApplicationEventPublisher eventPublisher;
    public void ativar(EventCliente eventCliente){
        eventCliente.ativar();
        eventPublisher.publishEvent(eventCliente);
    }
}
