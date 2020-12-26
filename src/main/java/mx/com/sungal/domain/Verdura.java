package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "verdura")
public class Verdura extends Producto implements Serializable {

    /*Clase bean*/
    private static final Long serialVersionUID = 7L;

    private Float almacen;
}
