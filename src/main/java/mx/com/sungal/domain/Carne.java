package mx.com.sungal.domain;

import mx.com.sungal.domain.padre.Producto;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="carne")
public class Carne extends Producto implements Serializable{
    
    private static final Long serialVersionUID = 2L;
    
    private Float almacen;
    
}
