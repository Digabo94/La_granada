package mx.com.sungal.data;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.com.sungal.domain.Especia;

public interface EspeciaDao extends JpaRepository<Especia, Integer>{
    
}
