package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "fritura")
public class Fritura implements Serializable {

    private static final Long serialVersionUID = 4L;

    @Id
    private Integer idFritura;
    private String masa;
    private Integer almacen;
    protected String nombre;
    protected String marca;
    protected Float precio;
}
