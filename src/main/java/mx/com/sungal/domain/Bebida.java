package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import mx.com.sungal.domain.padre;

@Data
@Entity
@Table(name = "bebida")
public class Bebida extends Producto implements Serializable {

    /*Clase bean*/

    private static final Long serialVersioUID = 1L;


    private Float volumen;
    private Integer almacen;
    
}


