package com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices;

import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventModels.EventCliente;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.anotacoes.EventTipoNotificador;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.enuns.EventNivelUrgencia;
import com.bemfis.algaestudoapi.eventosCustomizadosPublicandoConsumindo.eventServices.interfaces.EventNotificador;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@EventTipoNotificador(EventNivelUrgencia.URGENTE)
@Component
public class EventNotificadorEmail implements EventNotificador {
    @Value("${notificador.email.host-servidor}")
    private String host;
    @Value("${notidicador.email.porta-servidor}")
    private Integer porta;
    public void notificar(EventCliente eventCliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s",
                eventCliente.getNome(), eventCliente.getEmail(), mensagem);

        System.out.println("Host: " + host);
        System.out.println("Porta: " + porta);
    }
}
