package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;




@Data
@Entity
@Table(name="bebida")
public class Bebida implements Serializable{
    
    private static final Long serialVersioUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBebida;
    private String nombre;
    private String sabor;
    
    
}
