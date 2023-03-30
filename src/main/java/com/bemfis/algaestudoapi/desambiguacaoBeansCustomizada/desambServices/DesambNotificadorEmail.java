package com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices;

import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.anotacoes.DesambTipoNotificador;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambModels.DesambCliente;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.enuns.DesambNivelUrgencia;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.interfaces.DesambNotificador;
import org.springframework.stereotype.Component;
@DesambTipoNotificador(DesambNivelUrgencia.URGENTE)
@Component
public class DesambNotificadorEmail implements DesambNotificador {
    public void notificar(DesambCliente desambCliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s",
                desambCliente.getNome(), desambCliente.getEmail(), mensagem);
    }
}
