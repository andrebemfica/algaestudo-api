package com.bemfis.algaestudoapi.eventPublisherListener.eventServices.interfaces;

import com.bemfis.algaestudoapi.eventPublisherListener.eventModels.Cliente;
import org.springframework.stereotype.Component;

@Component
public interface Notificador {
    public void notificar (Cliente cliente, String mensagem);
}
