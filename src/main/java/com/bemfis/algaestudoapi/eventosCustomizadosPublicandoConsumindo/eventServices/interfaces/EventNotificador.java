package com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.interfaces;

import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventModels.EventCliente;
import org.springframework.stereotype.Component;

@Component
public interface EventNotificador {
    public void notificar (EventCliente eventCliente, String mensagem);
}
