package com.bemfis.algaestudoapi.eventosCustomizados.eventServices.anotacoes;

import com.bemfis.algaestudoapi.eventosCustomizados.eventServices.enuns.EventNivelUrgencia;
import org.springframework.beans.factory.annotation.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface EventTipoNotificador {
    EventNivelUrgencia value();
}
