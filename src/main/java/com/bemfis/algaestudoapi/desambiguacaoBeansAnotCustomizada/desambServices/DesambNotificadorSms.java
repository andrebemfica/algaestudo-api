package com.bemfis.algaestudoapi.desambiguacaoBeansAnotCustomizada.desambServices;

import com.bemfis.algaestudoapi.desambiguacaoBeansAnotCustomizada.desambServices.anotacoes.DesambTipoNotificador;
import com.bemfis.algaestudoapi.desambiguacaoBeansAnotCustomizada.desambModels.DesambCliente;
import com.bemfis.algaestudoapi.desambiguacaoBeansAnotCustomizada.desambServices.enuns.DesambNivelUrgencia;
import com.bemfis.algaestudoapi.desambiguacaoBeansAnotCustomizada.desambServices.interfaces.DesambNotificador;
import org.springframework.stereotype.Component;

@DesambTipoNotificador(DesambNivelUrgencia.SEM_URGENCIA)
@Component
public class DesambNotificadorSms implements DesambNotificador {
    public void notificar(DesambCliente desambCliente, String mensagem) {
        System.out.printf("Notificando %s por SMS através do telefone %s: %s",
                desambCliente.getNome(), desambCliente.getTelefone(), mensagem);
    }
}
