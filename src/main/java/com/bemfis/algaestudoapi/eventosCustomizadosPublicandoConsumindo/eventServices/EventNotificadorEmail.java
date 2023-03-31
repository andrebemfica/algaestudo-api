package com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices;

import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventModels.EventCliente;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventProperties.EventProperties;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.anotacoes.EventTipoNotificador;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.enuns.EventNivelUrgencia;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.interfaces.EventNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@EventTipoNotificador(EventNivelUrgencia.URGENTE)
@Component
public class EventNotificadorEmail implements EventNotificador {
    @Autowired
    private EventProperties properties;

    public void notificar(EventCliente eventCliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s",
                eventCliente.getNome(), eventCliente.getEmail(), mensagem);

        System.out.println("Host: " + properties.getHostServidor());
        System.out.println("Porta: " + properties.getPortaServidor());
    }
}
