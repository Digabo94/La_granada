package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import mx.com.sungal.domain.Producto;

@Data
@Entity
@Table(name="fritura")
public class Fritura extends Producto implements Serializable{
    
    private static final Long serialVersionUID = 4L;
    
    private Float masa;
    private Integer almacen;
}
