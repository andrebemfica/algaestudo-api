package com.bemfis.algaestudoapi.profilesPostConstPreDestr.email;

import com.bemfis.algaestudoapi.profilesPostConstPreDestr.notificador.Notificador;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Profile("prod")
@Component
public class Email implements Notificador {
    @Override
    public String notificador() {
        return "mensagem enviada por email";
    }

}
