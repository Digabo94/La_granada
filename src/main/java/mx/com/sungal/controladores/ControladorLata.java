package mx.com.sungal.controladores;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.sungal.domain.Lata;
import mx.com.sungal.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorLata {
    
    @Autowired
    @Qualifier("LataService")
    IService lataService;
    
    @GetMapping("/latas.html")
    public String cargarLatas(Model model){
        List<Lata> latas = (List) lataService.listarObjeto();
        model.addAttribute("latas", latas);
        return "latas";
    }
    
}
