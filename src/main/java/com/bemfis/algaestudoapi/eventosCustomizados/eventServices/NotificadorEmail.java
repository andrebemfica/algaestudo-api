package com.bemfis.algaestudoapi.eventosCustomizados.eventServices;

import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambModels.DesambCliente;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.anotacoes.TipoNotificador;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.enuns.NivelUrgencia;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.interfaces.Notificador;
import org.springframework.stereotype.Component;

@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {
    public void notificar(DesambCliente desambCliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s",
                desambCliente.getNome(), desambCliente.getEmail(), mensagem);
    }
}
