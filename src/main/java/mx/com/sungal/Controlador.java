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
        return "index";
    }

    @GetMapping("/verduras_frutas.html")
    public String seccionFrutas(Model model) {
        List<Fruta> frutas = (List) servicioFruta.listarObjeto();
        model.addAttribute("frutas", frutas);
        return "verduras_frutas";
    }

    @GetMapping("/carnes.html")
    public String seccionVerduras(Model model) {
        List<Verdura> verduras = (List) servicioVerdura.listarObjeto();
        model.addAttribute("verduras", verduras);
        return "carnes";
    }

    @GetMapping("/bebidas_frituras.html")
    public String seccionBebidas(Model model) {
        List<Bebida> bebidas = (List) servicioBebida.listarObjeto();
        model.addAttribute("bebidas", bebidas);
        return "bebidas_frituras";
    }

    @GetMapping("/latas.html")
    public String seccionFrame1() {
        return "latas";
    }

    @GetMapping("/especias.html")
    public String seccionEspecias() {
        return "especias";
    }

    @GetMapping("/pedido.html")
    public String seccionPedido() {
        return "pedido";
    }
}
