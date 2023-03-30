package com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices;

import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices.anotacoes.TipoNotificador;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventModels.Cliente;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices.enuns.NivelUrgencia;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices.interfaces.Notificador;
import org.springframework.stereotype.Component;
@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
