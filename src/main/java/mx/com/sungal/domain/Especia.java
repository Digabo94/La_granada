package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;
import mx.com.sungal.domain.Producto;

@Data
@Entity
@Table(name="especia")
public class Especia extends Producto implements Serializable{
    
    private static final Long serialVersionUID = 3L;
    
    private Float almacen;
}
