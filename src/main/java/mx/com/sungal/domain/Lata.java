package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "lata")
public class Lata implements Serializable {

    private static final Long serialVersionUID = 6L;

    @Id
    private Integer idLata;
    private String masa;
    private String descripcion;
    private Integer almacen;
    protected String nombre;
    protected String marca;
    protected Float precio;
}
