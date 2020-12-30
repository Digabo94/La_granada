package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bebida")
public class Bebida implements Serializable {

    /*Clase bean*/
    private static final Long serialVersioUID = 1L;

    @Id
    private Integer idBebida;
    private String descripcion;
    private String volumen;
    private Integer almacen;
    protected String nombre;
    protected String marca;
    protected Float precio;

}
