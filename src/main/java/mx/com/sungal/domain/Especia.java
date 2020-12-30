package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "especia")
public class Especia implements Serializable {

    private static final Long serialVersionUID = 3L;

    @Id
    private Integer idEspecia;
    private Float almacen;
    protected String nombre;
    protected String marca;
    protected Float precio;
}
