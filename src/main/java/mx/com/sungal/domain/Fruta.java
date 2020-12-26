package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "fruta")
public class Fruta extends Producto implements Serializable {

    /*Clase bean*/
    private static final Long serialVersionUID = 5L;
    
    private Float almacen;
}
