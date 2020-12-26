package mx.com.sungal.data;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.com.sungal.domain.Carne;

public interface CarneDao extends JpaRepository<Carne, Integer>{
}
