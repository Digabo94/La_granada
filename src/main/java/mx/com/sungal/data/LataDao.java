package mx.com.sungal.data;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.com.sungal.domain.Lata;


public interface LataDao extends JpaRepository<Lata, Integer>{
    
}
