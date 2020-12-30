package mx.com.sungal.controladores;

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


    @GetMapping("/")
    public String inicioControlador() {
        return "index";
    }

}
