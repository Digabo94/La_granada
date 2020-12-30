package mx.com.sungal.controladores;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.sungal.service.IService;
import mx.com.sungal.domain.Bebida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class ControladorBebidas {
    
    @Autowired
    @Qualifier("BebidaService")
    IService bebidaService;
    
    @GetMapping("/bebidas.html")
    public String cargarBebidas(Model model){
        List<Bebida> bebidas = (List) bebidaService.listarObjeto();
        model.addAttribute("bebidas", bebidas);
        return "bebidas";
    }
}
