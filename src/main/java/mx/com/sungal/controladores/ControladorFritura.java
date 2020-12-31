package mx.com.sungal.controladores;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.sungal.service.IService;
import mx.com.sungal.domain.Fritura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorFritura {
    
    @Autowired
    @Qualifier("FrituraService")
    IService frituraService;
    
    @GetMapping("/frituras.html")
    public String cargarFrituras(Model model){
        List<Fritura> frituras = (List) frituraService.listarObjeto();
        model.addAttribute("frituras", frituras);
        return "frituras";
    }
}
