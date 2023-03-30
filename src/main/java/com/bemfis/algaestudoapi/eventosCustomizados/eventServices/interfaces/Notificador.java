package com.bemfis.algaestudoapi.eventosCustomizados.eventServices.interfaces;

import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambModels.DesambCliente;
import org.springframework.stereotype.Component;

@Component
public interface Notificador {
    public void notificar (DesambCliente desambCliente, String mensagem);
}
