package com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambCtrl;

import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambModels.DesambCliente;
import com.bemfis.algaestudoapi.desambiguacaoBeansCustomizada.desambServices.DesambAtivarCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DesambCtrl {
    @Autowired
    private DesambAtivarCliente desambAtivarCliente;
    @GetMapping("/teste")
    @ResponseBody
    public String teste(){
        DesambCliente bemfica = new DesambCliente("André", "acb@gmail.com", "980690022");
        desambAtivarCliente.ativar(bemfica);
        return "Teste ok!";
    }
}
