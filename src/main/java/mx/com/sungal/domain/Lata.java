package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="lata")
public class Lata extends Producto implements Serializable{
    
    private static final Long serialVersionUID = 6L;
    
    private Float masa;
    private String descripcion;
    private Integer almacen;
}
