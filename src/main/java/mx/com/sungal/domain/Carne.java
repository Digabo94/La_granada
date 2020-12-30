package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "carne")
public class Carne implements Serializable {

    private static final Long serialVersionUID = 2L;

    @Id
    private Integer idCarne;
    private Float almacen;
    protected String nombre;
    protected String marca;
    protected Float precio;

}
