package com.bemfis.algaestudoapi.profilesPostConstPreDestr.profilesCtrl;

import com.bemfis.algaestudoapi.profilesPostConstPreDestr.email.Email;
import com.bemfis.algaestudoapi.profilesPostConstPreDestr.notificador.Notificador;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProfilesController {
    //@Autowired
    private Notificador notificador = new Email();
    @PostConstruct
    public void hum() {
        System.out.println("INIT " + notificador);
    }
    @PreDestroy
    public void dois() {
        System.out.println("Destroy");
    }
    @GetMapping("/hello")
    @ResponseBody
    public String Hello() {
        return notificador.notificador();
    }
}
