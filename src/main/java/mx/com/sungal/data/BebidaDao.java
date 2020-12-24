package mx.com.sungal.data;

import mx.com.sungal.domain.Bebida;
import org.springframework.data.repository.CrudRepository;

public interface BebidaDao extends CrudRepository<Bebida, Long>{
    
}
