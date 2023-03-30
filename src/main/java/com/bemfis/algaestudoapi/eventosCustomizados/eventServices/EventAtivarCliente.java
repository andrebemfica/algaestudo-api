package com.bemfis.algaestudoapi.eventosCustomizados.eventServices;

import com.bemfis.algaestudoapi.eventosCustomizados.eventModels.EventCliente;
import com.bemfis.algaestudoapi.eventosCustomizados.eventServices.anotacoes.EventTipoNotificador;
import com.bemfis.algaestudoapi.eventosCustomizados.eventServices.enuns.EventNivelUrgencia;
import com.bemfis.algaestudoapi.eventosCustomizados.eventServices.interfaces.EventNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventAtivarCliente {
    @EventTipoNotificador(EventNivelUrgencia.URGENTE)
    @Autowired
    EventNotificador eventNotificador;
    public void ativar(EventCliente eventCliente){
        eventCliente.ativar();
        eventNotificador.notificar(eventCliente, "Seu cadastro no sistema está ativo!");
    }
}
