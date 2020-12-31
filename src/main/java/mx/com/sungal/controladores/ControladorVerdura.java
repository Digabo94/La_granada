package mx.com.sungal.controladores;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.sungal.service.IService;
import mx.com.sungal.domain.Verdura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorVerdura {
    
    @Autowired
    @Qualifier("VerduraService")
    IService verduraService;
    
    @GetMapping("/verduras.html")
    public String cargarVerduras(Model model){
        List<Verdura> verduras = (List) verduraService.listarObjeto();
        model.addAttribute("verduras", verduras);
        return "verduras";
    }
}
