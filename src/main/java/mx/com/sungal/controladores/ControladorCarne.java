package mx.com.sungal.controladores;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.sungal.domain.Carne;
import mx.com.sungal.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorCarne {
    
    @Autowired
    @Qualifier("CarneService")
    IService carneService;
    
    @GetMapping("/carnes.html")
    public String cargarCarnes(Model model){
        List<Carne> carnes = (List)carneService.listarObjeto();
        model.addAttribute("carnes", carnes);
        return "carnes";
    }
}
