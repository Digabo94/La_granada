package mx.com.sungal.controladores;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.sungal.service.IService;
import mx.com.sungal.domain.Especia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorEspecia {
    
    @Autowired
    @Qualifier("EspeciaService")
    IService especiaService;
    
    @GetMapping("/especias.html")
    public String cargarEspecias(Model model){
        List<Especia> especias = (List) especiaService.listarObjeto();
        model.addAttribute("especias", especias);
        return "especias";
    }
}
