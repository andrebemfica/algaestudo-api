package com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices;

import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices.anotacoes.TipoNotificador;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventModels.Cliente;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices.enuns.NivelUrgencia;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.eventServices.interfaces.Notificador;
import org.springframework.stereotype.Component;

@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorSms implements Notificador {
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s por SMS através do telefone %s: %s",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
