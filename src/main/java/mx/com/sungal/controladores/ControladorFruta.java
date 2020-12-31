package mx.com.sungal.controladores;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.sungal.service.IService;
import mx.com.sungal.domain.Fruta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorFruta {
    
    @Autowired
    @Qualifier("FrutaService")
    IService frutaService;
    
    @GetMapping("/frutas.html")
    public String cargarFrutas(Model model){
        List<Fruta> frutas = (List)frutaService.listarObjeto();
        model.addAttribute("frutas", frutas);
        return "frutas";
    }
}
