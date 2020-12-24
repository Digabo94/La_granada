package mx.com.sungal;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import mx.com.sungal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import mx.com.sungal.domain.*;

@Controller
@Slf4j
public class Controlador {

    @Autowired
    @Qualifier("FrutaService")
    IService servicioFruta;

    @Autowired
    @Qualifier("VerduraService")
    IService servicioVerdura;

    @Autowired
    @Qualifier("BebidaService")
    IService servicioBebida;

    @GetMapping("/")
    public String inicioControlador(Model model) {

        String firstString = "Hola hola test";

        model.addAttribute("firstString", firstString);

        return "index";
    }

    @GetMapping("/frutas.html")
    public String seccionFrutas(Model model) {
        List<Fruta> frutas = (List) servicioFruta.listarObjeto();
        model.addAttribute("frutas", frutas);
        return "frutas";
    }

    @GetMapping("/verduras.html")
    public String seccionVerduras(Model model) {
        List<Verdura> verduras = (List) servicioVerdura.listarObjeto();
        model.addAttribute("verduras", verduras);
        return "verduras";
    }

    @GetMapping("/bebidas.html")
    public String seccionBebidas(Model model) {
        List<Bebida> bebidas = (List) servicioBebida.listarObjeto();
        model.addAttribute("bebidas", bebidas);
        return "bebidas";
    }
    @GetMapping("/frame1.html")
    public String seccionFrame1() {
        return "frame1";
    }
}
