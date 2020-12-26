package mx.com.sungal.data;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.com.sungal.domain.Bebida;

public interface BebidaDao extends JpaRepository<Bebida, Integer>{
}
