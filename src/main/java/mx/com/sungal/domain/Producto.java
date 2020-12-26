package mx.com.sungal.domain;

import javax.persistence.Id;
import lombok.Data;

@Data
public class Producto {
    
    
    @Id
    protected Integer id;
    protected String nombre;
    protected String marca;
    protected Float precio;
}
