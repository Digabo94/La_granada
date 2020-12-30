package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "verdura")
public class Verdura implements Serializable {

    /*Clase bean*/
    private static final Long serialVersionUID = 7L;

    @Id
    private Integer idVerdura;
    private Float almacen;
    protected String nombre;
    protected String marca;
    protected Float precio;
}
