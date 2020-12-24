package mx.com.sungal.data;

import mx.com.sungal.domain.Fruta;
import org.springframework.data.repository.CrudRepository;

public interface FrutaDao extends CrudRepository<Fruta, Long>{
    
}
