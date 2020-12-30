package mx.com.sungal.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "fruta")
public class Fruta implements Serializable {

    /*Clase bean*/
    private static final Long serialVersionUID = 5L;

    @Id
    private Integer idFruta;
    private Float almacen;
    private String nombre;
    private String marca;
    private Float precio;
}
