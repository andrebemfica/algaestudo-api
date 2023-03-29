package com.bemfis.algaestudoapi.eventPublisherListener.eventServices.anotacoes;

import com.bemfis.algaestudoapi.eventPublisherListener.eventServices.enuns.NivelUrgencia;
import org.springframework.beans.factory.annotation.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoNotificador {
    NivelUrgencia value();
}
