package com.bemfis.algaestudoapi.eventosCustomizados.eventServices;

import com.bemfis.algaestudoapi.eventosCustomizados.eventModels.EventCliente;
import com.bemfis.algaestudoapi.eventosCustomizados.eventServices.anotacoes.EventTipoNotificador;
import com.bemfis.algaestudoapi.eventosCustomizados.eventServices.enuns.EventNivelUrgencia;
import com.bemfis.algaestudoapi.eventosCustomizados.eventServices.interfaces.EventNotificador;
import org.springframework.stereotype.Component;

@EventTipoNotificador(EventNivelUrgencia.URGENTE)
@Component
public class EventNotificadorEmail implements EventNotificador {
    public void notificar(EventCliente eventCliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s",
                eventCliente.getNome(), eventCliente.getEmail(), mensagem);
    }
}
