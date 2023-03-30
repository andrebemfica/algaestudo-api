package com.bemfis.algaestudoapi.eventosCustomizados.eventServices.interfaces;

import com.bemfis.algaestudoapi.eventosCustomizados.eventModels.EventCliente;
import org.springframework.stereotype.Component;

@Component
public interface EventNotificador {
    public void notificar (EventCliente eventCliente, String mensagem);
}
