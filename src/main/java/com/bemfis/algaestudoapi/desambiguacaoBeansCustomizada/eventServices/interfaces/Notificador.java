package com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices.interfaces;

import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventModels.Cliente;
import org.springframework.stereotype.Component;

@Component
public interface Notificador {
    public void notificar (Cliente cliente, String mensagem);
}
